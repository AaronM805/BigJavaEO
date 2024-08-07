package ch15JavaCollectionsFramework.practice_exercises;

import java.util.Scanner;
import java.util.Stack;

/**
 * Your task is to break a number into its individual digits, for example, to turn 1729 into 1, 7, 2, and 9. It is easy to get
 * the last digit of a number n as n % 10. But that gets the numbers in reverse order. Solve this problem with a stack. Your
 * program should ask the user for an integer, then print its digits separated by spaces.
 *
 * Difficulty: Easy
 * 
 * TIME: 00:13:21
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
public class E15_9 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        int val = input.nextInt();
        input.close();

        System.out.println(separate(val));
    }

    /**
     * Breaks number down into its individual digits.
     *
     * @param value the value to be broken down
     *
     * @return the number broken down into its individual digits, separated by spaces.
     */
    public static String separate(int value) {
        
        /*
        34677

        while value > 0
            stack.push(value % 10)
            value = value / 10;
        */
        Stack<Integer> stack = new Stack<>();
        while(value > 0) {
            stack.push(value % 10);
            value = (int) value / 10;
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.empty()) {
            sb.append(stack.pop()).append(" ");
        }

        return sb.toString().trim();
    }
}