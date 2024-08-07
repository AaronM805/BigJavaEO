package ch07ArraysAndArrayLists.review_exercises;

import java.util.Arrays;

/**
 * Difficulty: Medium
 * 
 * Prompt:
 * Write enhanced for loops for the following tasks:
 *      a. Printing all elements of an array in a single row, separated by spaces.
 *      b. Computing the maximum of all elements in an array.
 *      c. Counting how many elements in an array are negative
 *
 * TIME:
 * Time Complexity:
 * Space Complexity:
 */
public class R7_11 {
    public static void main(String[] args) {
	    // a. Printing all elements of an array in a single row, separated by spaces.
		int[] a = {1, -4, 8, -9, 3, -2, 10};
		printArrayInSingleLine(a);
        
		// b. Computing the maximum of all elements in an array.
        int max = maximum(a);
        System.out.println("\n" + Arrays.toString(a));
		System.out.println("max value: " + max);
		// c. Counting how many elements in an array are negative
        int negativeCnt = countNegatives(a);
        System.out.println("\n" + Arrays.toString(a));
        System.out.println("number of negative values: " + negativeCnt);
    }

    private static void printArrayInSingleLine(int[] a) {
        for(int element : a) {
			System.out.print(element + " ");
        }
        System.out.println("\n");
    }

    private static int maximum(int[] a) {
        int max = Integer.MIN_VALUE;
		for(int element : a) {
			if(element > max)
				max = element;
        }
        return max;
    }

    private static int countNegatives(int[] a) {
        int negCount = 0;
		for(int element : a) {
			if(element < 0) {
                negCount++;
            }
        }
        return negCount;
    }
}