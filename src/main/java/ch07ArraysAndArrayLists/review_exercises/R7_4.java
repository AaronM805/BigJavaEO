package ch07ArraysAndArrayLists.review_exercises;

import java.util.Scanner;

/**
 * Difficulty: Easy
 * 
 * Prompt:
 * 
 * Write a loop that reads ten numbers and a second loop that displays them in
 * the opposite order from which they were entered.
 *
 * TIME:
 * Time Complexity:
 * Space Complexity:
 */
public class R7_4 {

    private static final int SIZE = 10;
    public static void main(String[] args) {
        System.out.print("Enter 10 numbers: ");
	
        Scanner in = new Scanner(System.in);
        
        double[] arr = new double[SIZE];
        int count = 0;
        
        while(count < SIZE && in.hasNextDouble()) {
            arr[count] = in.nextDouble();
            count++;
        }
        in.close();
        
        System.out.print("The values, in reverse order, are: ");
        for(int idx = arr.length - 1; idx >= 0; idx--) {
            System.out.print(arr[idx]);

            if(idx > 0) {
                System.out.print(" ");
            }
        }
    }
}