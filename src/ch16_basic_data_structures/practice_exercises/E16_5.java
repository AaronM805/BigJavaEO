package ch16_basic_data_structures.practice_exercises;

import ch16_basic_data_structures.chapter_examples.section1.LinkedList;

/**
 * Solve Exercise E16.4 recursively by calling a recursive helper method
 *  private static int size(Node start)
 *
 * Hint: If start is null, then the size is 0. Otherwise, it is one larger than the size of start.next.
 * 
 * TIME: 00:10:10
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
/**
 *Difficulty: Medium
 */
public class E16_5 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.addFirst("D");
        list.addFirst("E");
        list.addFirst("F");

        System.out.println("size: " + list.getSizeRecursively() + ", expected: 6");
    }
    
}