package ch16BasicDataStructures.practice_exercises;

import ch16BasicDataStructures.chapter_examples.section1.LinkedList;
import ch16BasicDataStructures.chapter_examples.section1.ListIterator;

/**
 * Add an instance variable currentSize to our implementation of the LinkedList class. Modify the add, addLast, and remove
 * methods of both the linked list and the list iterator to update the currentSize variable so that it always contains the
 * correct size. Change the size method of Exercise E16.4 so that it simply returns the value of currentSize.
 * 
 * TIME: 00:24:02
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
/**
 *Difficulty: Easy
 */
public class E16_6 {
    public static void main(String[] args) {
        LinkedList list = initializeLinkedList();
        System.out.println("size(): " + list.size() + ", expected: 6");

        list.removeFirst();
        list.removeFirst();
        System.out.println("size(): " + list.size() + ", expected: 4");

        list.addFirst("G");
        list.addFirst("H");
        list.addFirst("I");
        list.addFirst("J");
        list.addFirst("K");
        list.addFirst("L");
        System.out.println("size(): " + list.size() + ", expected: 10");

        ListIterator iterator = list.listIterator();
        int count = 0;
        int addAtPos = 4;
        System.out.println(list);
        while(iterator.hasNext()) {
            count++;
            if(count % addAtPos == 0) {
                iterator.add("Z");
            }
            iterator.next();
        }
        System.out.println("size(): " + list.size() + ", expected: 12");

        //list = initializeLinkedList();
        iterator = list.listIterator();
        count = 0;
        addAtPos = 3;
        System.out.println(list);
        while(iterator.hasNext()) {
            count++;
            iterator.next();
            if(count % addAtPos == 0) {
                iterator.remove();
            }
        }
        System.out.println("size(): " + list.size() + ", expected: 8");

        iterator = list.listIterator();
        count = 0;
        addAtPos = 5;
        System.out.println(list);
        while(iterator.hasNext()) {
            count++;
            iterator.next();
            if(count % addAtPos == 0) {
                iterator.set("SET");
            }
        }
        System.out.println("size(): " + list.size() + ", expected: 8");
    }

    private static LinkedList initializeLinkedList() {
        LinkedList list = new LinkedList();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.addFirst("D");
        list.addFirst("E");
        list.addFirst("F");

        return list;
    }
}