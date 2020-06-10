package ch7_Arrays_and_Array_Lists.practice_exercises;

import java.util.Arrays;
import java.util.Random;

public class E7_17 {

	public static void main(String[] args) {
		Table table = new Table(5, 5);
		Random random = new Random();

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				table.set(i, j, random.nextInt(50));
			}
		}

		System.out.println(table);
		System.out.println(table.sum(3, true));
		System.out.println(table.sum(2, false));
	}
}


/**
 * Difficulty: Medium
 * 
 * Prompt
 * add method
 *	public double sum(int i, boolean horizontal)
 *
 * that returns the sum of the ith row (if horizonal is true) or column (if horizontal is false)
 */
class Table {
	private int[][] values;

	public Table(int rows, int columns) {
		values = new int[rows][columns];
	}

	public void set(int i, int j, int n) {
		values[i][j] = n;
	}

	/**
	 * This method returns the sum of the ith row (if horizontal is true) or column (if horizontal is false).
	 *
	 * @param i - the row or column to add.
	 * @param horizontal - sums the row if true, column otherwise.
	 *
	 * @return the sum of row or column i.
	 */
	public double sum(int i, boolean horizontal) {
		double sum = 0;

		if(horizontal) {
			int row = i - 1;
			for(int col = 0; col < values[row].length; col++) {
				sum += values[row][col];
			}
		}
		else {
			int col = i - 1;
			for(int row = 0; row < values.length; row++) {
				sum += values[row][col];
			}
		}

		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("[").append("\n");
		for(int i = 0; i < values.length; i++) {
			sb.append(Arrays.toString(values[i])).append("\n");
		}
		sb.append("]");

		return sb.toString();
	}
}