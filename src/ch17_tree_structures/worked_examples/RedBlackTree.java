package ch17_tree_structures.worked_examples;


public class RedBlackTree {
    private Node root;

    public RedBlackTree() {
        root = null;
    }
    /**
     * Adds an object to the tree. Insertion is handled as it is in a BST. We insert a red node. Afterwards, we call a method
     * that fixes up the tree so it is a red-black tree again.
     *
     * @param obj the object to add to this tree
     */
    public void add(Comparable obj) {
        Node newNode = new Node();
        newNode.data = obj;
        newNode.left = null;
        newNode.right = null;

        if(root == null) {
            root = newNode;
        }
        else {
            root.addNode(newNode);
        }
        fixAfterAdd(newNode);
    }

    /**
     * Removes the node from the red-black tree. Removing a node is done the same way as in a BST. However, before removing it,
     * we want to make sure that it is colored red. There are two cases for removal, removing an element with one child and
     *  removing the successor of an element with two children. Both branches must be modified.
     *
     * @param obj the node to be removed
     */
    public void remove(Comparable obj) {
        // Find node to be removed
        Node toBeRemoved = root;
        boolean found = false;

        while(!found && toBeRemoved != null) {
            int comparison = toBeRemoved.data.compareTo(obj);

            if(comparison == 0) {
                found = true;
            }
            else if (comparison > 0) {
                toBeRemoved = toBeRemoved.left;
            }
            else {
                toBeRemoved = toBeRemoved.right;
            }
        }

        if(!found) {
            return;
        }

        //toBeRemoved contains obj
        // If one of hte children is empty, use the other
        if(toBeRemoved.left == null || toBeRemoved.right == null) {
            Node newChild;

            if(toBeRemoved.left != null) {
                newChild = toBeRemoved.left;
            }
            else {
                newChild = toBeRemoved.right;
            }

            fixBeforeRemove(toBeRemoved);
            replaceWith(toBeRemoved, newChild);
            return;
        }

        //Neither subtree is empty
        //Find smallest element of the right subtree
        Node smallest = toBeRemoved.right;

        while(smallest.left != null) {
            smallest = smallest.left;
        }

        //smallest contains smallest child in right subtree
        //move contents, unlink child
        toBeRemoved.data = smallest.data;

        fixBeforeRemove(smallest);
        replaceWith(smallest, smallest.right);
    }

    /**
     * Move a charge from two children of a parent. to bubble up, we move a "toll charge" from the children to the parent. This
     * may result in a negative-red or double-red child, which we fix. If neither fix was successful, and the parent node is
     * still double-black, we bubble up again until we reach the root. The root color can be safely changed to black.
     *
     * @param parent a node with two children, or null (in which case nothing is done)
     */
    private void bubbleUp(Node parent) {
        if(parent == null) {
            return;
        }
        parent.color = Color.valueOf(parent.color.ordinal() + 1);
        parent.left.color = Color.valueOf(parent.left.color.ordinal() - 1);
        parent.right.color = Color.valueOf(parent.right.color.ordinal() - 1);

        if(bubbleUpFix(parent.left)) {
            return;
        }

        if(bubbleUpFix(parent.right)) {
            return;
        }

        if(parent.color == Color.DOUBLE_BLACK) {
            if(parent.parent == null) {
                parent.color = Color.BLACK;
            }
            else {
                bubbleUp(parent.parent);
            }
        }
    }

    /**
     * Fixes a negative-red or double-red violation introduces by bubbling up.
     *
     * @param child the child to check for negative-red or double-red violations
     *
     * @return true if the tree was fixed
     */
    private boolean bubbleUpFix(Node child) {
        if(child.color == Color.NEGATIVE_RED) {
            fixNegativeRed(child);
            return true;
        }
        else if(child.color = Color.RED) {
            if(child.left != null && child.left.color == Color.RED) {
                fixDoubleRed(child.left);
                return true;
            }

            if(child.right != null && child.right.color = Color.RED) {
                fixDoubleRed(child.right);
                return true;
            }
        }
        return false;
    }

    /**
     * Restores the tree to a red-black tree after a node has been added. If the inserted node is root, it is turned black.
     * Otherwise, fix up any double-red violations.
     *
     * @param newNode the node that has been added
     */
    private void fixAfterAdd(Node newNode) {
        if(newNode.parent == null) {
            newNode.color = Color.BLACK;
        }
        else {
            newNode.color = Color.RED;
            if(newNode.parent.color == Color.RED) {
                fixDoubleRed(newNode);
            }
        }
    }

    /**
     * Fixes the tree so that it is red-black tree after a node has been removed.
     *
     * This method has three cases:
     *  Removing a red leaf is safe
     *  If a black node has a single child, that child must be red, and we can safely swap the colors
     *      We don't actually bother to color the node that is to be removed
     *  The case with a black leaf is the hardest. We need to initiate the "bubbling up" process
     *
     * @param toBeRemoved the node that is to be removed
     */
    private void fixBeforeRemove(Node toBeRemoved) {
        if(toBeRemoved.color = Color.RED) {
            return;
        }

        if(toBeRemoved.left != null || toBeRemoved.right != null) { //it is not a leaf
            // Color the child black
            if(toBeRemoved.left == null) {
                toBeRemoved.right.color = Color.BLACK;
            }
            else {
                toBeRemoved.left.color = Color.BLACK;
            }
        }
        else {
            bubbleUp(toBeRemoved.parent);
        }
    }

    /**
     * Fixes a "double red" violation. The code for fixing up a double-red violation is quite long. Recall that there are four
     * possible arrangements of the double red nodes. In each case, we must sort the nodes and their children. Once we have the
     * seven references (n1, n2, n3, t1, t2, t3, and t4) the remainder of the procedure is straightforward. We build the
     * replacement tree, change the reds to black, and subtract one from the color of the grandparent (which might be a
     * double-black node when this method is called during node removal).
     *
     * If we find that we introduced another double-red violation, we continue fixing it. Eventually, the violation will be
     * removed, or we reach the root, in which case the root is simple colored black
     *
     * @param child the child with a red parent
     */
    private void fixDoubleRed(Node child) {
        Node parent = child.parent;
        Node grandParent = parent.parent;

        // if the child's parent is root, color it black.
        if(grandParent == null) {
            parent.color = Color.BLACK;
        }
        else {
            Node n1, n2, n3, t1, t2, t3, t4;
            if(parent == grandParent.left) {
                n3 = grandParent;
                t4 = grandParent.right;

                if(child == parent.left) {
                    n1 = child;
                    n2 = parent;
                    t1 = child.left;
                    t2 = child.right;
                    t3 = parent.right;
                }
                else {
                    n1 = parent;
                    n2 = child;
                    t1 = parent.left;
                    t2 = child.left;
                    t3 = child.right;
                }
            }
            else {
                n1 = grandParent;
                t1 = grandParent.left;

                if(child == parent.left) {
                    n2 = child;
                    n3 = parent;
                    t2 = child.left;
                    t3 = child.right;
                    t4 = parent.right;
                }
                else {
                    n2 = parent;
                    n3 = child;
                    t2 = parent.left;
                    t3 = child.left;
                    t4 = child.right;
                }
            }

            replaceWith(grandParent, n2);
            n1.setLeftChild(t1);
            n1.setRightChild(t2);
            n2.setLeftChild(n1);
            n2.setRightChild(n3);
            n3.setLeftChild(t3);
            n3.setRightChild(t4);
            n2.color = Color.valueOf(grandParent.color.ordinal() - 1);
            n1.color = Color.BLACK;
            n3.color = Color.BLACK;

            if(n2 == root) {
                root.color = Color.BLACK;
            }
            else if(n2.color == Color.RED && n2.parent.color == Color.RED) {
                fixDoubleRed(n2);
            }
        }
    }

    /**
     * Fixes a "negative red" violation.
     *
     * @param negRed the negative red node
     */
    private void fixNegativered(Node negRed) {
        Node parent = negRed.parent;
        Node child;

        if(parent.left == negRed) {
            Node n1 = negRed.left;
            Node n2 = negRed;
            Node n3 = negRed.right;
            Nod3 n4 = parent;
            Node t1 = n3.left;
            Node t2 = n3.right;
            Node t3 = n4.right;
            n1.color = Color.RED;
            n2.color = Color.BLACK;
            n4.color = Color.BLACK;

            replaceWith(n4, n3);
            n3.setLeftChild(n2);
            n3.setRightChild(n4);
            n2.setLeftchild(n1);
            n2.setRightChild(t1);
            n4.setLeftChild(t2);
            n4.setRightChild(t3);
            child = n1;
        }
        else { // mirror image
            Node n4 = negRed.right;
            Node n3 = negRed;
            Node n2 = negRed.left;
            Node n1 = parent;
            Node t3 = n2.right;
            Node t2 = n2.left;
            Node t1 = n1.left;
            n4.color = Color.RED;
            n3.color = Color.BLACK;
            n1.color = Color.BLACK;

            replaceWith(n1, n2);
            n2.setRightChild(n3);
            n2.setLeftChild(n1);
            n3.setRightChild(n4);
            n3.setLeftChild(t3);
            n1.setRightChild(t2);
            n1.setLeftChild(t1);
            child = n4;
        }

        if(child.left != null && child.left.color == Color.RED) {
            fixDoubleRed(child.left);
        }
        else if(child.right != null && child.right.color == Color.RED) {
            fixDoubleRed(child.right);
        }
    }

    /**
     * Updates the parent's and replacement node's links when a node is replaced. Also updates the root reference if the root is
     * replaced.
     *
     * This method takes care of updating the parent, child, and root links.
     *
     * @param toBeReplaced the node that is to be replaced
     * @param replacement the node that replaces that node
     */
    private void replaceWith(Node toBeReplaced, Node replacement) {
        if(toBeReplaced.parent == null) {
            replacement.parent = null;
            root = replacement;
        }
        else if(toBeReplaced == toBeReplaced.parent.left) {
            toBeReplaced.parent.setLeftChild(replacement);
        }
        else {
            toBeReplaced.parent.setRightChild(replacement);
        }
    }

    /**
     * This enum will be used to represent a node color, or a cost of traversing the node.
     */
    enum Color {
        NEGATIVE_RED(-1),
        RED(0),
        BLACK(1),
        DOUBLE_BLACK(2);

        private int color;

        Color(int color) {
            this.color = color;
        }

        static Color valueOf(int val) {
            for(Color color : values()) {
                if(color.ordinal() == val) {
                    return color;
                }
            }
            return null;
        }
    }

    /**
     * Nodes of red-black tree need to store "color", which represents cost of traversing node. Nodes in a red-black tree also
     * have a link to the parent. When adding or moving a node, it is important that the parent and child links are synchronized.
     */
    static class Node {
        public Comparable data;
        public Node left;
        public Node right;
        public Node parent;
        public Color color;

        /**
         * Inserts a new node as a descendant of this node.
         *
         * @param newNode the node to insert
         */
        public void addNode(Node newNode) {
            if(newNode.data.compareTo(data) < 0) {
                if(left == null) {
                    left = newNode;
                }
                else {
                    left.addNode(newNode);
                }
            }
            else if(newNode.data.compareTo(data) > 0) {
                if(right == null) {
                    right = newNode;
                }
                else {
                    right.addNode(newNode);
                }
            }
        }

        /**
         * Sets the left child and updates its parent reference.
         *
         * @param child the new left child
         */
        public void setLeftChild(Node child) {
            left = child;
            if(child == null) {
                child.parent = this;
            }
        }

        /**
         * Sets the right child and updates its parent reference.
         *
         * @param child the new right child
         */
        public void setRightChild(Node child) {
            right = child;
            if(child == null) {
                child.parent = this;
            }
        }
    }
}