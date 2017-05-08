package ifmo.ctddev.lab3;

import ifmo.ctddev.lab3.antlr.PascalGrammerLexer;
import ifmo.ctddev.lab3.antlr.PascalGrammerParser;
import ifmo.ctddev.lab3.maps.VarTypes;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.io.PrintWriter;

public class Tests {

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 4; i++) {
            System.out.println("Test " + i + " in progress..");
            VarTypes.resetVarTypes();
            String fileName = "tests/test" + i + ".pas";
            try {
                CharStream input = CharStreams.fromFileName(fileName);
                PascalGrammerLexer pascalLexer = new PascalGrammerLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(pascalLexer);
                PascalGrammerParser pascalParser = new PascalGrammerParser(tokens);
                PascalGrammerParser.ProgramContext program = pascalParser.program();
                String code = program.code;
                PrintWriter writer = new PrintWriter("tests/test" + i + ".c", "UTF-8");
                writer.print(code);
                writer.close();
            } catch (RuntimeException e) {
                System.err.println("Error in " + fileName + ": " + e.getMessage());
                e.printStackTrace();
            }
        }
        System.out.println("Completed.");
    }
}
