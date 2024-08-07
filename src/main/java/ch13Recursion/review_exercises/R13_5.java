package ch13Recursion.review_exercises;

import java.util.Arrays;

import utils.ArrayUtil;

/**
 * Difficulty: Easy
 * 
 * Prompt:
 * Outline, but do not implement, a recursive solution for sorting an array of numbers.
 *
 * Hint: First sort the subarray without the initial element
 * 
 * TIME:
 * Time Complexity: O(N)
 * Space Complexity: O(N) since we are stacking recursive calls (?)
 */
public class R13_5 {
	public static void main(String[] args) {
		int[] arr = ArrayUtil.randomIntArray(10, 50);

		System.out.println(Arrays.toString(arr));
		sort(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void sort(int[] arr) {
		sort(arr, 0, arr.length - 1);
	}

	private static void sort(int[] arr, int front, int back) {
		System.out.printf("front: %d\tback: %d\n", front, back);
		if(front == back) {
			return;
		}

		// when passing in variable recursively, don't use <VAR>++ since it will first pass in initial value and then it will
		// increment. Use <VAR> + 1
		sort(arr, front + 1, back);

		for(int i = front; i < back; i++) {
			if(arr[i] > arr[i+1]) {
				int tmp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = tmp;
			}
		}
	}
}