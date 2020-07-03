package ch16_basic_data_structures.practice_exercises;

import ch16_basic_data_structures.chapter_examples.section1.LinkedList;
import ch16_basic_data_structures.chapter_examples.section1.LinkedList.Node;
import ch16_basic_data_structures.chapter_examples.section1.ListIterator;

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
     * Gets the current size recursively. This is from Practice Exercise E16_5.
     *
     * @return the current size of the linked list.
     */
    public int size() {
        Node start = super.getHead();
        return size(start);
    }

    private int size(Node start) {
        /*
        A B C D E F G
        |
        */
        if (start == null) {
            return 0;
        }
        else {
            return size(start.next) + 1;
        }
    }
}