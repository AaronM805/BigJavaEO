package ch7_Arrays_and_Array_Lists.practice_exercises;

import java.util.ArrayList;

public class E7_24 {
	public static void main(String[] args) {
		Sequence a = new Sequence();
		a.add(1);
		a.add(4);
		a.add(9);
		a.add(16);

		Sequence b = new Sequence();
		b.add(1);
		b.add(4);
		b.add(7);
		b.add(9);
		b.add(9);
		b.add(11);
		b.add(16);

		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(a.mergeSorted(b));

		a = new Sequence();
		a.add(1);
		a.add(4);
		a.add(9);
		a.add(16);

		b = new Sequence();
		b.add(1);
		b.add(4);
		b.add(7);
		b.add(9);
		b.add(6);
		b.add(11);
		b.add(16);

		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(a.mergeSorted(b));
	}
}

/**
 * Difficulty: Medium
 * 
 * Prompt
 * Add a method
 * 	public Sequence mergeSorted(Sequence other)
 *
 * that merges two sorted sequences, producing a new sorted sequence. Keep an index into each sequence, indicating how much of it
 * has been processed already. Each time, append the smallest unprocessed value from either sequence, then advance the index.
 *
 * For example, if
 * 	a is 1 4 9 16 and
 * 	b is 4 7 9 9 11
 *
 * then a.mergeSorted(b) returns the sequence 1 4 4 7 9 9 9 11 16. If a or b is not sorted, merge the longest prefixes of a and b
 * that are sorted.
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

	/**
	 * This method merges two sorted sequences, producing a new sorted sequence. If a or b is not sorted, the longest prefixes of
	 * a and b that are sorted are merged.
 	 * 
 	 * For example, if a is 1 4 9 16 and b is 4 7 9 9 11 then a.mergeSorted(b) returns the sequence 1 4 4 7 9 9 9 11 16.
	 *
	 * TIME: 00:48:19
	 * Time Complexity: O(N)
	 * Space Complexity: O(N)
	 */
	public Sequence mergeSorted(Sequence other) {

		Sequence seq = new Sequence();
		Integer[] arrayA = convertToArray(this.toString());
		Integer[] arrayB = convertToArray(other.toString());
		int idxA = 0;
		int lengthA = getLastSortedPosition(arrayA);
		int idxB = 0;
		int lengthB = getLastSortedPosition(arrayB);

		while(idxA < lengthA || idxB < lengthB) {
			if(idxA < lengthA && idxB < lengthB) {
				if(arrayA[idxA] <= arrayB[idxB]) {
					seq.add(arrayA[idxA++]);
				}
				else {
					seq.add(arrayB[idxB++]);
				}
			}
			else if(idxA < lengthA) {
				seq.add(arrayA[idxA++]);
			}
			else if(idxB < lengthB) {
				seq.add(arrayB[idxB++]);
			}
		}
		return seq;
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

	private int getLastSortedPosition(Integer[] arr) {
		int count = 1;
		int tmp = arr[0];
		boolean sorted = true;

		while(sorted) {
			if(count < arr.length && arr[count] >= tmp) {
				tmp = arr[count];
				count++;
			}
			else {
				sorted = false;
			}	
		}

		return count;
	}

	private void merge(Sequence dst, Integer[] src, int index) {
		while(index < src.length) {
			dst.add(src[index++]);
		}
	}
}