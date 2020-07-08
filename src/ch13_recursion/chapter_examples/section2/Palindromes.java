package ch13_recursion.chapter_examples.section2;

class PalindromesTester {

	public static void main(String[] args) {
		System.out.println(Palindromes.isPalindrome("A man, a plan, a canal—Panama!"));
		System.out.println(Palindromes.isPalindrome("Go hang a salami, I’m a lasagna hog"));
		System.out.println(Palindromes.isPalindrome("Madam, I’m Adam"));
		System.out.println(Palindromes.isPalindrome("Aaron Aaron"));
	}
}

public class Palindromes {

	public static boolean isIterativePalindrome(String text) {
		int start = 0;
		int end = text.length() - 1;

		while(start < end) {
			char first = Character.toLowerCase(text.charAt(start));
			char last = Character.toLowerCase(text.charAt(end));

			if(Character.isLetter(first) && Character.isLetter(last)) {
				if(first == last) {
					start++;
					end--;
				}
				else {
					return false;
				}
			}

			if(!Character.isLetter(last)) {
				end--;
			}

			if(!Character.isLetter(start)) {
				start++;
			}
		}
		return true;
	}

	/**
	 * Test whether text is a palindrome.
	 *
	 * @param text a string that is being checked.
	 *
	 * @return true if text is a palindrome, false otherwise.
	 */
	public static boolean isPalindrome(String text) {
		return isPalindrome(text, 0, text.length() - 1);
	}
	/**
	 * Test whether text is a palindrome. It is inefficient to construct new stirng objects in every step. Instead of testing
	 * whether the entire sentence is a palindrome, let's check whether a substring is a palindrome.
	 *
	 * @param text a string that is being checked.
	 * @param start the index of the first character of the substring
	 * @param end the index of the last character of the substring
	 *
	 * @return true if text is a palindrome, false otherwise.
	 */
	private static boolean isPalindrome(String text, int start, int end) {

		if(start >= end) {
			return true;
		}
		else {
			// Get first and last characters, converted to lowercase.
			char first = Character.toLowerCase(text.charAt(start));
			char last = Character.toLowerCase(text.charAt(end));

			if(Character.isLetter(first) && Character.isLetter(last)) {
				// Both are letters
				if(first == last) {
					// Test substring that doesn't contain the matching letters.
					return isPalindrome(text, start + 1, end - 1);
				}
				else {
					return false;
				}
			}
			else if (!Character.isLetter(last)) {
				// Test substring that doesn't contain the last character
				return isPalindrome(text, start, end - 1);
			}
			else {
				// Test subtring that doesn't contain the first character
				return isPalindrome(text, start + 1, end);
			}
		}
	}
}