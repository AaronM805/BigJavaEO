package ch15_the_java_collections_framework.chapter_examples.section6;

import java.util.Scanner;

/**
 * This class is used to test the StandardCalculater class.
 *
 * @author Aaron Martinez
 * @version 0.1
 *
 * TIME: 00:50:18
 * TODO: Improve and make into a JSF Application
 */
public class StandardCalculatorTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter one number or operator per line, Q to quit. ");
        boolean done = false;
        StandardCalculator calc = new StandardCalculator();
        
        while(!done) {
            String input = in.nextLine();

            if (!input.equalsIgnoreCase("q")) {
                calc.process(input);
            }
            else {
                done = true;
            }
        }
        in.close();
        System.out.println(calc.result());
    }
}