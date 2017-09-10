package ifmo.ctddev.lab3;

import ifmo.ctddev.lab3.antlr.PascalGrammerLexer;
import ifmo.ctddev.lab3.antlr.PascalGrammerParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.io.PrintWriter;

public class Converter {

    public static void main(String[] args) throws IOException {
        if (args.length != 1 || !args[0].endsWith(".pas")) {
            System.err.println("Please, specify a *.pas file to convert.");
            return;
        }
        String fileName = args[0];
        CharStream input = CharStreams.fromFileName(fileName);
        PascalGrammerLexer pascalLexer = new PascalGrammerLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(pascalLexer);
        PascalGrammerParser pascalParser = new PascalGrammerParser(tokens);
        PascalGrammerParser.ProgramContext program = pascalParser.program();
        String code = program.code;
        PrintWriter writer = new PrintWriter("test.c", "UTF-8");
        writer.print(code);
        writer.close();
    }
}
