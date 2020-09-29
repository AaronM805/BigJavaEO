package ch7_Arrays_and_Array_Lists.practice_exercises;

import ch7_Arrays_and_Array_Lists.practice_exercises.pojo.Sequence;
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