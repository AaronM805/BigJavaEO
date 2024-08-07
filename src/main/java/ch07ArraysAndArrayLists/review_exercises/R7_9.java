package ch07ArraysAndArrayLists.review_exercises;

/**
 * Difficulty: Medium
 * 
 * Prompt:
 * Write Java code for a loop that simultaneously computes both the maximum and minimum of an array.
 *
 * TIME:
 * Time Complexity
 * Space Complexity:
 */
public class R7_9 {
    public static void main(String[] args) {

        int[] arr = {3, 8, 1, -1, 34, 5, 0};

        maxAndMin(arr);
    }

    private static void maxAndMin(int[] arr) {
        int max = arr[0], min = arr[0];

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.printf("min: %d\t\tmax: %d", min, max);
    }
}