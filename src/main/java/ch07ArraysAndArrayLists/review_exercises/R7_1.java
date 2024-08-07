package ch07ArraysAndArrayLists.review_exercises;

import java.util.Arrays;

/**
 * Difficulty: Medium
 * 
 * Prompt:
 * Carry out the following tasks with an array:
 *      a. Allocate an array of ten integers
 *      b. Put the number 17 as the initial element of the array
 *      c. Put the number 29 as the last element of the array
 *      d. Fill the remaining elements with -1
 *      e. Add 1 to each element of the array
 *      f. Print all elements of the array, one per line
 *      g. Print all elements of the array in a single line, separated by commas
 * 
 * TIME:
 * Time Complexity:
 * Space Complexity:
 */
public class R7_1 {
    public static void main(String[] args) {
        // a. Allocate an array of ten integers
		int[] a = new int[10];
        
        // b. Put the number 17 as the initial element of the array
		a[0] = 17;
        System.out.println(Arrays.toString(a));
        
        // c. Put the number 29 as the last element of the array
        a[a.length - 1] = 29;
        System.out.println(Arrays.toString(a));

		//d. Fill the remaining elements with -1
		for(int i = 1; i < a.length - 1; i++) {
			a[i] = -1;
        }
        System.out.println(Arrays.toString(a));

		//e. Add 1 to each element of the array
		for(int i = 0; i < a.length; i++) {
			a[i] += 1;
        }
        System.out.println(Arrays.toString(a));

		//f. Print all elements of the array, one per line
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
        }
        
		//g. Print all elements of the array in a single line, separated by commas
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			
			if(i < a.length - 1) {
				System.out.print(", ");
			}
        }
    }
}