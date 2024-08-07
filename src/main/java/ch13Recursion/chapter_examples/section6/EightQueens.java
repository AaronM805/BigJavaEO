package ch13Recursion.chapter_examples.section6;

/**
 * This class solves the eight queens problem using backtracking.
 */
public class EightQueens {
	public static void main(String[] args) {
		solve(new PartialSolution(0));
	}

	/**
	 * Prints all solutions to the problem that can be extended from a given partial solution.
	 *
	 * @param solution the partial solution
	 */
	public static void solve(PartialSolution solution) {
		int examine = solution.examine();

		if(examine == PartialSolution.ACCEPT) {
			System.out.println(solution);
		}
		else if(examine == PartialSolution.CONTINUE) {
			for(PartialSolution partial : solution.extend()) {
				solve(partial);
			}
		}
	}
}