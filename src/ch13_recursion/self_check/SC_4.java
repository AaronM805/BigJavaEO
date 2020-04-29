package ch13_recursion.self_check;

public class SC_4 {

    public static void main(String[] args) {

        System.out.println("Expected: " + Math.pow(2, 10));
        System.out.println("Actual: " + pow2(10));
    }
    // TIME: 00:12:56
    // Time complexity: O(n) since we are cursing n times
    // Space Complexity: O(n) since we are taking n space when we stack the previous answer from the recursion.
    public static int pow2(int n) {
		if(n == 0)
			return 1;
		else {
			return 2 * pow2(n-1);
		}
    }
}