package ch07ArraysAndArrayLists.practice_exercises;

/**
 * Difficulty: Medium
 * 
 * Prompt:
 * Compute the alternating sum of all elements in an array. For example, if your program reads the input
 *      1 4 9 16 9 7 4 9 11
 * then it computes
 *      1 - 4 + 9 - 16 + 9 - 7 + 4 - 9 + 11 = -2
 *                       i
 * TIME: 00:10:39
 */
public class E7_5 {

    public static void main(String[] args) {
        double[] arr = {1, 4, 9, 16, 9, 7, 4, 9, 11};

        System.out.println(alternatingSum(arr));
        System.out.println("expected: -2.0");
    }

    /*
    Time Complexity: O(N)
    Space Complexity: O(1)
    */
    public static double alternatingSum(double[] arr) {
        double result = arr[0] - arr[1];

        for(int i = 2; i < arr.length; i++) {
            if(i % 2 == 0) {
                result += arr[i];
            }
            else {
                result -= arr[i];
            }
        }
        return result;
    }
}