package ch01Introduction.practiceExercises;

/**
 * Write a program that prints the product of the first ten positive integers, 1 × 2 × ... ×
 * 10.
 *
 * Difficulty: medium
 */
public class E1_3 {

	public long product() {
		long product = 1;
		
		for (int i = 1; i <= 10; i++) {
			product *= i;
		}
		return product;
	}
}
