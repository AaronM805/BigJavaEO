package ch14_sorting_and_searching.chapter_examples.section2;

import java.util.Scanner;

import ch14_sorting_and_searching.chapter_examples.section1.SelectionSort;
import ch14_sorting_and_searching.chapter_examples.section1.SelectionSorter;

import utils.ArrayUtil;
import utils.StopWatch;

/**
 * This program measures how long it takes to sort an array of user-specified size with the selection sort algorithm.
 */
public class SelectionSortTimer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = in.nextInt();
        in.close();

        // Construct random array
        int[] a = ArrayUtil.randomIntArray(n, 100);

        // Use stopwatch to time selection sort
        StopWatch timer = new StopWatch();

        timer.start();
        SelectionSorter.sort(a);
        timer.stop();

        System.out.println("Elapsed time: " + timer.getElapsedTime() + " ms");

        // Construct random array
        a = ArrayUtil.randomIntArray(n, 100);

        // Use stopwatch to time selection sort
        timer = new StopWatch();

        timer.start();
        SelectionSort.sort(a, true);
        timer.stop();

        System.out.println("Elapsed time: " + timer.getElapsedTime() + " ms");
    }
}