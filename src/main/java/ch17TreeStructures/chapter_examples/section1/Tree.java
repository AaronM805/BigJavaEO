package ch17TreeStructures.chapter_examples.section1;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a tree data structure. Implementaing based on book examples as full code is not implemented.
 */
public class Tree {
    private Node root;

    /**
     * Constructs an tree with root data
     *
     * @param rootData the initial root data
     */
    public Tree(Object rootData) {
        root = new Node(rootData);
        root.children = new ArrayList<>();
    }

    /**
     * Adds a subtree to this tree.
     *
     * @param subtree the subtree to add
     */
    public void addSubtree(Tree subtree) {
        root.children.add(subtree.root);
    }

    /**
     * Returns the number of leaves that this tree has.
     *
     * @return number of leaves of this tree
     */
    public int leaves() {
        return root.leaves();
    }

    /**
     * Returns the size of the tree.
     *
     * @return size of tree
     */
    public int size() {
        if(root == null) {
            return 0;
        }
        else {
            return root.size();
        }
    }

    /**
     * Returns a string representation of this tree.
     *
     * @return string representation of this tree
     */
    public String toString() {
        return root.toString();
    }

    class Node {
        public Object data;
        public List<Node> children;

        /**
         * Constructs a node with given data.
         *
         * @param data the data to store
         */
        public Node(Object data) {
            this.data = data;
        }

        /**
         * Calculates the number of leaves that this node has.
         *
         * @return number of leaves
         */
        public int leaves() {
            int sum = 0;

            for(Node child : children) {
                sum += leaves(child);
            }
            return sum;
        }

        /**
         * Calculates the size of this node and all of it's children nodes.
         *
         * @return size of collection
         */
        public int size() {
            int sum = 0;
            for(Node child : children) {
                sum += child.size();
            }
            return sum + 1;
        }

        public String toString() {
            // return "Node[data=" + data + ", children=" + children.toString() + "]";
            return data + ", children=" + children.toString();
        }

        private int leaves(Node node) {
            if (node.children == null || node.children.size() == 0) {
                return 1;
            }
            int sum = 0;
            for (Node child : node.children) {
                sum += leaves(child);
            }
            return sum;
        }
    }
}