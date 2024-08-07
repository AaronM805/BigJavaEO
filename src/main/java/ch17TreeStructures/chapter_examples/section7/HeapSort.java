package ch17TreeStructures.chapter_examples.section7;

import utils.ArrayUtil;
/**
 * The sort method of this class sorts an array, using the heap sort algorithm.
 */
public class HeapSort {

    /**
     * Sorts an array, using selection sort.
     *
     * @param a the array to sort
     */
    public static void sort(int[] a) {
        int n = a.length - 1;
        // starting at the parent of n
        for(int i = (n - 1) / 2; i >= 0; i--) {
            fixHeap(a, i, n);
        }

        while(n > 0) {
            ArrayUtil.swap(a, 0, n);
            n--;
            fixHeap(a, 0, n);
        }
    }

    /**
     * Ensures the heap property for a subtree, provided its children already fulfill the heap property.
     *
     * @param a the array to sort
     * @param rootIndex the index of the subtree to be fixed
     * @param lastIndex the last valid index of the tree that contains the subtree to be fixed
     *
     */
    private static void fixHeap(int[] a, int rootIndex, int lastIndex) {
        //Remove the root
        int rootValue = a[rootIndex];

        // Promote children while they are larger than the root
        int index = rootIndex;
        boolean more = true;
        while(more) {
            int childIndex = getLeftChildIndex(index);
            if(childIndex <= lastIndex) {
                // use right child instead if it is larger
                int rightChildIndex = getRightChildIndex(index);
                if(rightChildIndex <= lastIndex
                    && a[rightChildIndex] > a[childIndex]) {

                    childIndex = rightChildIndex;
                }

                if(a[childIndex] > rootValue) {
                    // promote child
                    a[index] = a[childIndex];
                    index = childIndex;
                }
                else {
                    // root value is larger than both children
                    more = false;
                }
            }
            else {
                // no children
                more = false;
            }
        }
        a[index] = rootValue;
    }

    /**
     * Returns the index of the left child.
     *
     * @param index the index of a node in this heap
     *
     * @return the index of the left child of the given node
     */
    private static int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }

    /**
     * Returns the index of the right child.
     *
     * @param index the index of a node in this heap
     *
     * @return the index of the right child of the given node
     */
    private static int getRightChildIndex(int index) {
        return 2 * index + 2;
    }
}