package ch07ArraysAndArrayLists.review_exercises;

import java.util.Arrays;

/**
 * Difficulty: Medium
 * 
 * Prompt: Write an algorithm that rotates the elements of an array by one
 * position, moving the initial element to the of the array.
 *
 * TIME:
 * Time Complexity:
 * Space Complexity:
 */
public class R7_20 {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 7, 11, 13};
        System.out.println(Arrays.toString(a));
        shiftArray(a);
        System.out.println(Arrays.toString(a));
        System.out.println();

        int[] b = {17, 20, 2, 3, 5, 7, 11, 13, 34, 45};
        System.out.println(Arrays.toString(b));
        shiftArray(b);
        System.out.println(Arrays.toString(b));
    }

    private static void shiftArray(int[] a) {
        int initial = a[0];
        
        for(int i = 0; i < a.length - 1; i++) {
            a[i] = a[i+1];
        }
        a[a.length - 1] = initial;
    }
}