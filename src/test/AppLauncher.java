package test;

import expression.computation.Parser;
import expression.computation.Tree;
import expression.visualisation.VisualizationWindow;
import expression.visualisation.Visualizator;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AppLauncher {
    private static final String EXIT_COMMAND = "exit";
    private static final String PARSE_COMMAND_PREFIX = "parse";

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<VisualizationWindow> windows = new ArrayList<>();
        while (true) {
            String command;
            try {
                command = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
                continue;
            }
            if (EXIT_COMMAND.equalsIgnoreCase(command)) {
                windows.forEach(Window::dispose);
                return;
            } else if (command.startsWith(PARSE_COMMAND_PREFIX)) {
                String expression = command.substring(PARSE_COMMAND_PREFIX.length() + 1);
                System.out.println("EXPRESSION: " + expression);
                Parser parser = new Parser(expression);
                try {
                    Tree tree = parser.parse();
                    Visualizator visualizator = new Visualizator(tree);
                    windows.add(visualizator.interactiveVisualization(expression));
                } catch (IllegalArgumentException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
        }
    }
}
