package ch15JavaCollectionsFramework.self_check;

import java.util.LinkedList;
import java.util.ListIterator;
/**
 * This program removes all strings with length less than four from a linked list.
 *
 * @author Aaron Martinez
 * @version 0.1 
 */
public class SC8 {
	public static void main(String[] args) {
		LinkedList<String> words = new LinkedList<>();

		words.add("Ana");
		words.add("Andrea");
		words.add("Mary");
		words.add("Jim");
		words.add("Aaron");
		words.add("Note");
		words.add("Jon");
		words.add("Jin");

		System.out.println(words);
		removeStrings(words);
		System.out.println(words);
	}

	/**
	 * This method removes all srings with length less than four from words.
	 *
	 * @param words the list to remove words from
	 */
	public static void removeStrings(LinkedList<String> words) {
		ListIterator<String> iter = words.listIterator();

		while(iter.hasNext()) {
			String word = iter.next();

			if(word.length() < 4) {
				iter.remove();
			}
		}
	}
}