package ch01Introduction.practiceExercises;

/**
 * Write a program that prints the sum of the first ten positive integers, 1 + 2 + ... + 10.
 *
 * Difficulty: medium
 */
public class E1_2 {

	public int sum() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		return sum;
	}
}
