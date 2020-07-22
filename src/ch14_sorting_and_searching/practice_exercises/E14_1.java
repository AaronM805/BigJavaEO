package ch14_sorting_and_searching.practice_exercises;

import ch14_sorting_and_searching.chapter_examples.section1.SelectionSort;

import java.util.Arrays;

import utils.ArrayUtil;

/**
 * Modify the selection sort algorithm to sort an array of intergers in descending order.
 */
/**
 * Difficulty: Easy
 */
public class E14_1 {
    public static void main(String[] args) {
        int[] values = ArrayUtil.randomIntArray(100, 300);

        System.out.println("Unsorted array: " + Arrays.toString(values));
        SelectionSort.sort(values, false);
        System.out.println();
        System.out.println("Sorted array: " + Arrays.toString(values));
    }
}