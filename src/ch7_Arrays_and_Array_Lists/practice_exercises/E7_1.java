package ch7_Arrays_and_Array_Lists.practice_exercises;

import ch14_sorting_and_searching.practice_exercises.utils.ArrayUtil;
import java.util.Arrays;

/**
 * Difficulty: Medium
 * 
 * Prompt
 * Write a program that initializes an array with ten random integers and then prints four lines of output, containing
 *      - Every element at an even index
 *      - Every even element
 *      - All elements in reverse order
 *      - Only the first and last element
 * 
 * TIME:
 * Time Complexity:
 * Space Complexity:
 */
public class E7_1 {
    public static void main(String[] args) {
        int[] arr = ArrayUtil.randomIntArray(10, 100);

        System.out.println(Arrays.toString(arr) + "\n\n");
        
        // print elements at even index
        for(int i = 0; i < arr.length; i = i + 2) {
            printElements(i, arr[i], arr.length);
        }
        System.out.println();
        
        // print every even element
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                printElements(i, arr[i], arr.length);
            }
        }
        System.out.println();
        
        // print all elements in reverse order
        for(int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            
            if(i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        // Pring only the first and last element
        System.out.println(arr[0] + " " + arr[arr.length - 1]);
    }
    
    private static void printElements(int index, int val, int length) {
        System.out.print(val);
        
        if(index < length - 1) {
            System.out.print(" ");
        }
    }
}