package test;

import expression.computation.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NegativeTests {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("negative.in"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("EXPRESSION: " + line);
            try {
                Parser parser = new Parser(line);
                parser.parse();
            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
            System.out.println();
        }
    }
}
