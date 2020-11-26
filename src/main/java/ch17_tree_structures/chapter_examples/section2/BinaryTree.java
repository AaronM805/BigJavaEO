package ch17_tree_structures.chapter_examples.section2;

/**
 * This class implements a binary tree, based on example from book.
 *
 * @author Aaron Martinez
 * @version 0.1
 */
public class BinaryTree {

    private Node root;

    /**
     * Constructs an empty binary tree.
     */
    public BinaryTree() {
        root = null;
    }

    public int height() {
        return height(root);
    }

    private static int height(Node node) {
        if (node == null) {
            return 0;
        }

        return 1 + Math.max(height(node.left), height(node.right));
    }

    /**
     * Constructs a binary tree with given root data and left and right children.
     */
    public BinaryTree(Object rootData, BinaryTree left, BinaryTree right) {
        root = new Node(rootData);
        root.left = left.root;
        root.right = right.root;
    }

    /**
     * Inner class to define a node in a binary tree.
     */
    class Node {
        public Object data;
        public Node right;
        public Node left;

        /**
         * Constructs a node with given data.
         */
        public Node(Object data) {
            this.data = data;
        }
    }
}