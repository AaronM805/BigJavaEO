package ch14_sorting_and_searching.practice_exercises;

import java.util.Arrays;

import ch14_sorting_and_searching.practice_exercises.utils.ArrayUtil;

public class E14_2 {
    public static void main(String[] args) {
        Coin[] coins = ArrayUtil.randomCoinArray(10, 300);
        SelectionSorter sort = new SelectionSorter();

        System.out.println("Unsorted array: " + Arrays.toString(coins));
        sort.coinSort(coins);
        System.out.println();
        System.out.println("Sorted array: " + Arrays.toString(coins));
    }
}