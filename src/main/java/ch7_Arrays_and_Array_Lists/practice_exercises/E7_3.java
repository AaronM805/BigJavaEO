package ch7_Arrays_and_Array_Lists.practice_exercises;

/**
 * Difficulty: Medium
 * 
 * Prompt:
 * Write a method sumWithoutSmallest that computes the sum of an array of values, except for the smallest one, in a single loop.
 * In the loop, update the sum and the smallest value. After the loop, return the difference.
 * 
 * TIME: 00:13:15
 */
public class E7_3 {

    public static void main(String[] args) {
        double[] arr = {12.5, 2.4, 18.9, 17.0, 1.7};

        System.out.println(sumWithoutSmallest(arr));
        System.out.println("expected: 50.8");
    }

    /*
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static double sumWithoutSmallest(double[] arr) {
        double sum = 0;
        double smallest = Double.MAX_VALUE;

        for(double i : arr) {
            sum += i;

            if(Double.compare(smallest, i) > 0) {
                smallest = i;
            }
        }

        return (sum - smallest);
    }
}