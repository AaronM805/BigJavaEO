package ch7_Arrays_and_Array_Lists.review_exercises;

import java.util.Arrays;

/**
 * Difficulty: Medium
 * 
 * Prompt: Write an algorithm that fills the first and last columns as well as
 * the first and last rows of a two-dimensional array of integers with - 1
 * 
 * TIME: Time Complexity: Space Complexity:
 */

public class R7_30 {
    public static void main(String[] args) {
        int[][] array = new int[4][4];
        fillArray(array);
        System.out.println();

        array = new int[4][8];
        fillArray(array);
        System.out.println();

        array = new int[9][8];
        fillArray(array);
    }

    private static void fillArray(int[][] arr) {
        int length = arr.length;
        System.out.println("[");
        for(int i = 0; i < arr.length; i++) {
            int j = 0;
            while(j < arr[i].length) {
                arr[i][j] = -1;
                if(i == 0 || i == length - 1) {
                    j++;
                }
                else {
                    j += arr[i].length - 1;
                }
            }
            System.out.println("\t" + Arrays.toString(arr[i]));
        }
        System.out.println("]");
    }   
}