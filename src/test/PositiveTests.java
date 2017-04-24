package test;

import expression.computation.Parser;
import expression.visualisation.Visualizator;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PositiveTests {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("positive.in"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println("EXPRESSION: " + line);
            Parser parser = new Parser(line);
            Visualizator visualizator = new Visualizator(parser.parse());
            visualizator.consoleVisualization();
            System.out.println();
        }
    }
}
