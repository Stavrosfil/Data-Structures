public class BinarySearchTree {
    // This is the root of our tree, we only need this to define a tree.
    Node root = null;

    // [Default constructor]
    // No need to pass a Node object, only the value is needed instead.
    // The root node is created inside the constructor.
    public BinarySearchTree(int value) {
        this.root = new Node(null, value);
    }

    // [INSERT]
    // Returns:
    // (0) for a successful insert
    // (-1) for an unsuccessful insert
    public int insert(int value) {
        // We begin searching for the apropriate position from the root.
        return recursiveInsert(root, value);
    }

    // [RECURSIVE INSERT] !!private!!
    // Returns:
    // (0) for a successful insert
    // (-1) for an unsuccessful insert
    private int recursiveInsert(Node subtreeRoot, int value) {
        // Check if we are inserting LEFT or RIGHT
        // [0] index is the left child
        // [1] index is the right child
        if (value > subtreeRoot.getValue()) {
            Node rightChild = subtreeRoot.getChildren().get(1);
            if (rightChild != null) {
                recursiveInsert(rightChild, value);
            } else {
                Node newChild = new Node(subtreeRoot, value);
                subtreeRoot.getChildren().set(1, newChild);
            }
            return 0;
        } else if (value < subtreeRoot.getValue()) {
            Node leftChild = subtreeRoot.getChildren().get(0);
            if (leftChild != null) {
                recursiveInsert(leftChild, value);
            } else {
                Node newChild = new Node(subtreeRoot, value);
                subtreeRoot.getChildren().set(0, newChild);
            }
            return 0;
        } else {
            System.out.println("Value already exists in the tree.");
            return -1;
        }
    }

    // [DELETE]
    public void delete(Node n) {

    }

    // [SEARCH]
    // WARNING: int data type does only support integers and strings, you MUST
    // define a custom equality function for your specific data types in use.
    public Node search(int o) {

        // TODO: change this
        return null;
    }

}