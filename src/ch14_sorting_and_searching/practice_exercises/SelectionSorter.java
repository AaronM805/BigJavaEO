package ch14_sorting_and_searching.practice_exercises;

import ch14_sorting_and_searching.practice_exercises.utils.ArrayUtil;

public class SelectionSorter {
    /**
     * Sorts an array, using selection sort, in descending order.
     * 
     * @param a the array to sort
     */
    public static void descSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int maxPos = maximumPosition(a, i);
            ArrayUtil.swap(a, maxPos, i);
        }
    }

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
     * @return the position of the largest element in the range a[from] . . . a[a.length - 1]
     */
    private static int maximumPosition(int[] a, int from) {
        int maxPos = from;
        for (int i = from + 1; i < a.length; i++) {
            if (a[i] > a[maxPos]) { maxPos = i; }
        }
        return maxPos;
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