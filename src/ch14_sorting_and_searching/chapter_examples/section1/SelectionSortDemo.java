package ch14_sorting_and_searching.chapter_examples.section1;

import java.util.Arrays;

import utils.ArrayUtil;

/**
 * This program demonstrates the selection sort algorithm by sorting an array that is filled with random numbers.
 */
public class SelectionSortDemo {
    public static void main(String[] args) {
        int[] a = ArrayUtil.randomIntArray(20, 100);
        System.out.println("Using SelectionSorter");
        System.out.println(Arrays.toString(a));
        SelectionSorter.sort(a);
        System.out.println(Arrays.toString(a));

        a = ArrayUtil.randomIntArray(20, 100);
        System.out.println("Using SelectionSort");
        System.out.println(Arrays.toString(a));
        SelectionSort.sort(a, true);
        System.out.println(Arrays.toString(a));
    }
}