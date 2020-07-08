package ch7_Arrays_and_Array_Lists.practice_exercises;

public class E7_16 {

}

/**
 * Difficulty: Medium
 * 
 * Prompt
 * Add a method 
		public double neighborAverage(int row, int column)
 * 
 * that computes the average of the neighbors of a table element in eight directions. However, if the element is located at
 * the boundary of the array, include only the neighbors that are in the table.
 *
 * For example, if row and column are both 0, there re only three neighbors.
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
	 * This method computes the average of the neighbors of a table element in eight directions. If the element is located at the
	 * boundary of the array, include only the neighbors that are in the table.
 	 *
 	 * For example, if row and column are both 0, there re only three neighbors.
	 *
	 * @param row - the row position
	 * @param column - the column position
	 *
	 * @return the average of the neighbors of a table in eight directions of position row x column.
	 *
 	 * TIME: 00:24:47
 	 * Time Complexity: O(N logN)
 	 * Space Complexity: O(N)
	 */
	public double neighborAverage(int row, int column) {

		double sum = 0;

		// if(row == 0) {
		// 	if(column)
		// }

		/*
		[i - 1][j - 1] [i - 1][j] [i - 1][j + 1]
		[i][j - 1]	   [i][j]	  [i][j + 1]
		[i + 1][j - 1] [i + 1][j] [i + 1][j + 1]
		*/

		return sum / values.length;
	}
}