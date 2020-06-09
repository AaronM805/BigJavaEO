package ch7_Arrays_and_Array_Lists.review_exercises;

import java.util.Arrays;

/**
 * Difficulty: Medium
 * 
 * Prompt: Write  an algorithm that removes all negative values from an array, preserving the order of the remaining elements.
 *
 * TIME:
 * Time Complexity:
 * Space Complexity:
 */
public class R7_21 {
    public static void main(String[] args) {
        int[] a = {9, -1, 3, 2, -4, 7, -1, 1, 4};
        System.out.println(Arrays.toString(a) + "; CURRENT SIZE: " + a.length);
        int newSize = removeNegatives(a);
        System.out.println(Arrays.toString(a) + "; CURRENT SIZE: " + newSize);
    }

    // TODO: There is a bug. Fix it.
    private static int removeNegatives(int[] a) {
        int currPos = 0, nextPos = 0;

        while(nextPos < a.length) {
            if(a[nextPos] > 0) {
                a[currPos] = a[nextPos];
            }

            if(a[currPos] > 0) {
                currPos++;
            }
            nextPos++;
        }

        return currPos;
    }
    
}