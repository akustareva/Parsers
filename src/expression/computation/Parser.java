package expression.computation;

import java.util.ArrayList;
import java.util.List;

public class Parser {
    private LexicalAnalyzer analyzer;

    public Parser(String expression) {
        analyzer = new LexicalAnalyzer(expression);
    }

    public Tree parse() {   // S -> var T
        if (!analyzer.hasNextToken()) {
            throw new IllegalArgumentException("Empty string.");
        }
        Token token = analyzer.getNextToken();
        if (token != Token.Var) {
            throw new IllegalArgumentException("Expression should start with keyword \'var\'.");
        }
        return new Tree("S", new ArrayList<Tree>() {{
            add(new Tree(token.toString()));
            add(parseVarsDeclarationBlock());
        }});
    }

    private Tree parseVarsDeclarationBlock() {   // T -> n P : n ; T'
        if (!analyzer.hasNextToken()) {
            throw new IllegalArgumentException("Variable declaration should follow after keyword \'var\'.");
        }
        Token token = analyzer.getNextToken();
        List<Tree> subTrees = new ArrayList<>();
        if (token != Token.Name) {
            throw new IllegalArgumentException("Variable names declaration expected but \'" + token.toString() + "\' found.");
        }
        subTrees.add(new Tree(analyzer.getLastName()));
        subTrees.add(parseSingleVar());
        checkEOL();
        if ((token = analyzer.getNextToken()) != Token.Colon) {
            throw new IllegalArgumentException("Colon should follow after variable names.");
        }
        subTrees.add(new Tree(token.toString()));
        checkEOL();
        if ((token = analyzer.getNextToken()) != Token.Name) {
            throw new IllegalArgumentException("Type name expected but \'" + token.toString() + "\' found.");
        }
        subTrees.add(new Tree(analyzer.getLastName()));
        checkEOL();
        if ((token = analyzer.getNextToken()) != Token.Semicolon) {
            throw new IllegalArgumentException("Semicolon should follow after type declaration.");
        }
        subTrees.add(new Tree(token.toString()));
        subTrees.add(parseAdditionalVarsDeclarationBlock());
        return new Tree("T", subTrees);
    }

    private Tree parseAdditionalVarsDeclarationBlock() {    // T' -> T T' | eps
        List<Tree> subTrees = new ArrayList<>();
        if (!analyzer.hasNextToken()) {
            subTrees.add(new Tree("eps"));
        } else {
            subTrees.add(parseVarsDeclarationBlock());
        }
        return new Tree("T\'", subTrees);
    }

    private Tree parseSingleVar() {     // P -> , n P | eps
        List<Tree> subTrees = new ArrayList<>();
        Token token = null;
        if (!analyzer.hasNextToken() || analyzer.seeNextToken() != Token.Comma) {
            subTrees.add(new Tree("eps"));
        } else {
            token = analyzer.getNextToken();
            subTrees.add(new Tree(token.toString()));
            checkEOL();
            if ((token = analyzer.getNextToken()) != Token.Name) {
                throw new IllegalArgumentException("Type name expected but \'" + token.toString() + "\' found.");
            }
            subTrees.add(new Tree(analyzer.getLastName()));
            subTrees.add(parseSingleVar());
        }
        return new Tree("P", subTrees);
    }

    private void checkEOL() {
        if (!analyzer.hasNextToken()) {
            throw new IllegalArgumentException("Unexpected EOL.");
        }
    }
}
