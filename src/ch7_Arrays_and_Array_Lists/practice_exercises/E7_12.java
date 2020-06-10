package ch7_Arrays_and_Array_Lists.practice_exercises;

public class E7_12 {

}

/**
 * Difficulty: Medium
 * 
 * Prompt
 * Add a method
 * 		public boolean sameValues(Sequence other)
 *
 * to the Sequence class that checks whether two sequences have the same value in some order, ignoring duplicates. For example,
 * the two sequences
 *
 * 1 4 9 16 9 7 4 9 11 and 11 11 7 9 16 4 1
 *
 * would be considered identical. You will probably need one or more helper methods.
 * 
 * TIME:
 * Time Complexity:
 * Space Complexity:
 */
class Sequence {
	private int[] values;

	public Sequence(int size) {
		values = new int[size];
	}
	
	public void set(int I, int n) {
		values[i] = n;
	}
	
	public int get(int i) {
		return values[i];
	}
	
	public int size() {
		return values.length;
	}

	/**
	 * This method checks whether two sequences have the same value in some order, ignoring duplicates. The two sequences
	 * 1 4 9 16 9 7 4 9 11 and 11 11 7 9 16 4 1 would be considered identical.
	 *
	 * @return true if this and other sequence have the same values, otherwise false.
	 */
	public boolean sameValues(Sequence other) {

	}
}