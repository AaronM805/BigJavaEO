package ch14_sorting_and_searching.practice_exercises;

import java.util.Arrays;

import ch14_sorting_and_searching.practice_exercises.sorts.SelectionSorter;
import utils.ArrayUtil;

/**
 * Tester class for SelectionSort.
 */
public class E14_1 {
    public static void main(String[] args) {
        int[] values = ArrayUtil.randomIntArray(100, 300);
        SelectionSorter sort = new SelectionSorter();

        System.out.println("Unsorted array: " + Arrays.toString(values));
        sort.descSort(values);
        System.out.println();
        System.out.println("Sorted array: " + Arrays.toString(values));
    }
}