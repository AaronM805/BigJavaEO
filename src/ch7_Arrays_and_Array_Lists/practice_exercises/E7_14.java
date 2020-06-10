package ch7_Arrays_and_Array_Lists.practice_exercises;

import java.util.Arrays;
import java.util.Random;

public class E7_14 {
	public static void main(String[] args) {
		Sequence seq1 = new Sequence(13);
		Sequence seq2 = new Sequence(8);
		
		fill(seq1);
		fill(seq2);

		System.out.println("Sequence 1: " + seq1);
		System.out.println("Sequence 2: " + seq2);

		Sequence sum = seq1.sum(seq2);
		System.out.println("Sum: " + sum);

		sum = seq2.sum(seq1);
		System.out.println("Sum: " + sum);
	}

	public static void fill(Sequence seq) {
		Random random = new Random();

		for(int i = 0; i < seq.size(); i++) {
			seq.set(i, random.nextInt(100));
		}
	}
}

/**
 * Difficulty: Medium
 * 
 * Prompt
 * Add a method
 *
 * public Sequence sum(Sequence other)
 *
 * that yields the sum of this sequence and another. If the sequences don't have the same length, assume that the missing
 * elements are zero. For example, 
 * 
 * 1   4 9 16 9  7 4 9 11
 * and
 * 11 11 7  9 16 4 1
 *
 * is the sequence 12 15 16 25 25 11 5 9 11
 * 
 * TIME: 00:41:14
 */
class Sequence {
	private int[] values;

	public Sequence(int size) {
		values = new int[size];
	}
	
	public int get(int i) {
		return values[i];
	}

	public void set(int i, int n) {
		values[i] = n;
	}
	
	public int size() {
		return values.length;
	}

	/**
	 * This method yields the sum of this sequence and another. If the sequences don't have the same length, the missing elements
	 * are zero. For example, 1 4 9 16 9 7 4 9 11 and 11 11 7 9 16 4 1 is the sequence 12 15 16 25 25 11 5 9 11.
	 *
	 * @param other - the sequence to add with this sequence.
	 *
	 * @return the new sequence that contains the sum of this and other sequence.
	 *
	 * Time Complexity: O(N)
 	 * Space Complexity: O(1) not taking into account the initialization of Sequence; O(N) otherwise.
	 */
	public Sequence sum(Sequence other) {
		// create a Sequence with the largest length of this and other sequence
		// iterate through the shortest sequence and add two sequences together
		// append the remainig values to the new sequence

		int longest = this.size() > other.size() ? this.size() : other.size();
		int shortest = this.size() < other.size() ? this.size() : other.size();

		Sequence sequence = new Sequence(longest);
		for(int i = 0; i < shortest; i++) {
			sequence.set(i, this.get(i) + other.get(i));
		}

		if(shortest < this.size()) {
			processRemaining(sequence, this, shortest);
		}
		else {
			processRemaining(sequence, other, shortest);
		}

		return sequence;
	}

	public String toString() {
		return Arrays.toString(values);
	}

	private void processRemaining(Sequence dest, Sequence src, int pos) {
		while(pos < src.size()) {
			dest.set(pos, src.get(pos));
			pos++;
		}
	}
}