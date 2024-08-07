package ch13Recursion.practice_exercises;

/**
 *
 * Difficulty: Medium
 * 
 * Prompt:
 * Use recursion to implement a method
 *
 *	public static boolean find(String text, String str)
 *
 * that tests whether a given text contains a string. For example, find("Mississippi","sip") returns true.
 *
 * Hint: If the text starts with the string you want to match, then you are done. If not, consider the text that you obtain by removing the first character.
 * 
 * TIME: 00:12:19
 * Time Complexity: O(N)
 * Space Complexity: O(N) since we are storing n letters in the stack
 */
public class E13_8 {

	public static void main(String[] args) {
		String text = "Mississippi";
		String str = "sip";
		System.out.println(find(text, str) + "; expected" + text.contains(str));

		text = "Mississippi";
		str = "spi";
		System.out.println(find(text, str) + "; expected" + text.contains(str));
	}

	public static boolean find(String text, String str) {
		/*
			M
			i
			s
			s
			i
			s
			sippi, sip

			if(text.length < str.length)
				return false
			else if text.substring(0, str.length())
				return true
			else
				return find(text.substring(1), str)

		*/
		if(text.length() < str.length()) {
			return false;
		}
		else if(text.substring(0, str.length()).equalsIgnoreCase(str)) {
			return true;
		}
		else {
			return find(text.substring(1), str);
		}
	}
}