package ch15JavaCollectionsFramework.practice_exercises;

import ch15JavaCollectionsFramework.chapter_examples.section6.StandardCalculator;

import java.util.Scanner;

/**
 * Add a % (remainder) operator to the expression calculator of Section 15.6.3.
 *
 * TIME: 00:15:54
 * Time Complexity: N/A
 * Space Complexity: N/A
 */
/**
 * Difficulty: Easy
 */
public class E15_18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a standard algebraic expression: ");
        String input = in.nextLine();
        in.close();
        StandardCalculator calc = new StandardCalculator();
        String[] inputs = input.split(" ");
        for (String val : inputs) {
            calc.process(val);
        }
        System.out.println(calc.result());
    }
}