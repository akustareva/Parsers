package expression.computation;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private String nodeName;
    private List<Tree> subTrees;

    public Tree(String nodeName) {
        this(nodeName, new ArrayList<>());
    }

    public Tree(String nodeName, List<Tree> subTrees) {
        this.nodeName = nodeName;
        this.subTrees = subTrees;
    }

    public String getNodeName() {
        return nodeName;
    }

    public List<Tree> getSubTrees() {
        return subTrees;
    }
}
