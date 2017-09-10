package ifmo.ctddev.lab4;

import ifmo.ctddev.lab4.generated.MathGrammarParser;

public class Test {

    public static void main(String[] args) {
        MathGrammarParser parser = new MathGrammarParser("3 + 2^2^3 * 3");
        System.out.println(parser.parse());
    }

}
