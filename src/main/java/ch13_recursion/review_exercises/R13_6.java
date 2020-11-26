package ch13_recursion.review_exercises;

/**
 * Difficulty: Easy
 * 
 * Prompt:
 * Write a recursive definition of x^n, where n >= 0, similar to the recursive definition of the Fibonacci numbers.
 *
 * Hint: How do you compute x^n from x^(n-1)? How does the recursion terminate?
 * 
 * TIME:
 * Time Complexity: O(N)
 * Space Complexity: O(N) since we are stacking recursive calls (?)
 */
public class R13_6 {
	public static void main(String[] args) {
		System.out.println("2^3 = " + power(2, 3) + ";\texpected: 8");
		System.out.println("2^8 = " + power(2, 8) + ";\texpected: 256");
		System.out.println("3^3 = " + power(3, 3) + ";\texpected: 27");
		System.out.println("4^3 = " + power(4, 3) + ";\texpected: 64");
		System.out.println("10^5 = " + power(10, 5) + ";\texpected: 100000");
	}

	public static long power(long x, long n) {
		if(n <= 1) {
			return x;
		}
		else {
			return x * power(x, n - 1);
		}
	}
}