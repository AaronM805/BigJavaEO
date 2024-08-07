package ch14SortingAndSearching.chapter_examples.section4;

import java.util.Arrays;

import utils.ArrayUtil;

/**
 * This class tests the Merge Sort sort method.
 *
 * @author Aaron N. Martinez
 * @version 0.1
 */
public class MergeSortTester {
    public static void main(String[] args) {
        int[] arr = ArrayUtil.randomIntArray(20, 100);

        System.out.println(Arrays.toString(arr));
        MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}