package ch7_Arrays_and_Array_Lists.practice_exercises;

import java.util.ArrayList;

public class E7_23 {
	public static void main(String[] args) {
		Sequence a = new Sequence();
		a.add(1);
		a.add(4);
		a.add(9);
		a.add(16);

		Sequence b = new Sequence();
		b.add(1);
		b.add(9);
		b.add(4);
		b.add(7);
		b.add(9);
		b.add(4);
		b.add(16);
		b.add(9);
		b.add(11);

		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(a.merge(b));
		System.out.println(b.merge(a));
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
}

/**
 * Difficulty: Medium
 * 
 * Prompt
 * Add a method
 *		public Sequence merge(Sequence other)
 *
 * that merges two sequences, alternating elements from both sequences. If one sequence is shorter than the other, then alternate
 * as long as you can and then append the remaining elements from the longer sequence.
 *
 * For example, if
 *	a is 1 4 9 16 and
 *	b is 9 7 4 9 11
 *
 * then a.merge(b) returns the sequence 1 9 4 7 9 4 16 9 11 without modifying a or b.
 */
class Sequence {
	private ArrayList<Integer> values;

	public Sequence() {
		values = new ArrayList<Integer>();
	}

	public void add(int n) {
		values.add(n);
	}

	/**
	 * This method creates a new sequence, appending this and the other sequence, without modifying either sequence.
	 *
	 * For example, if a is 1 4 9 16 and b is the sequence 9 7 4 9 11 then the call to a.append(b) returns the sequence
	 * 1 4 9 16 9 7 4 9 11 without modifying a or b.
	 *
	 * @param other - the other sequence that will be joined to this sequence.
	 *
	 * @return a sequence consisting of this and other.
	 *
	 * TIME: 00:33:16
	 * Time Complexity: O(N)
	 * Space Complexity: O(N)
	 */
	public Sequence append(Sequence other) {

		Sequence appendedSeq = new Sequence();
		Integer[] arrayA = convertToArray(this.toString());
		Integer[] arrayB = convertToArray(other.toString());

		append(appendedSeq, arrayA);
		append(appendedSeq, arrayB);

		return appendedSeq;
	}

	/**
	 * This method merges two sequences, alternating elements from both sequences.
	 *
	 * For example, if a is 1 4 9 16 and b is 9 7 4 9 11 then a.merge(b) returns the sequence 1 9 4 7 9 4 16 9 11 without
	 * modifying a or b.
	 *
	 * TIME: 00:16:31
	 * Time Complexity: O(N)
	 * Space Complexity: O(N)
	 */
	public Sequence merge(Sequence other) {

		Sequence appendedSeq = new Sequence();
		Integer[] arrayA = convertToArray(this.toString());
		Integer[] arrayB = convertToArray(other.toString());

		int count = 0;
		while(count < arrayA.length && count < arrayB.length) {
			appendedSeq.add(arrayA[count]);
			appendedSeq.add(arrayB[count]);
			count++;
		}

		if(count < arrayA.length) {
			merge(appendedSeq, arrayA, count);
		}
		else {
			merge(appendedSeq, arrayB, count);
		}

		return appendedSeq;
	}

	public String toString() {
		return values.toString();
	}

	private void append(Sequence dest, Integer[] src) {

		for(Integer element : src) {
			dest.add(element);
		}
	}

	private Integer[] convertToArray(String str) {
		str = str.replaceAll("\\[|\\]", "");
		String[] arr = str.split(",");
		Integer[] numArray = new Integer[arr.length];

		for(int i = 0; i < arr.length; i++) {
			numArray[i] = Integer.valueOf(arr[i].trim());
		}

		return numArray;
	}

	private void merge(Sequence dst, Integer[] src, int index) {
		while(index < src.length) {
			dst.add(src[index++]);
		}
	}
}