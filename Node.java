import java.util.ArrayList;

public class Node {
    Node parent = null;
    ArrayList<Node> children;
    Object value;

    public Node(Node parent, Object value) {
        this.parent = parent;
        this.value = value;
        this.children = new ArrayList<Node>();
        if (parent != null)
            this.parent.addChild(this);
    }

    public void addChild(Node child) {
        children.add(child);
    }
}