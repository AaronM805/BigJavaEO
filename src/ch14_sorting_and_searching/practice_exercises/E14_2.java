package ch14_sorting_and_searching.practice_exercises;

import java.util.Arrays;

import ch14_sorting_and_searching.practice_exercises.pojo.Coin;
import ch14_sorting_and_searching.chapter_examples.section1.SelectionSort;
import utils.ArrayUtil;

/**
 * Modify the selection sort algorithm to sort an array of coins by their value.
 */
/**
 * Difficulty: Easy
 */
public class E14_2 {
    public static void main(String[] args) {
        Coin[] coins = ArrayUtil.randomCoinArray(10, 300);

        System.out.println("Unsorted array: " + Arrays.toString(coins));
        SelectionSort.sort(coins);
        System.out.println();
        System.out.println("Sorted array: " + Arrays.toString(coins));
    }
}