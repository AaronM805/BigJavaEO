package ch13_recursion.chapter_examples.howto;

public class HT13_1 {

	public static void main(String[] args) {
		System.out.println(Palindromes.isPalindrome("A man, a plan, a canal—Panama!"));
		System.out.println(Palindromes.isPalindrome("Go hang a salami, I’m a lasagna hog"));
		System.out.println(Palindromes.isPalindrome("Madam, I’m Adam"));
		System.out.println(Palindromes.isPalindrome("Aaron Aaron"));
	}
}

class Palindromes {

	/**
	 * Test whether text is a palindrome.
	 *
	 * @param text a string that is being checked.
	 *
	 * @return true if text is a palindrome, false otherwise.
	 */
	public static boolean isPalindrome(String text) {

		int length = text.length();

		if(length <= 1) {
			return true;
		}
		else {
			// Get first and last characters, converted to lowercase.
			char first = Character.toLowerCase(text.charAt(0));
			char last = Character.toLowerCase(text.charAt(length - 1));

			if(Character.isLetter(first) && Character.isLetter(last)) {
				// Both are letters
				if(first == last) {
					// Remove both first and last character
					String shorter = text.substring(1, length - 1);
					return isPalindrome(shorter);
				}
				else {
					return false;
				}
			}
			else if (!Character.isLetter(last)) {
				// Remove last character
				String shorter = text.substring(0, length - 1);
				return isPalindrome(shorter);
			}
			else {
				// Remove first characters
				String shorter = text.substring(1);
				return isPalindrome(shorter);
			}
		}
	}
}