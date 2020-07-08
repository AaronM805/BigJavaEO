package ch7_Arrays_and_Array_Lists.practice_exercises;

import utils.ArrayUtil;

import java.util.Arrays;

/**
 * Difficulty: Medium
 * 
 * Prompt
 * Write a program that generates a sequence of 20 random values between 0 and 99 in an array, prints the sequence, sorts it, and
 * prints the sorted sequence. Use the sort method from the standard Java library.
 * 
 * TIME:
 * Time Complexity: O(N logN)
 * Space Complexity: O(N)
 */
public class E7_15 {
	public static void main(String[] args) {
		// O(N)
		int[] a = ArrayUtil.randomIntArray(20, 100);
		System.out.println(Arrays.toString(a));
		// O(N logN)
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}