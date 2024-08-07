package ch15JavaCollectionsFramework.chapter_examples.section2;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class.
 */
public class ListDemo {
	public static void main(String[] args) {
		LinkedList<String> staff = new LinkedList<>();
		staff.addLast("Diana");
		staff.addLast("Harry");
		staff.addLast("Romeo");
		staff.addLast("Andrea");

		// | in the comments inddicates the iterator position
		ListIterator<String> iterator = staff.listIterator(); // |DHRA
		iterator.next(); // D|HRA
		iterator.next(); // DH|RA

		// Add more elements after second element
		iterator.add("Aaron"); // DHA|RA
		iterator.add("A Squared"); // DHAA|RA

		iterator.next(); // DHAAR|A

		// Remove the last traversed element
		iterator.remove(); // DHAA|A

		// Print all elements
		System.out.println(staff);
		System.out.println("Expected: [Diana, Harry, Aaron, A Squared, Andrea]");
	}
}