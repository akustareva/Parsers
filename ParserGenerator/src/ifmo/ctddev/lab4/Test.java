package ifmo.ctddev.lab4;

import ifmo.ctddev.lab4.generated.MathGrammarParser;

public class Test {

    public static void main(String[] args) {
        MathGrammarParser parser = new MathGrammarParser("((((3 + 5) )*9))+1*3 * 5 * 6 + 1 + 2 + 3 *((2+3))");
        System.out.println(parser.parse());
    }

}
