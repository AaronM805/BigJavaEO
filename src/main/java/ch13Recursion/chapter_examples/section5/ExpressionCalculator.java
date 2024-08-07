package ch13Recursion.chapter_examples.section5;

import java.util.Scanner;

/**
 * This program calculates the value of an expression consisting of numbers, arithmetic operators, and parentheses.
 */
public class ExpressionCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an expression: ");
		String input = in.nextLine();
		in.close();

		Evaluator e = new Evaluator(input);
		System.out.println(input + " = " + e.getExpressionValue());
	}
}