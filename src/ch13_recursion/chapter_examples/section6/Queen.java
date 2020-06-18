package ch13_recursion.chapter_examples.section6;

/**
 * A queen in the eight queens problem.
 */
public class Queen {
	private int row;
	private int column;

	/**
	 * Constructs a queen at a given position.
	 *
	 * @param row the row
	 * @param column the column
	 */
	public Queen(int row, int column) {
		this.row = row;
		this.column = column;
	}

	/**
	 * Checks whether this queen attacks another.
	 *
	 * @param other the other queen
	 *
	 * @return true if this and the other queen are in the same row, column, or diagonal
	 */
	public boolean attacks(Queen other) {
		return row == other.row || column == other.column
			|| Math.abs(row - other.row) == Math.abs(column - other.column);
	}

	public String toString() {
		return "" + "abcdefgh".charAt(column) + (row + 1);
	}
}