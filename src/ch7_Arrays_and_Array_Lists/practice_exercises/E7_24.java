package ch7_Arrays_and_Array_Lists.practice_exercises;

import ch7_Arrays_and_Array_Lists.practice_exercises.pojo.ArrayListSequence;

import java.util.ArrayList;

public class E7_24 {
	public static void main(String[] args) {
		ArrayListSequence a = new ArrayListSequence();
		a.add(1);
		a.add(4);
		a.add(9);
		a.add(16);

		ArrayListSequence b = new ArrayListSequence();
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

		a = new ArrayListSequence();
		a.add(1);
		a.add(4);
		a.add(9);
		a.add(16);

		b = new ArrayListSequence();
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