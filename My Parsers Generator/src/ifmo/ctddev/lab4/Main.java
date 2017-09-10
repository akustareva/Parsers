package ifmo.ctddev.lab4;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Generator generator = new Generator(new File("src/ifmo/ctddev/lab4/test/MathGrammar.in"), "expr");
        generator.generateFiles();
    }
}
