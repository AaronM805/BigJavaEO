package ch14SortingAndSearching.practice_exercises;

import java.util.Arrays;

import ch14SortingAndSearching.chapter_examples.section4.MergeSort;

/**
 * Modify the merge sort algorithm to sort an array of strings in lexicographic order.
 */
/**
 * Difficulty: Easy
 */
public class E14_4 {
    public static void main(String[] args) {
        String[] strArray = {"Waterbuffalo", "Water", "boy", "Aaron", "aaron",
                              "andrea", "Asquared", "A squared", "zoo", "light"};
        
        System.out.println(Arrays.toString(strArray));
        MergeSort.sort(strArray);
        System.out.println(Arrays.toString(strArray));
    }
}