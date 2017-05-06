package test;

import expression.computation.Parser;
import expression.computation.Tree;
import expression.visualisation.Visualizator;

public class Main {

    public static void main(String[] args) {
//        LexicalAnalyzer analyzer = new LexicalAnalyzer("var a, b763, c:integer; diuy7674:   char;");
//        while (analyzer.hasNextToken()) {
//            Token token = analyzer.getNextToken();
//            if (token != Token.Name) {
//                System.out.println(token);
//            } else {
//                System.out.println(analyzer.getLastName());
//            }
//        }
        String expression = "var a, b:integer; c:char;";
        Parser parser = new Parser(expression);
        Tree tree = parser.parse();
        Visualizator visualizator = new Visualizator(tree);
//        visualizator.consoleVisualization();
        visualizator.interactiveVisualization(expression);
    }
}
