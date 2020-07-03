package ch16_basic_data_structures.practice_exercises;

import ch16_basic_data_structures.chapter_examples.section1.LinkedList;
/**
 * Add a method calculateSize to our implementation of the LinkedList class that computes the number of elements in the list by following
 * links and counting the elements until the end of the list is reached.
 * 
 * TIME: ~00:13:00
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
/**
 *Difficulty: Easy
 */
public class E16_4 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.addFirst("D");
        list.addFirst("E");
        list.addFirst("F");

        System.out.println("size: " + list.calculateSize() + ", expected: 6");
    }
}