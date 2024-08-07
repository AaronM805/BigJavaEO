package ch13Recursion.practice_exercises;

/**
 *
 * Difficulty: Easy
 * 
 * Prompt:
 * Implement the reverse method of Exercise E13.5 as an iteration.
 * 
 * TIME: 00:03:38
 * Time Complexity: O(N)
 * Space Complexity: O(N) if we consider the string that is used to return the answer; else O(1)
 */
public class E13_7 {

	public static void main(String[] args) {
		System.out.println(reverse("Hello!"));
		System.out.println(reverse("Aaron"));
		System.out.println(reverse("Andrea"));
		System.out.println(reverse("Waterhole"));
	}

	public static String reverse(String text) {
		String s = "";

		for(int i = text.length() - 1; i >= 0; i--) {
			s += text.charAt(i);
		}

		return s;
	}
}