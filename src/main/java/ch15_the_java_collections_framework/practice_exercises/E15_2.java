package ch15_the_java_collections_framework.practice_exercises;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Write a method
 *  public static void reverse(LinkedList<String> strings)
 * that reverses the entries in a linked list.
 *
 * TIME: 00:21:53
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */
/**
 * Difficulty: Medium
 */
public class E15_2 {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();
        words.add("A");
        words.add("B");
        words.add("C");
        words.add("D");
        words.add("E");
        words.add("F");
        words.add("G");
        words.add("H");

        System.out.println(words);
        reverse(words);
        System.out.println(words);
    }

    /**
     * Reverses the order of the linked list.
     *
     * @param strings the list to reverse
     */
    public static void reverse(LinkedList<String> strings) {
        /*
        A B C D E F G H I J
                           |
        */
        ListIterator<String> iterator = strings.listIterator();
        while(iterator.hasNext()) {
            iterator.next();
        }
        
        LinkedList<String> reverse = new LinkedList<>();
        while(iterator.hasPrevious()) {
            reverse.add(iterator.previous());
        }

        strings.clear();
        strings.addAll(reverse);
    }
}