package ch13_recursion.practice_exercises;

/**
 *
 * Difficulty: Medium
 * 
 * Prompt:
 * Redo Exercise E13.5 with a recursive helper method that reverses a substring of the message text.
 * 
 * TIME: 00:08:04
 * Time Complexity: O(N)
 * Space Complexity: O(N) since we are storing the size of the string in the stack
 */
public class E13_6 {
	public static void main(String[] args) {
		System.out.println(reverse("Hello!"));
		System.out.println(reverse("Aaron"));
		System.out.println(reverse("Andrea"));
		System.out.println(reverse("Waterhole"));
	}

	public static String reverse(String text) {
		return reverse(text, 0);
	}

	private static String reverse(String text, int index) {
		/*
			Example:
			Hello!; 5

			index = 4

			!olleH
		*/
		if(index == text.length() - 1) {
			return "" + text.charAt(index);
		}
		else {
			return reverse(text, index + 1) + text.charAt(index);
		}
	}
}