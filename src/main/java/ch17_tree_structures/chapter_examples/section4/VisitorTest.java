package ch17_tree_structures.chapter_examples.section4;

import ch17_tree_structures.chapter_examples.section3.BinarySearchTree;
import ch17_tree_structures.chapter_examples.section3.BinarySearchTree.Traversal;

/**
 * Tests BST and Visitor interface
 *
 */
public class VisitorTest {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.add("Martinez");
        bst.add("John");
        bst.add("Aaron");
        bst.add("Career");
        bst.add("Sam");
        bst.add("Warthog");
        bst.add("Andrea");
        bst.add("Zoe");
        bst.add("Bart");
        bst.add("Ray");

        ShortNameCounter counter = new ShortNameCounter();
        bst.print(Traversal.INORDER, counter);
        System.out.println("Short names: " + counter.counter);
        bst.print(Traversal.INORDER);
        System.out.println("\n");
        bst.print(Traversal.PREORDER);
        System.out.println("\n");
        bst.print(Traversal.POSTORDER);
    }
}

class ShortNameCounter implements Visitor {
    public static int counter = 0;
    public boolean visit(Object data) {
        if(data.toString().length() <= 5) {
            counter++;
        }
        return true;
    }
}