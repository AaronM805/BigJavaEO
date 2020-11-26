package ch17_tree_structures.chapter_examples.section4;

/**
 * This interface is used to make visitations of a tree more generic.
 */
public interface Visitor {
    public boolean visit(Object data);
}