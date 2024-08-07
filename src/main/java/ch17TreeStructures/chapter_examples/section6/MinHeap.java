package ch17TreeStructures.chapter_examples.section6;

import java.util.Arrays;

/**
 * This class implements a heap
 */
public class MinHeap {
    private Comparable[] elements;
    private int size;

    private static int TOP = 1;
    /**
     * Constructs an empty heap.
     */
    public MinHeap() {
        elements = new Comparable[10];
        elements[0] = null;
        size = 0;
    }

    /**
     * Adds a new element to this heap.
     *
     * @param element the element to add
     */
    public void add(Comparable element) {
        size++;
        int idx = size;
        Comparable parent = getParent(idx);

        while(parent != null && parent.compareTo(element) > 0) {
            elements[idx] = parent;
            idx = getParentIndex(idx);
            parent = getParent(idx);
        }
        elements[idx] = element;
        growIfNecessary();
    }

    /**
     * Checks whether this heap is empty.
     */
    public boolean empty() {
        return size == 0;
    }

    /**
     * Gets the minimum element stored in this heap.
     *
     * @return the minimum element
     */
    public Comparable peek() {
        return elements[TOP];
    }

    /**
     * Removes the minimum element from this heap.
     *
     * @return the minimum element
     */
    public Comparable remove() {
        Comparable element = elements[TOP];
        elements[TOP] = elements[size];
        elements[size] = null;
        size--;

        fixHeap();

        return element;
    }

    /**
     * Returns a String representation of this MinHeap with its values.
     *
     * @return a String representation of this MinHeap and it's properties.
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MinHeap[values=").append(Arrays.toString(elements)).append(", size=").append(size).append("]");
        return sb.toString();
    }

    /**
     * Turns the tree back into a heap, provided only the root node violates the heap condition
     *
     */
    private void fixHeap() {
        int idx = TOP;
        boolean fixHeap = true;
        while(fixHeap) {
            if(getLeftChildIndex(idx) <= size) {
                Comparable parent = elements[idx];
                Comparable leftChild = getLeftChild(idx);
                Comparable rightChild = getRightChild(idx);
                Comparable smallestChild = null;
                int smallestIdx = -1;

                if (rightChild == null){
                    smallestChild = leftChild;
                    smallestIdx = getLeftChildIndex(idx);
                }
                else {
                    smallestChild = leftChild.compareTo(rightChild) < 0 ? leftChild : rightChild;
                    smallestIdx = leftChild.compareTo(rightChild) < 0 ? getLeftChildIndex(idx) : getRightChildIndex(idx);
                }

                if(fixHeap && parent.compareTo(smallestChild) > 0) {
                    elements[idx] = smallestChild;
                    idx = smallestIdx;
                    elements[idx] = parent;
                }
                else {
                    fixHeap = false;
                }
            }
            else {
                fixHeap = false;
            }
        }
    }

    /**
     * Returns the value of the left child
     *
     * @param index the index of a node in this heap
     *
     * @return the value of the left child of the given node
     */
    private Comparable getLeftChild(int index) {
        return elements[getLeftChildIndex(index)];
    }

    /**
     * Returns the index of the left child
     *
     * @param index the index of a node in this heap
     *
     * @return the index of the left child of the given node
     */
    private static int getLeftChildIndex(int index) {
        return index * 2;
    }

    /**
     * Returns the value of the parent.
     *
     * @param index the index of a node in this heap
     *
     * @return the value of the parent of the given node
     */
    private Comparable getParent(int index) {
        return elements[getParentIndex(index)];
    }

    /**
     * Returns the index of the parent.
     *
     * @param index the index of a node in this heap
     *
     * @return the index of the parent of the given node
     */
    private static int getParentIndex(int index) {
        return index / 2;
    }

    /**
     * Returns the value of the right child.
     *
     * @param index the index of a node in this heap
     *
     * @return the value of the right child of the given node
     */
    private Comparable getRightChild(int index) {
        return elements[getRightChildIndex(index)];
    }

    /**
     * Returns the index of the right child.
     *
     * @param index the index of a node in this heap
     *
     * @return the index of the right child of the given node
     */
    private static int getRightChildIndex(int index) {
        return index * 2 + 1;
    }

    /**
     * Increases the size of the heap if it is full
     */
    private void growIfNecessary() {
        if(size == elements.length - 1) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }
    }
}