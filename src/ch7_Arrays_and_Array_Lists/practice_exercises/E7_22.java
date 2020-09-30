package ch7_Arrays_and_Array_Lists.practice_exercises;

import ch7_Arrays_and_Array_Lists.practice_exercises.pojo.ArrayListSequence;

public class E7_22 {
	public static void main(String[] args) {
		ArrayListSequence a = new ArrayListSequence();
		a.add(1);
		a.add(4);
		a.add(9);
		a.add(16);
		
		ArrayListSequence b = new ArrayListSequence();
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