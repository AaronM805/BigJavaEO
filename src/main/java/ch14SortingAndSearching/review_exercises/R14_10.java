package ch14SortingAndSearching.review_exercises;

/**
 * A run is a sequence of adjacent repeated values (see Exercise R7.23). Describe an O(n) algorithm to find the length of the
 * longest run in an array.
 *
 * Difficulty: Easy
 */
public class R14_10 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 6, 8, 9, 9, 9, 9, 10};

        System.out.println("longest run: " + longestRun(arr) + "\texpected: 4");
    }
    
    private static int longestRun(int[] arr) {
        int previous = arr[0];
        int count = 1;
        int max = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == previous) {
                count++;
            }
            else {
                max = Math.max(max, count);
                count = 1;
            }
            previous = arr[i];
        }

        return max;
    }
}