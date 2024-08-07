package ch14SortingAndSearching.chapter_examples.special_topics;

import java.util.Arrays;

import utils.ArrayUtil;

/**
 * This class tests the quick sort algorithm
 *
 * @author Aaron N Martinez
 * @version 0.1
 */
public class QuickSortTester {
    public static void main(String[] args) {
        int[] arr = ArrayUtil.randomIntArray(100, 10000);

        System.out.println(Arrays.toString(arr));
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}