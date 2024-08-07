package ch07ArraysAndArrayLists.practice_exercises;

import java.util.Scanner;

/**
 * Difficulty: Easy
 * 
 * Prompt
 * Modify the LargestInArray.java program in Section 7.3 to mark both the smallest and the largest elements
 * 
 * TIME:
 * Time Complexity:
 * Space Complexity:
 */
public class E7_2 {
    public static void main(String[] args) {
        LargestInArray.findLargest();
    }
}

class LargestInArray {
	public static void findLargest() {
		final int LENGTH = 100;
		double[] values = new double[LENGTH];
		int currentSize = 0;
		
		System.out.println("Please enter values, Q to quit: ");
		Scanner in = new Scanner(System.in);
		
		while(in.hasNextDouble() && currentSize < values.length){
			values[currentSize] = in.nextDouble();
			currentSize++;
        }
        
        in.close();
		
		// Find the largest and smallest values
		double largest = values[0], smallest = values[0];
		for(int i = 1; i < currentSize; i++) {
			if(values[i] > largest) {
				largest = values[i];
			}
			
			if(values[i] < smallest) {
				smallest = values[i];
			}
		}
		
		// Print all values, marking the largest and smallest
		for(int i = 0; i < currentSize; i++) {
			System.out.print(values[i]);
			
			if(values[i] == largest) {
				System.out.print(" <== largest value");
			}
			
			if(values[i] == smallest) {
				System.out.print(" <== smallest value");
			}
			
			System.out.println();
		}
	}
}