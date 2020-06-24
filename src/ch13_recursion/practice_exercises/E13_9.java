package ch13_recursion.practice_exercises;

/**
 *
 * Difficulty: Medium
 * 
 * Prompt:
 * Use recursion to implement a method
 *
 *	public static int indexOf(String text, String str)
 *
 * that returns the starting position of the first substring of the text that matches str. Return –1 if str is not a substring of
 * the text. For example, s.indexOf("Mississippi", "sip") returns 6.
 *
 * Hint: This is a bit trickier than Exercise E13.8, because you must keep track of how far the match is from the beginning of
 * the text. Make that value a parameter variable of a helper method.
 *
 * TIME: 00:10:22
 * Time Complexity: O(N)
 * Space Complexity: O(N^2) since for each N, we create a string of sinze N - 1
 */
public class E13_9 {

	public static void main(String[] args) {
		String text = "Mississippi";
		String str = "sip";
		System.out.println(indexOf(text, str) + "; expected: 6");

		text = "Mississippi";
		str = "spi";
		System.out.println(indexOf(text, str) + "; expected: -1");

		text = "Mississippi";
		str = "ssi";
		System.out.println(indexOf(text, str) + "; expected: 2");
	}
	/**
	 * REturn the starting position of the first substring of the text that matches str, otherwise return -1
	 *
	 */
	public static int indexOf(String text, String str) {
		return indexOf(text, str, 0);
	}

	private static int indexOf(String text, String str, int position) {
		/*
			"M i s s i s s i p p i"; 11, "spi"
			                 p 
			position = 8
		*/
		if(text.length() - position < str.length()) {
			return -1;
		}
		else if(text.substring(position, str.length() + position).equalsIgnoreCase(str)) {
			return position;
		}
		else {
			return indexOf(text, str, position + 1);
		}
	}
}