package ch07ArraysAndArrayLists.review_exercises;

import java.util.Arrays;
import java.util.Random;

/**
 * Difficulty: Hard
 * 
 * Prompt:
 * Write a loop that fills an array values with ten random numbers between 1 and 100. Write code for two nested loops that fill
 * values with ten different random numbers between 1 and 100.
 *
 * TIME:
 * Time Complexity:
 * Space Complexity:
 */
public class R7_8 {
	public static void main(String[] args) {
		int[] random = new int[10];
		Random generator = new Random();

		for(int i = 0; i < random.length; i++) {
			random[i] = generator.nextInt(10) + 1;
		}

		System.out.println(Arrays.toString(random));

		random = new int[10];
		for(int i = 0; i < random.length; i++) {
			int ranVal = generator.nextInt(10) + 1;

			for(int j = 0; j <= i;) {
				if(i == 0) {
					random[i] = ranVal;
					break;
				}
				else if(ranVal != random[j]) {
					if(j == i) {
						random[i] = ranVal;
						break;
					}
					j++;
				}
				else {
					ranVal = generator.nextInt(10) + 1;
					j = 0;
				}
			}
		}

		System.out.println(Arrays.toString(random));
	}
}