package ch14_sorting_and_searching.practice_exercises.sorts;

import ch14_sorting_and_searching.practice_exercises.Coin;
import utils.ArrayUtil;

public class SelectionSorter {
    

    /**
     * Sorts an array, using selection sort.
     * @param a the array to sort
     */
    public static void coinSort(Coin[] coins) {
        for (int i = 0; i < coins.length - 1; i++) {
            int minPos = minimumPosition(coins, i);
            ArrayUtil.swap(coins, minPos, i);
        }
    }
    
    /**
     * Finds the largest element in a tail range of the array.
     * @param a the array to sort
     * @param from the first position in a to compare
     * @return the position of the largest element in the
     * range a[from] . . . a[a.length - 1]
     */
    private static int minimumPosition(Coin[] coins, int from) {
        int minPos = from;
        for (int i = from + 1; i < coins.length; i++) {
            if (coins[i].getValue() < coins[minPos].getValue()) { minPos = i; }
        }
        return minPos;
    }
}