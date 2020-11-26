package ch15_the_java_collections_framework.self_check;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program prints every second element of a linked list.
 *
 * @author Aaron Martinez
 * @version 0.1
 */
public class SC9 {
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
		print(words);

	}

	public static void print(LinkedList<String> words) {
		ListIterator<String> iter = words.listIterator();

		System.out.print("[");
		while(iter.hasNext()) {
			System.out.print(iter.next());

			if(iter.hasNext()) {
				System.out.print(", ");
				iter.next();
			}
		}
		System.out.println("]");
	}
}