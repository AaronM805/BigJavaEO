package ch7_Arrays_and_Array_Lists.practice_exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Difficulty: Hard
 * 
 * Prompt
 * Write a program that produces ten random permutations of the numbers 1 to 10. To generate a random permutation, you need to
 * fill an array with the numbers 1 to 10 so that no two entries of the array have the same contents. You could do it by brute
 * force, generating random values until you have a value that is not yet in the array. But that is inefficient. Instead, follow
 * this algorithm:
 * 
 * Make a second array and fill it with the numbers 1 to 10
 * Repeat 10 times
 *      Pick a random element from the second array
 *      Remove it and append it to the permutation array
 * 
 */
public class E7_7 {

    public static void main(String[] args) {
        List<Integer> randomVals = new ArrayList<>();
        randomPermutations(randomVals);

        System.out.println(randomVals);

        int[] random = new int[10];
        randomPermutations(random);
        System.out.println(Arrays.toString(random));
    }

    /**
     * @param arr - the array to fill.
     *
     * TIME: 00:14:42
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public static void randomPermutations(int[] arr) {
        int[] temp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Random random = new Random();
        int count = 0;

        while(count < temp.length) {
            int next = random.nextInt(10);

            if(temp[next] != -1) {
                arr[count] = temp[next];
                temp[next] = -1;
                count++;
            }
        }
    }

    /**
     * @param arr - the array to fill.
     * 
     * TIME: 00:18:26
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public static void randomPermutations(List<Integer> arr) {
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        temp.add(3);
        temp.add(4);
        temp.add(5);
        temp.add(6);
        temp.add(7);
        temp.add(8);
        temp.add(9);
        temp.add(10);

        int count = 10;
        Random random = new Random();

        while(count > 0) {
            int next = random.nextInt(count);
            arr.add(temp.get(next));
            temp.remove(next);
            count--;
        }
    }
    
}