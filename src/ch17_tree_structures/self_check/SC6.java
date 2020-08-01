package ch17_tree_structures.self_check;

import ch17_tree_structures.chapter_examples.section1.Tree;
/**
 * Using the public interface of the Tree class in this section, construct a tree that is identical to the subtree with root Anne
 * in Figure 1.
 */
public class SC6 {
    public static void main(String[] args) {
        
        Tree petersDescendants = new Tree("Peter");
        petersDescendants.addSubtree(new Tree("Savannah"));

        Tree annesDescendants = new Tree("Anne");
        annesDescendants.addSubtree(petersDescendants);
        annesDescendants.addSubtree(new Tree("Zara"));

        System.out.println(annesDescendants);
    }
}