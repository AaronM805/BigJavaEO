package ch16_basic_data_structures.chapter_examples.section3;

import java.util.NoSuchElementException;

/**
 * An implementation of a stack as a sequence of nodes.
 */
public class LinkedListStack {
    private Node head;

    /**
     * Constructs an empty stack.
     */
    public LinkedListStack() {
        head = null;
    }

    /**
     * Checks whether this stack is empty.
     *
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Gets the element from the top of the stack, without removing it.
     *
     * @return the element at the top of the stack
     *
     * @throws NoSuchElementException if stack is empty
     */
    public Object peek() {

        if(head == null) {
            throw new NoSuchElementException();
        }

        return head.data;
    }

    /**
     * Removes the element from the top of the stack.
     *
     * @return the removed element
     *
     * @throws NoSuchElementException if stack is empty
     */
    public Object pop() {
        if(head == null) {
            throw new NoSuchElementException();
        }

        Object element = head.data;
        head = head.next;
        return element;
    }

    /**
     * Adds an element to the top of the stack.
     *
     * @param element the element to add
     */
    public void push(Object element) {
        Node node = new Node(element);

        node.next = head;
        head = node;
    }

    class Node {
        public Node next;
        public Object data;

        public Node(Object data) {
            this.data = data;
        }
    }
}