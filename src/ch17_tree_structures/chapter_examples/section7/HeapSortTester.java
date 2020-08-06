package ch17_tree_structures.chapter_examples.section7;

import java.util.Arrays;

import utils.ArrayUtil;

/**
 * Tester class for HeapSort
 */
public class HeapSortTester {
    public static void main(String[] args) {
        int[] a = ArrayUtil.randomIntArray(500_000, 1_000_000);

        // System.out.println(Arrays.toString(a));
        HeapSort.sort(a);
        // System.out.println(Arrays.toString(a));
    }
}