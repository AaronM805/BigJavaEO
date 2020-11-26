package ch13_recursion.practice_exercises;

/**
 *
 * Difficulty: Easy
 * 
 * Prompt:
 * Write a recursive method String reverse(String text) that reverses a string. For example, reverse("Hello!") returns the string
 * "!olleH". Implement a recursive solution by removing the first character, reversing the remaining text, and combining the two
 * 
 * TIME: 00:19:26
 * Time Complexity: O(N)
 * Space Complexity: O(N) as we are creating a stack of size n.
 */
public class E13_5 {
	public static void main(String[] args) {
		System.out.println(reverse("Hello!"));
		System.out.println(reverse("Aaron"));
		System.out.println(reverse("Andrea"));
		System.out.println(reverse("Waterhole"));
	}

	public static String reverse(String text) {
		/*
		example
		H e l l o !
        
        reverse - Hello!
        	reverse - ello! + H
        			!olleH
        		reverse llo! + e
        				!olle
        			reverse lo! + l
        					!oll
        				reverse o! + l
        						!ol
        					reverse ! + o
        						return !
		*/
		if(text.length() <= 1) {
			return text;
		}
		else {
			return reverse(text.substring(1)) + text.charAt(0);
		}
	}
}