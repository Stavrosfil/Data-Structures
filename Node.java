import java.util.ArrayList;

public class Node {
    private Node parent = null;
    private ArrayList<Node> children;
    private int value;

    public Node(Node parent, int value) {
        this.parent = parent;
        this.value = value;
        this.children = new ArrayList<Node>(0);

        // TODO: better initialization method?
        this.children.add(null);
        this.children.add(null);
    }

    // TODO: Implement addChild method correctly
    // public void addChild(Node child) {
    //     children.add(child);
    // }

    // -------------------GETTERS-------------------
    
    public Node getParent() {
        return this.parent;
    }

    public ArrayList<Node> getChildren() {
        return this.children;
    }

    public int getValue() {
        return this.value;
    }
}