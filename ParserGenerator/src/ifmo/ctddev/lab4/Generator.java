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
import java.util.HashMap;
import java.util.Map;

public class Generator {
    private String GEN_PATH = "src/ifmo/ctddev/lab4/generated/";
    private String EXTENSION = ".java";
    private String LEXER = "Lexer";
    private String PARSER = "Parser";
    private String grammarName;
    private String header = "";
    private String members = "";
    private Map<String, Rule> terminals = new HashMap<>();
    private Map<String, Rule> nonTerminals = new HashMap<>();

    public Generator(File grammar, String startRule) throws IOException {
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
                // TODO
            }

            @Override
            public void enterNonTermRuleLabel(GrammarOfGrammarParser.NonTermRuleLabelContext ctx) {
                Rule rule = addNonTerminalRule(ctx.NON_TERM_NAME().getText());
                if (ctx.localAttrs() != null) {
                    for (GrammarOfGrammarParser.AttrContext localAttr : ctx.localAttrs().attr()) {
                        rule.addLocalAttr(localAttr.attrName().getText(), localAttr.attrType().getText());
                    }
                }
                if (ctx.returnedAttrs() != null) {
                    for (GrammarOfGrammarParser.AttrContext returnedAttr : ctx.returnedAttrs().attr()) {
                        rule.addReturnedAttr(returnedAttr.attrName().getText(), returnedAttr.attrType().getText());
                    }
                }
                // TODO
            }
        };
        walker.walk(listener, parser.gram());
        if (!nonTerminals.containsKey(startRule)) {
            throw new RuntimeException("No such rule: " + startRule);
        }

        System.err.println("TERMINAL RULES:");
        terminals.values().forEach(System.err::println);
        System.err.println("NON_TERMINAL RULES:");
        nonTerminals.values().forEach(System.err::println);
    }

    public void generateFiles() throws FileNotFoundException {
        File lexer = generateLexer();
        File parser = generateParser();
    }

    private File generateLexer() throws FileNotFoundException {
        String lexerName  = createLexerOrParserName(grammarName, LEXER);
        File file = new File(GEN_PATH, lexerName);
        file.getParentFile().mkdirs();
        PrintWriter out = new PrintWriter(file);
        out.println(header);
        out.println("\npublic class " + lexerName.split("[.]")[0] + " {");
        out.println(members);
        out.println("\n}");
        out.close();
        return file;
    }

    private File generateParser() throws FileNotFoundException {
        String parserName  = createLexerOrParserName(grammarName, PARSER);
        File file = new File(GEN_PATH, parserName);
        file.getParentFile().mkdirs();
        PrintWriter out = new PrintWriter(file);
        out.println(header);
        out.println("\npublic class " + parserName.split("[.]")[0] + " {");
        out.println(members);
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

    private String createLexerOrParserName(String prefix, String type) {
        return prefix + type + EXTENSION;
    }
}
