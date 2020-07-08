package ch14_sorting_and_searching.practice_exercises;

import java.util.Arrays;

import ch14_sorting_and_searching.practice_exercises.sorts.SelectionSorter;
import utils.ArrayUtil;

public class E14_2 {
    public static void main(String[] args) {
        Coin[] coins = ArrayUtil.randomCoinArray(10, 300);

        System.out.println("Unsorted array: " + Arrays.toString(coins));
        SelectionSorter.coinSort(coins);
        System.out.println();
        System.out.println("Sorted array: " + Arrays.toString(coins));
    }
}