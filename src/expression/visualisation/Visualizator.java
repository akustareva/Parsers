package expression.visualisation;

import expression.computation.Tree;

import java.util.Collections;

public class Visualizator {
    private Tree tree;

    public Visualizator(Tree tree) {
        this.tree = tree;
    }

    public void consoleVisualization() {
        dfs(tree, 0);
    }

    public VisualizationWindow interactiveVisualization(String windowTitle) {
        return new VisualizationWindow(windowTitle, tree);
    }

    private void dfs(Tree tree, int level) {
        System.out.println(String.join("", Collections.nCopies(2 * level, "-")) + " " + tree.getNodeName());
        for (Tree subTree : tree.getSubTrees()) {
            dfs(subTree, level + 1);
        }
    }
}
