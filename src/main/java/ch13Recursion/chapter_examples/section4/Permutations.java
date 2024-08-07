package ch13Recursion.chapter_examples.section4;

import java.util.ArrayList;

/**
 * This class computes permutations of a string.
 */
public class Permutations {
	public static void main(String[] args) {
		for(String s : permutations("Aaron")) {
			System.out.println(s);
		}
	}

	/**
	 * Gets all permutations of a given word.
	 *
	 * @param word the string to permute
	 *
	 * @return a list of all permutations
	 */
	public static ArrayList<String> permutations(String word) {
		ArrayList<String> result = new ArrayList<>();

		// the empty string has a single permutation: itself
		if(word.length() == 0) {
			result.add(word);
			return result;
		}
		else {
			// Loop through all character positions
			for(int i = 0; i < word.length(); i++) {
				// Form a shorter word by removing the ith character.
				String shorter = word.substring(0, i) + word.substring(i + 1);

				// Generate all permutations of the simpler word
				ArrayList<String> shorterPermutations = permutations(shorter);

				// Add the removed character to the front of each permutation of the simpler word.
				for(String s : shorterPermutations) {
					result.add(word.charAt(i) + s);
				}
			}
			return result;
		}
	}
}