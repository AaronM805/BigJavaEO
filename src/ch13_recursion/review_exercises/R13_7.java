package ch13_recursion.review_exercises;

import java.util.Random;
/**
 * Difficulty: Medium
 * 
 * Prompt:
 * Improve upon Exercise 14.6 by computing x^n and (x^(n/2))2 if n is even. Why is this approach significantly faster?
 *
 * Hint: Compute x1023 and x1024 both ways.
 * 
 * TIME:
 * Time Complexity: O(N)
 * Space Complexity: O(N) since we are stacking recursive calls (?)
 */
public class R13_7 {
	public static void main(String[] args) {
		Random random = new Random();

		int n = random.nextInt(10) + 1;
		int x = random.nextInt(10) + 1;
		// System.out.printf("%d^%d = %-10d\texpected:%10d\n", x, n, power(x, n), (int)Math.pow(x, n));
		
		// n = random.nextInt(10) + 1;
		// x = random.nextInt(10) + 1;
		// System.out.printf("%d^%d = %-10d\texpected:%10d\n", x, n, power(x, n), (int)Math.pow(x, n));

		// n = random.nextInt(10) + 1;
		// x = random.nextInt(10) + 1;
		// System.out.printf("%d^%d = %-10d\texpected:%10d\n", x, n, power(x, n), (int)Math.pow(x, n));

		// n = random.nextInt(10) + 1;
		// x = random.nextInt(10) + 1;
		// System.out.printf("%d^%d = %-10d\texpected:%10d\n", x, n, power(x, n), (int)Math.pow(x, n));

		// n = random.nextInt(10) + 1;
		// x = random.nextInt(10) + 1;
		// System.out.printf("%d^%d = %-10d\texpected:%10d\n", x, n, power(x, n), (int)Math.pow(x, n));

		n = 1023;
		x = random.nextInt(10) + 1;
		System.out.printf("%d^%d = %-10d\texpected:%10d\n", x, n, power(x, n), (long)Math.pow(x, n));
		System.out.printf("%d^%d = %-10d\texpected:%10d\n", x, n, R13_6.power(x, n), (long)Math.pow(x, n));

		n = 1024;
		System.out.printf("%d^%d = %-10d\texpected:%10d\n", x, n, power(x, n), (long)Math.pow(x, n));
		System.out.printf("%d^%d = %-10d\texpected:%10d\n", x, n, R13_6.power(x, n), (long)Math.pow(x, n));
	}

	public static long power(long x, long n) {
		if(n <= 1) {
			return x;
		}
		else if(n == 2) {
			return x * x;
		}
		else if(n % 2 == 0) {
			return (long) Math.pow(x * power(x, (n - 1) / 2), 2);
		}
		else {
			return x * power(x, n - 1);
		}
	}
}