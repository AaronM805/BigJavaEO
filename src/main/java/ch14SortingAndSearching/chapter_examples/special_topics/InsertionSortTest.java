package ch14SortingAndSearching.chapter_examples.special_topics;

import java.util.Arrays;

import utils.ArrayUtil;
import utils.StopWatch;

public class InsertionSortTest {
    public static void main(String[] args) {
        int[] a = ArrayUtil.randomIntArray(10000, 100000);

        System.out.println(Arrays.toString(a) + "\n\n");
        StopWatch sw = new StopWatch();
        sw.start();
        InsertionSort.sort(a);
        sw.stop();
        System.out.println(Arrays.toString(a));

        System.out.println("InsertionSort took " + sw.getElapsedTime() + " ms.");
    }
}