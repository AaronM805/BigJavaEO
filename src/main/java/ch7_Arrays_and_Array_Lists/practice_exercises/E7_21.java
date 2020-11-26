package ch7_Arrays_and_Array_Lists.practice_exercises;

import java.util.Scanner;
/**
 * Difficulty: Medium
 * 
 * Prompt
 *  Improve the program in Exercise 18 by adding captions for each bar. Prompt the user for the captions and data values. The output should look like this:
 *
 *	      Egypt **********************
 *	     France ****************************************
 *	      Japan *****************************
 *	    Uruguay ***************************
 *	Switzerland **************
 *
 * You may assume that all values are positive. First figure out the maximum value. That value's bar should be drawn with 40
 * asterisks. Shorter bars should use proportionally fewer asterisks.
 *
 * TIME: 00:41:05
 * Time Complexity: O(N^2)
 * Space Complexity: O(1)
 */
public class E7_21 {
	public static final int MAX = 40;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number from 5 to 10: ");
		int size = input.nextInt();
		int[] array = new int[size];

		System.out.print("Enter " + size +  " values, separated by spaces (enter Q, when done): ");

		int pos = 0;
		while(input.hasNextInt() && pos < size) {
			array[pos] = input.nextInt();
			pos++;
		}

		input.close();

		drawGraph(array);
	}

	/*
	 * Time Complexity: O(N^2)
 	 * Space Complexity: O(1)
	 */
	public static void drawGraph(int[] array) {
		double largest = (double) findLargest(array);

		for(int i = 0; i < array.length; i++) {
			int ceiling = (int) ((array[i] / largest) * MAX);
			for(int j = 0; j < ceiling; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
 	 * Time Complexity: O(N)
 	 * Space Complexity: O(1)
	*/
	private static int findLargest(int[] arr) {
		int largest = arr[0];

		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
}