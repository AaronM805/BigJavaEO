package ch13Recursion.chapter_examples.section6;

import java.util.Arrays;

/**
 * A partial solution to the eight queens puzzle.
 */
public class PartialSolution {
	private Queen[] queens;
	private static final int NQUEENS = 8;

	public static final int ACCEPT;
	public static final int ABANDON;
	public static final int CONTINUE;

	static {
		ACCEPT = 1;
		ABANDON = 2;
		CONTINUE = 3;
	}
	
	/**
	 * Constructs a partial solution of a given size.
	 *
	 * @param size the size.
	 */
	public PartialSolution(int size) {
		queens = new Queen[size];
	}

	/**
	 * Examine a partial solution.
	 *
	 * @return one of ACCEPT, ABANDON, CONTINUE
	 */
	public int examine() {
		for(int i = 0; i < queens.length; i++) {
			for(int j = i + 1; j < queens.length; j++) {
				if(queens[i].attacks(queens[j])) {
					return ABANDON;
				}
			}
		}

		if(queens.length == NQUEENS) {
			return ACCEPT;
		}
		else {
			return CONTINUE;
		}
	}

	/**
	 * Yields all extensions of this partial solution.
	 *
	 * @return an array of partial solutions that extend this solutions.
	 */
	public PartialSolution[] extend() {

		// Generate a new solution for each column
		PartialSolution[] result = new PartialSolution[NQUEENS];

		for(int i = 0; i < result.length; i++) {
			int size = queens.length;

			// The new solution has one more row than this one
			result[i] = new PartialSolution(size + 1);

			// Copy this solution into the new one
			for(int j = 0; j < size; j++) {
				result[i].queens[j] = queens[j];
			}

			// Append the new queen into the ith column
			result[i].queens[size] = new Queen(size, i);
		}
		return result;
	}

	public String toString() {
		return Arrays.toString(queens);
	}
}