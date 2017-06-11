package ifmo.ctddev.lab4;

import ifmo.ctddev.lab4.antlr.GrammarOfGrammarBaseListener;
import ifmo.ctddev.lab4.antlr.GrammarOfGrammarLexer;
import ifmo.ctddev.lab4.antlr.GrammarOfGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class Generator {
    private String GEN_PATH = "src/ifmo/ctddev/lab4/generated/";
    private String LEXER = "Lexer";
    private String PARSER = "Parser";
    private String TOKEN = "Token";
    private String JAVA_EXTENSION = ".java";
    private static final String EPS = "EPS";
    private static final String EOF = "EOF";
    private String grammarName;
    private String header = "";
    private String members = "";
    private String startRule;
    private Map<String, Rule> terminals = new HashMap<>();
    private Map<String, Rule> nonTerminals = new HashMap<>();
    private final HashMap<String, HashSet<String>> firstSet = new HashMap<>();
    private final HashMap<String, HashSet<String>> followSet = new HashMap<>();

    public Generator(File grammar, String startRule) throws IOException {
        this.startRule = startRule;
        grammarName = grammar.getName().split("[.]")[0];
        CharStream input = CharStreams.fromFileName(grammar.getPath());
        GrammarOfGrammarLexer lexer = new GrammarOfGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarOfGrammarParser parser = new GrammarOfGrammarParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();
        GrammarOfGrammarBaseListener listener = new GrammarOfGrammarBaseListener() {

            @Override
            public void enterHeader(GrammarOfGrammarParser.HeaderContext ctx) {
                if (ctx.JAVA_CODE() != null) {
                    header = convertBlockToJavaCode(ctx.JAVA_CODE());
                }
            }

            @Override
            public void enterMembers(GrammarOfGrammarParser.MembersContext ctx) {
                if (ctx.JAVA_CODE() != null) {
                    members = convertBlockToJavaCode(ctx.JAVA_CODE());
                }
            }

            @Override
            public void enterTermRuleLabel(GrammarOfGrammarParser.TermRuleLabelContext ctx) {
                Rule rule = addTerminalRule(ctx.TERM_NAME().getText());
                for (GrammarOfGrammarParser.TerminalProductionContext productionContext : ctx.terminalProduction()) {
                    Production production = new Production();
                    String text = "";
                    for (TerminalNode term : productionContext.STRING()) {
                        String str = term.getText();
                        text += str.substring(1, str.length() - 1);
                    }
                    production.addRule(new Rule(text));
                    rule.addProduction(production);
                }
            }

            @Override
            public void enterNonTermRuleLabel(GrammarOfGrammarParser.NonTermRuleLabelContext ctx) {
                Rule rule = addNonTerminalRule(ctx.NON_TERM_NAME().getText());
                if (ctx.localAttrs() != null) {
                    for (GrammarOfGrammarParser.AttrContext localAttr : ctx.localAttrs().attr()) {
                        rule.addLocalAttr(localAttr.attrName().getText(), localAttr.attrType().getText());
                    }
                }
                if (ctx.returnedAttr() != null) {
                    rule.setReturnedType(ctx.returnedAttr().attr().attrType().getText());
                    rule.setReturnedVarName(ctx.returnedAttr().attr().attrName().getText());
                }
                for (GrammarOfGrammarParser.NonTerminalProductionContext productionContext : ctx.nonTerminalProduction()) {
                    Production production = new Production();
                    if (productionContext.nonTermVariations().isEmpty()) {
                        production.addRule(addTerminalRule(EPS));
                    }
                    for (GrammarOfGrammarParser.NonTermVariationsContext variationsContext : productionContext.nonTermVariations()) {
                        Rule productionRule;
                        if (variationsContext.TERM_NAME() != null) {
                            productionRule = new Rule(variationsContext.TERM_NAME().getText());
                            if (variationsContext.ASTERISK() != null) {
                                productionRule.setMark(Rule.Mark.ASTERISK);
                            } else if (variationsContext.PLUS() != null) {
                                productionRule.setMark(Rule.Mark.PLUS);
                            } else if (variationsContext.QUESTION_MARK() != null) {
                                productionRule.setMark(Rule.Mark.QUESTION_MARK);
                            }
                        } else if (variationsContext.NON_TERM_NAME() != null) {
                            productionRule = new Rule(variationsContext.NON_TERM_NAME().getText());
                            if (variationsContext.args() != null) {
                                for (GrammarOfGrammarParser.AttrNameContext attrName : variationsContext.args().attrName()) {
                                    productionRule.addArg(attrName.getText());
                                }
                            }
                        } else {
                            throw new RuntimeException("Unexpected variationsContext");
                        }
                        production.addRule(productionRule);
                    }
                    if (productionContext.JAVA_CODE() != null) {
                        production.setJavaCode(convertBlockToJavaCode(productionContext.JAVA_CODE()));
                    }
                    rule.addProduction(production);
                }
            }
        };
        walker.walk(listener, parser.gram());
        addTerminalRule(EOF);
        if (!nonTerminals.containsKey(startRule)) {
            throw new RuntimeException("No such rule: " + startRule);
        }

        // Debug info
        System.err.println("TERMINAL RULES:");
        for (Rule term : terminals.values()) {
            System.err.println("\t" + term);
        }
        System.err.println("NON_TERMINAL RULES:");
        for (Rule nonTerm : nonTerminals.values()) {
            System.err.println("\t" + nonTerm);
        }
    }

    // Algorithm from p. 286
    private void calculateFirstSet() {
        for (String term : terminals.keySet()) {
            firstSet.put(term, new HashSet<>(Collections.singletonList(term)));
        }
        boolean changed = false;
        do {
            changed = false;
            for (Map.Entry<String, Rule> nonTermEntry : nonTerminals.entrySet()) {
                String nonTermName = nonTermEntry.getKey();
                Rule nonTernRule = nonTermEntry.getValue();
                List<Production> productions = nonTernRule.getProductions();
                HashSet<String> values = new HashSet<>();
                for (Production production : productions) {
                    List<Rule> productionRules = production.getRules();
                    int i = 0;
                    while (i < productionRules.size() && isEpsRule(productionRules.get(i))) {
                        if (firstSet.get(productionRules.get(i).getName()) != null) {
                            values.addAll(firstSet.get(productionRules.get(i).getName()));
                        }
                        i++;
                    }
                    if (i < productionRules.size()) {
                        if (firstSet.get(productionRules.get(i).getName()) != null) {
                            values.addAll(firstSet.get(productionRules.get(i).getName()));
                        }
                    } else {
                        values.add(EPS);
                    }
                }
                if (!firstSet.containsKey(nonTermName)) {
                    firstSet.put(nonTermName, values);
                    changed = true;
                } else {
                    changed = firstSet.get(nonTermName).addAll(values);
                }
            }
        } while (changed);
    }

    // Algorithm from p. 287
    private void calculateFollowSet() {
        followSet.put(startRule, new HashSet<>(Collections.singletonList(EOF)));
        boolean changed = false;
        do {
            changed = false;
            for (Map.Entry<String, Rule> nonTermEntry : nonTerminals.entrySet()) {
                String nonTermName = nonTermEntry.getKey();
                Rule nonTernRule = nonTermEntry.getValue();
                List<Production> productions = nonTernRule.getProductions();
                for (Production production : productions) {
                    List<Rule> productionRules = production.getRules();
                    if (productionRules.size() > 1) {
                        for (int i = productionRules.size() - 2; i >= 0; i--) {
                            if (productionRules.get(i).isTerminal()) {
                                continue;
                            }
                            if (firstSet.get(productionRules.get(i + 1).getName()) != null) {
                                HashSet<String> values = new HashSet<>(firstSet.get(productionRules.get(i + 1).getName()));
                                values.remove(EPS);
                                changed = addTermsToFollowSet(productionRules.get(i).getName(), values) || changed;
                            }
                        }
                    }
                    int i = productionRules.size() - 1;
                    while (i > 0 && !productionRules.get(i).isTerminal()) {
                        if (followSet.get(nonTermName) != null) {
                            changed = addTermsToFollowSet(productionRules.get(i).getName(), followSet.get(nonTermName)) || changed;
                        }
                        if (firstSet.get(productionRules.get(i).getName()) == null ||
                                !firstSet.get(productionRules.get(i).getName()).contains(EPS)) {
                            break;
                        }
                        i--;
                    }
                }
            }
        } while (changed);
    }

    private boolean addTermsToFollowSet(String nonTermName, HashSet<String> values) {
        if (!followSet.containsKey(nonTermName)) {
            followSet.put(nonTermName, values);
            return true;
        }
        return followSet.get(nonTermName).addAll(values);
    }

    private boolean isEpsRule(Rule rule) {
        if (EPS.endsWith(rule.getName())) {
            return true;
        }
        List<Production> productions = rule.getProductions();
        for (Production production : productions) {
            boolean isEps = true;
            List<Rule> productionRules = production.getRules();
            for (Rule productRule : productionRules) {
                if (!isEpsRule(productRule)) {
                    isEps = false;
                    break;
                }
            }
            if (isEps) {
                return true;
            }
        }
        return false;
    }

    public void generateFiles() throws FileNotFoundException {
        File tokens = generateTokens();
        File lexer = generateLexer();
        calculateFirstSet();
        calculateFollowSet();

        // Debug info
        System.err.println("FIRST SET:");
        for (Map.Entry<String, HashSet<String>> entrySet : firstSet.entrySet()) {
            StringJoiner joiner = new StringJoiner(", ", entrySet.getKey() + ": ", "");
            entrySet.getValue().forEach(joiner::add);
            System.err.println("\t" + joiner.toString());
        }
        System.err.println("FOLLOW SET:");
        for (Map.Entry<String, HashSet<String>> entrySet : followSet.entrySet()) {
            StringJoiner joiner = new StringJoiner(", ", entrySet.getKey() + ": ", "");
            entrySet.getValue().forEach(joiner::add);
            System.err.println("\t" + joiner.toString());
        }

        File parser = generateParser();
    }

    private File generateTokens() throws FileNotFoundException {
        String tokensName  = createLexerOrParserName(grammarName, TOKEN, JAVA_EXTENSION);
        File file = new File(GEN_PATH, tokensName);
        file.getParentFile().mkdirs();
        PrintWriter out = new PrintWriter(file);
        out.println(header);
        out.println("\npublic enum " + grammarName + TOKEN +" {");
        StringJoiner joiner = new StringJoiner(", ", "\t", ";");
        terminals.keySet().forEach(joiner::add);
        out.println(joiner.toString());
        out.print("}");
        out.close();
        return file;
    }

    private File generateLexer() throws FileNotFoundException {
        String lexerFileName  = createLexerOrParserName(grammarName, LEXER, JAVA_EXTENSION);
        File file = new File(GEN_PATH, lexerFileName);
        String lexerName = lexerFileName.split("[.]")[0];
        String tokenName = grammarName + TOKEN;
        file.getParentFile().mkdirs();
        PrintWriter out = new PrintWriter(file);
        out.println(header);
        out.println("\npublic class " + lexerName + " {");
        out.println("\tprivate String expression;");
        out.println("\tprivate int pos;");
        if (!members.isEmpty()) {
            out.println(addPrefix("\t", members));
        }
        // Constructor(String)
        out.println("\n\tpublic " + lexerName + "(String expression) {");
        out.println("\t\tthis.expression = expression;");
        out.println("\t\tthis.pos = 0;");
        out.println("\t}");
        // hasNextToken()
        out.println("\n\tpublic boolean hasNextToken() {");
        out.println("\t\twhile (pos < expression.length() && isBlank(expression.charAt(pos))) {");
        out.println("\t\t\tpos++;");
        out.println("\t\t}");
        out.println("\t\treturn pos != expression.length();");
        out.println("\t}");
        // getNextToken()
        out.println("\n\tpublic " + tokenName + " getNextToken() {");
        out.println("\t\tif (!hasNextToken()) {");
        out.println("\t\t\treturn " + tokenName + ".EOF;");
        out.println("\t\t}");
        Map<String, String> sortedTerminals = new TreeMap<>(Collections.reverseOrder());
        for (Map.Entry<String, Rule> term : terminals.entrySet()) {
            if (EPS.equals(term.getKey()) || EOF.equals(term.getKey())) {
                continue;
            }
            for (Production production : term.getValue().getProductions()) {
                sortedTerminals.put(production.getRules().get(0).getName(), term.getKey());
            }
        }
        StringJoiner joiner = new StringJoiner("\t\t} else if ", "\t\tif ", "\t\t}");
        for (Map.Entry<String, String> term : sortedTerminals.entrySet()) {
            joiner.add("(expression.startsWith(\"" + term.getKey() + "\", pos)) {\n"
                        + "\t\t\tpos += \"" + term.getKey() + "\".length();\n"
                        + "\t\t\treturn " + tokenName + "." + term.getValue() + ";\n");
        }
        out.println(joiner.toString());
        out.println("\t\tthrow new IllegalStateException(\"Unknown token from pos \" + pos);");
        out.println("\t}");
        // getPos()
        out.println("\n\tpublic int getPos() {");
        out.println("\t\treturn pos;");
        out.println("\t}");
        // isBlank(char)
        out.println("\n\tprivate boolean isBlank(char c) {");
        out.println("\t\treturn c == ' ' || c == '\\r' || c == '\\n' || c == '\\t';");
        out.println("\t}");
        out.println("\n}");
        out.close();
        return file;
    }

    private File generateParser() throws FileNotFoundException {
        String parserName  = createLexerOrParserName(grammarName, PARSER, JAVA_EXTENSION);
        File file = new File(GEN_PATH, parserName);
        file.getParentFile().mkdirs();
        PrintWriter out = new PrintWriter(file);
        out.println(header);
        out.println("\npublic class " + parserName.split("[.]")[0] + " {");
        out.println(addPrefix("\t", members));
        out.println("\n}");
        out.close();
        return file;
    }

    private Rule addTerminalRule(String ruleName) {
        if (!terminals.containsKey(ruleName)) {
            terminals.put(ruleName, new Rule(ruleName));
        }
        return terminals.get(ruleName);
    }

    private Rule addNonTerminalRule(String ruleName) {
        if (!nonTerminals.containsKey(ruleName)) {
            nonTerminals.put(ruleName, new Rule(ruleName));
        }
        return nonTerminals.get(ruleName);
    }

    private String convertBlockToJavaCode(TerminalNode node) {
        String javaCode = node.getText().trim();
        if (javaCode.startsWith("{") && javaCode.endsWith("}")) {
            return javaCode.substring(1, javaCode.length() - 1).trim();
        }
        return javaCode;
    }

    private String addPrefix(String prefix, String str) {
        StringBuilder builder = new StringBuilder();
        for (String s : str.split("\\n")) {
            builder.append(prefix).append(s);
        }
        return builder.toString();
    }

    private String createLexerOrParserName(String prefix, String type, String extension) {
        return prefix + type + extension;
    }
}
