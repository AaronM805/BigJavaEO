package ch13Recursion.review_exercises;

/**
 * Difficulty: Easy
 * 
 * Prompt:
 * Write a recursive definition of n! = 1 x 2 x … x n, similar to the recursive definition of the Fibonacci numbers.
 * 
 * TIME:
 * Time Complexity: O(N)
 * Space Complexity: O(N) since we are stacking recursive calls (?)
 */
public class R13_8 {
	public static void main(String[] args) {
		System.out.println("2! = " + factorial(2) + "\texpected: 2");
		System.out.println("4! = " + factorial(4) + "\texpected: 24");
		System.out.println("5! = " + factorial(5) + "\texpected: 120");
		System.out.println("10! = " + factorial(10) + "\texpected: 3628800");
		System.out.println("50! = " + factorial(50) + "\texpected: 3.041409320e64");
	}

	public static long factorial(long n) {
		if(n == 1) {
			return 1;
		}
		else {
			return n * factorial(n - 1);
		}
	}
}