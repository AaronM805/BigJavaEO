package ch17_tree_structures.chapter_examples.section1;

/**
 * This class will test the tree class.
 */
public class TreeTester {
    public static void main(String [] args) {
        Tree tree = new Tree(5);
        System.out.println(tree.size());
        System.out.println(tree);
        tree.addSubtree(new Tree(4));
        tree.addSubtree(new Tree(3));
        tree.addSubtree(new Tree(2));
        tree.addSubtree(new Tree(1));
        tree.addSubtree(new Tree(0));
        System.out.println(tree.size());
        System.out.println(tree);

        Tree tree2 = new Tree(6);
        tree2.addSubtree(new Tree(7));
        tree2.addSubtree(new Tree(8));
        tree2.addSubtree(new Tree(9));
        tree2.addSubtree(new Tree(10));
        tree2.addSubtree(new Tree(11));
        tree.addSubtree(tree2);
        System.out.println(tree.size());
        System.out.println(tree);

        /*
        Tree Structure
         ________5________
        /   /   / \   \   \
       4   3   2   1   0   6
                     ______|______
                    /   /  |  \   \
                   7   8   9   10  11
        */
    }
}