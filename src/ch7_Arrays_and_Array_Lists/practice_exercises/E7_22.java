package ch7_Arrays_and_Array_Lists.practice_exercises;

import java.util.ArrayList;

public class E7_22 {
	public static void main(String[] args) {
		Sequence a = new Sequence();
		a.add(1);
		a.add(4);
		a.add(9);
		a.add(16);
		
		Sequence b = new Sequence();
		b.add(9);
		b.add(7);
		b.add(4);
		b.add(9);
		b.add(11);

		System.out.println(a);
		System.out.println(b);
		System.out.println(a.append(b));
		System.out.println(b.append(a));
		System.out.println(a);
		System.out.println(b);
	}
}

/**
 * Difficulty: Easy
 * 
 * Prompt
 * 	Add a method
 *		public Sequence append(Sequence other)
 *
 * that creates a new sequence, appending this and the other sequence, without modifying either sequence. For example, if
 *	a is 1 4 9 16 and
 * 	b is the sequence 9 7 4 9 11
 *
 * then the call to a.append(b) returns the sequence 1 4 9 16 9 7 4 9 11 without modifying a or b.
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

		String a = this.toString();
		String b = other.toString();

		Integer[] arrayA = convertToArray(a);
		Integer[] arrayB = convertToArray(b);

		append(appendedSeq, arrayA);
		append(appendedSeq, arrayB);

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
}