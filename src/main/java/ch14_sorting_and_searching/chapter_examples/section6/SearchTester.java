package ch14_sorting_and_searching.chapter_examples.section6;

import ch14_sorting_and_searching.chapter_examples.section4.MergeSort;

import java.util.Arrays;

import utils.ArrayUtil;
import utils.StopWatch;

public class SearchTester {
    public static void main(String[] args) {
        int[] a = ArrayUtil.randomIntArray(50, 100);
        testLinearSearch(a, 10);

        a = ArrayUtil.randomIntArray(50, 100);
        MergeSort.sort(a);
        testBinarySearch(a, 10);

        a = ArrayUtil.randomIntArray(10000000, 1000);
        testLinearSearch(a, 10);

        a = ArrayUtil.randomIntArray(10000000, 1000);
        MergeSort.sort(a);
        testBinarySearch(a, 10);
    }

    private static void testLinearSearch(int[] a, int value) {
        // System.out.println(Arrays.toString(a));
        StopWatch sw = new StopWatch();

        sw.start();
        System.out.println(Search.linearSearch(a, value));
        sw.stop();

        System.out.println("linear search took " + sw.getElapsedTime() + " ms.");
    }

    private static void testBinarySearch(int[] a, int value) {
        // System.out.println(Arrays.toString(a));
        StopWatch sw = new StopWatch();

        sw.start();
        System.out.println(Search.linearSearch(a, value));
        sw.stop();

        System.out.println("binary search took " + sw.getElapsedTime() + " ms.");
    }
}