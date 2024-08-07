package ch16BasicDataStructures.practice_exercises;

import ch16BasicDataStructures.chapter_examples.section1.LinkedList;
/**
 * Consider a version of the LinkedList class of Section 16.1 in which the addFirst method has been replaced with the following
 * faulty version:
 *  public void addFirst(Object element) {
 *      Node newNode = new Node();
 *      first = newNode;
 *      newNode.data = element;
 *      newNode.next = first;
 *  }
 *
 * Develop a program ListTest with a test case that shows the error. That is, the program should print a failure message with
 * this implementation but not with the correct implementation.
 * 
 * TIME: 00:06:28
 * Time Complexity:
 * Space Complexity:
 */
/**
 *Difficulty: Medium
 */
public class E16_2 {

}

class MyLinkedList1 extends LinkedList {
    public MyLinkedList1() {
        super();
    }

    @Override
    public void addFirst(Object element) {
        Node newNode = new Node();
        Node head = super.getHead();
        head = newNode;
        newNode.data = element;
        newNode.next = head;
    }
}