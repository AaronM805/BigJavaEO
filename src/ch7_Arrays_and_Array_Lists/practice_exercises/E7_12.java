package ch7_Arrays_and_Array_Lists.practice_exercises;

import java.util.Arrays;

import utils.ArrayUtil;

public class E7_12 {
	public static void main(String[] args) {
		Sequence seq1 = new Sequence(10);
		Sequence seq2 = new Sequence(7);

		int[] tmp = {1, 4, 9, 16, 9, 7, 4, 9, 11, 1};
		fill(seq1, tmp);

		tmp = new int[]{11, 11, 7, 9, 16, 4, 1};
		fill(seq2, tmp);

		System.out.println("seq1: " + seq1);
		System.out.println("seq2: " + seq2);
		System.out.println("Expected: true\tActual: " + seq1.sameValues(seq2));

		Sequence seq3 = new Sequence(10);

		fill(seq3, ArrayUtil.randomIntArray(15, 100));
		System.out.println("seq1: " + seq1);
		System.out.println("seq2: " + seq2);
		System.out.println("seq3: " + seq3);
		System.out.println("sameValue: " + seq1.sameValues(seq3));

		fill(seq3, ArrayUtil.randomIntArray(15, 100));
		System.out.println("seq1: " + seq1);
		System.out.println("seq2: " + seq2);
		System.out.println("seq3: " + seq3);
		System.out.println("sameValue: " + seq3.sameValues(seq3));
		
	}

	private static void fill(Sequence dest, int[] src) {
		for(int i = 0; i < dest.size(); i++) {
			dest.set(i, src[i]);
		}
	}
}

/**
 * Difficulty: Medium
 * 
 * Prompt
 * Add method
 * 		public boolean sameValues(Sequence other)
 *
 * to the Sequence class that checks whether two sequences have the same value in some order, ignoring duplicates. For example,
 * the two sequences
 *
 * 1   4 9 16  9 7 4 9 11 and
 * 11 11 7  9 16 4 1
 *
 * would be considered identical. You will probably need one or more helper methods.
 * 
 * TIME: 00:37:33
 */
class Sequence {
	private int[] values;

	public Sequence(int size) {
		values = new int[size];
	}
	
	public void set(int i, int n) {
		values[i] = n;
	}
	
	public int get(int i) {
		return values[i];
	}

	/**
	 * This method checks whether two sequences have the same value in some order, ignoring duplicates. The two sequences
	 * 1 4 9 16 9 7 4 9 11 and 11 11 7 9 16 4 1 would be considered identical.
	 *
	 * @return true if this and other sequence have the same values, otherwise false.
	 *
	 * Time Complexity: O(N^2)
 	 * Space Complexity: O(1)
	 */
	public boolean sameValues(Sequence other) {
		/*
		 * Assuming that ignoring duplicates means that we process them even if duplicates then, we would do the following:
		 *
		 * example:
		 * 1   4 9 16  9 7 4 9 11
 		 * 11 11 7  9 16 4 1
 		 *
		 */
		int thisSize = size();
		int otherSize = other.size();
		boolean isSame = false;

		for(int i = 0; i < thisSize; i++) {
			for(int j = 0; j < otherSize; j++) {
				if(this.get(i) == other.get(j)) {
					isSame = true;
				}
				else if(j == otherSize - 1 && !isSame) {
					return isSame;
				}
			}
		}
		return isSame;
	}
	
	public int size() {
		return values.length;
	}

	public String toString() {
		return Arrays.toString(values);
	}
}