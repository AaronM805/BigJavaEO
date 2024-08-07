package ch07ArraysAndArrayLists.practice_exercises;

import ch07ArraysAndArrayLists.practice_exercises.pojo.ArraySequence;

import utils.ArrayUtil;

public class E7_12 {
	public static void main(String[] args) {
		ArraySequence seq1 = new ArraySequence(10);
		ArraySequence seq2 = new ArraySequence(7);

		int[] tmp = {1, 4, 9, 16, 9, 7, 4, 9, 11, 1};
		fill(seq1, tmp);

		tmp = new int[]{11, 11, 7, 9, 16, 4, 1};
		fill(seq2, tmp);

		System.out.println("seq1: " + seq1);
		System.out.println("seq2: " + seq2);
		System.out.println("Expected: true\tActual: " + seq1.sameValues(seq2));

		ArraySequence seq3 = new ArraySequence(10);

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

	private static void fill(ArraySequence dest, int[] src) {
		for(int i = 0; i < dest.size(); i++) {
			dest.set(i, src[i]);
		}
	}
}