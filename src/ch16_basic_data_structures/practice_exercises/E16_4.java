package ch16_basic_data_structures.practice_exercises;

import ch16_basic_data_structures.chapter_examples.section1.LinkedList;
import ch16_basic_data_structures.chapter_examples.section1.ListIterator;

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
        LinkedList list = new MyLinkedList();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.addFirst("D");
        list.addFirst("E");
        list.addFirst("F");

        return list;
    }
}

class MyLinkedList extends LinkedList {

    public MyLinkedList () {
        super();
    }

    /**
     * Calculates the current size of the linked list by iterating over it. This is from Practice Exercise E16.4.
     *
     * @return the current size of the linked list
     */
    public int size() {
        int count = 0;

        ListIterator iter = super.listIterator();

        while(iter.hasNext()) {
            iter.next();
            count++;
        }
        return count;
    }
}