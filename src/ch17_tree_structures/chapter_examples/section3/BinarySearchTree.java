package ch17_tree_structures.chapter_examples.section3;

import ch17_tree_structures.chapter_examples.section4.Visitor;

import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;

/**
 * This class implements a binary search tree whose nodes hold objects that implement the Comparable interface.
 *
 * @author Aaron N. Martinez
 * @version 0.1
 */
public class BinarySearchTree {
    private Node root;

    /**
     * Constructs an empty binary search tree.
     */
    public BinarySearchTree() {
        root = null;
    }

    /**
     * Adds a new node into the binary search tree.
     *
     * @param obj the object to add
     */
    public void add(Comparable obj) {
        Node newNode = new Node(obj);

        if(root == null) {
            root = newNode;
        }
        else {
            root.addNode(newNode);
        }
    }

    public void breadthFirst(Visitor v) {
        if (root == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean more = true;

        while(more && queue.size() > 0) {
            Node node = queue.remove();
            more = v.visit(node.data);

            if(more) {
                if(node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
    }

    /**
     * Tries to find an object in the tree.
     *
     * @param obj the object to find
     *
     * @return true if the node is contained in the tree
     */
    public boolean find(Comparable obj) {
        Node current = root;

        while (current != null) {
            if(current.data.compareTo(obj) == 0) {
                return true;
            }
            else if (current.data.compareTo(obj) < 0) {
                current = current.right;
            }
            // since we are trying to find obj, we use an else
            else {
                current = current.left;
            }
        }
        return false;
    }

    /**
     * Returns the height of the tree
     *
     * @return height of tree
     */
    public int height() {
        return height(root);
    }

    public Iterator iterator() {
        return new BreadthFirstIterator(root);
    }

    /**
     * Prints the contents of the tree in sorted order.
     */
    public void print(Traversal order) {
        if(order == Traversal.INORDER) {
            inOrder(root);    
        }
        else if (order == Traversal.LEVELORDER) {
            levelOrder(root);
        }
        else if (order == Traversal.PREORDER) {
            preOrder(root);
        }
        else {
            postOrder(root);
        }
        System.out.println();
    }

    /**
     * Prints the contents of the tree in sorted order.
     */
    public void print(Traversal order, Visitor visitor) {
        if(order == Traversal.INORDER) {
            inOrder(root, visitor);    
        }
        else if (order == Traversal.PREORDER) {
            preOrder(root, visitor);
        }
        else {
            postOrder(root, visitor);
        }
        System.out.println();
    }

    /**
     * Tries to remove an object from the tree. Does nothing if the objectt is not contained in the tree.
     *
     * @param obj the object to remove
     */
    public void remove(Comparable obj) {
        /*
         TODO: Understand this method!
        
         */
        Node toBeRemoved = root;
        Node parent = null;
        boolean found = false;

        //find the node to be removed
        while (!found && toBeRemoved != null) {
            int comparison = toBeRemoved.data.compareTo(obj);
            if( comparison == 0) {
                found = true;
            }
            else {
                parent = toBeRemoved;
                if(comparison > 0) {
                    toBeRemoved = toBeRemoved.left;
                }
                else {
                    toBeRemoved = toBeRemoved.right;
                }
            }
        }

        // if (found) {
        //     if (toBeRemoved.left == null && toBeRemoved.right == null) {
        //         toBeRemoved = null;
        //     }
        //     else if (toBeRemoved.left != null && toBeRemoved.right != null) {
        //         // TODO: LEFT OFF HERE
        //         Node 
        //     }
        //     else {
        //         if(toBeRemoved.left != null) {
        //             toBeRemoved = toBeRemoved.left;
        //             toBeRemoved.left = null;
        //         }
        //         else {
        //             toBeRemoved = toBeRemoved.right;
        //             toBeRemoved.right = null;
        //         }
        //     }
        // }
        if(!found) {
            return;
        }
        // toBeRemoved contains obj
        // If one of the children is empty, use the other
        if (toBeRemoved.left == null || toBeRemoved.right == null) {
            Node newChild;
            if (toBeRemoved.left != null) {
                newChild = toBeRemoved.left;
            }
            else {
                newChild = toBeRemoved.right;
            }

            if (parent == null) { // found in root
                root = newChild;
            }
            else if (parent.left == toBeRemoved) {
                parent.left = newChild;
            }
            else {
                parent.right = newChild;
            }
            return;
        }
        
        // Neither subtree is empty
        // Find smallest element of the right subtree
        Node smallestParent = toBeRemoved;
        Node smallest = toBeRemoved.right;

        while(smallest.left != null) {
            smallestParent = smallest;
            smallest = smallest.left;
        }

        //smallest contains smallest child in right subtree
        // Move contents, unlink child
        toBeRemoved.data = smallest.data;
        if (smallestParent == toBeRemoved) {
            smallestParent.right = smallest.right;
        }
        else {
            smallestParent.left = smallest.right;
        }
    }

    private static int height(Node parent) {
        if (parent == null) {
            return 0;
        }
        else {
            return 1 + Math.max(height(parent.left), height(parent.right));
        }
    }

    /**
     * Prints the contents of the tree in sorted order.
     *
     * @param parent the node to print from
     */
    private static void inOrder(Node parent) {
        if (parent == null) {
            return;
        }
        inOrder(parent.left);
        System.out.println(parent.data + " ");
        inOrder(parent.right);
    }

    private static void inOrder(Node parent, Visitor visitor) {
        if (parent == null) {
            return;
        }

        inOrder(parent.left, visitor);
        visitor.visit(parent.data);
        inOrder(parent.right, visitor);
    }

    private void levelOrder(Node parent) {
        int height = height();

        for(int i = 1; i <= height; i++) {
            levelOrder(parent, i);
        }
    }

    private static void levelOrder(Node node, int level) {
        if (node == null) {
            return;
        }
        else if (level == 1) {
            System.out.println(node.data + " ");
        }
        else {
            levelOrder(node.left, level - 1);
            levelOrder(node.right, level - 1);
        }
    }

    /**
     * Prints the contents of the tree in post order.
     *
     * @param parent the node to print from
     */
    private static void postOrder(Node parent) {
        if (parent == null) {
            return;
        }

        postOrder(parent.left);
        postOrder(parent.right);
        System.out.println(parent.data + " ");

    }

    private static void postOrder(Node parent, Visitor visitor) {
        if (parent == null) {
            return;
        }

        postOrder(parent.left);
        postOrder(parent.right);
        visitor.visit(parent.data);
    }

    /**
     * Prints the contents of the tree in pre order.
     *
     * @param parent the node to print from
     */
    private static void preOrder(Node parent) {
        if (parent == null) {
            return;
        }

        System.out.println(parent.data + " ");
        preOrder(parent.left);
        preOrder(parent.right);
    }

    private static void preOrder(Node parent, Visitor visitor) {
        if (parent == null) {
            return;
        }

        visitor.visit(parent.data);
        preOrder(parent.left, visitor);
        preOrder(parent.right, visitor);
    }

    class BreadthFirstIterator implements Iterator {
        private Queue<Node> queue;

        public BreadthFirstIterator(Node root) {
            queue = new LinkedList<>();

            if(root != null) {
                queue.add(root);
            }
        }

        public boolean hasNext() {
            return queue.size() > 0;
        }

        public Object next() {
            Node node = queue.remove();

            if(node.left != null) {
                queue.add(node.left);
            }

            if(node.right != null) {
                queue.add(node.right);
            }

            return node.data;
        }
    }

    /**
     * A node of a tree stores a data item and references to the left and right child nodes.
     */
    class Node {
        public Comparable data;
        public Node left;
        public Node right;

        /**
         * Constructs a node to be used in the binary tree
         *
         * @param data the data to be stored in the node
         */
        public Node(Comparable data) {
            this.data = data;
            left = null;
            right = null;
        }

        /**
         * Inserts a new node as a descendant of this node.
         *
         * @param newNode the node to insert
         */
        public void addNode(Node newNode) {
            if (newNode.data.compareTo(data) < 0) {
                if (left == null) {
                    left = newNode;
                }
                else {
                    left.addNode(newNode);
                }
                
            }
            else if (newNode.data.compareTo(data) > 0) {
                if(right == null) {
                    right = newNode;
                }
                else {
                    right.addNode(newNode);   
                }
            }
        }
    }

    public enum Traversal {
        INORDER, LEVELORDER, PREORDER, POSTORDER;
    }
}
