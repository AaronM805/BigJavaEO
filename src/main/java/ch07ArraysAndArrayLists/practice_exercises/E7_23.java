package ch07ArraysAndArrayLists.practice_exercises;

import ch07ArraysAndArrayLists.practice_exercises.pojo.ArrayListSequence;

public class E7_23 {
	public static void main(String[] args) {
		ArrayListSequence a = new ArrayListSequence();
		a.add(1);
		a.add(4);
		a.add(9);
		a.add(16);

		ArrayListSequence b = new ArrayListSequence();
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