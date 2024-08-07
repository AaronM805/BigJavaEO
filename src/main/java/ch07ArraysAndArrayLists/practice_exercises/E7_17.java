package ch07ArraysAndArrayLists.practice_exercises;

import ch07ArraysAndArrayLists.practice_exercises.pojo.Table;

import java.util.Random;

public class E7_17 {

	public static void main(String[] args) {
		Table table = new Table(5, 5);
		Random random = new Random();

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				table.set(i, j, random.nextInt(50));
			}
		}

		System.out.println(table);
		System.out.println(table.sum(3, true));
		System.out.println(table.sum(2, false));
	}
}