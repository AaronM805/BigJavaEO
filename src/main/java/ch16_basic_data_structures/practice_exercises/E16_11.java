package ch16_basic_data_structures.practice_exercises;

import java.util.Arrays;
import java.util.EmptyStackException;
/**
 * Complete the implementation of a stack in Section 16.3.2, using an array for storing the elements.
 * 
 * TIME: 00:22:18
 */
/**
 *Difficulty: Easy
 */
public class E16_11 {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        ArrayStack stack2 = new ArrayStack(15);

        System.out.println("stack.isEmpty() - " + stack.isEmpty());
        // System.out.println("stack.peek() - " + stack.peek());
        // System.out.println("stack.pop() - " + stack.pop());

        stack2.push(4);
        stack2.push(3);
        stack2.push(1);
        stack2.push(9);
        System.out.println("stack2.isEmpty() - " + stack2.isEmpty());
        System.out.println("stack2 - " + stack2);
        System.out.println("stack2.peek() - " + stack2.peek());
        System.out.println("stack2.pop() - " + stack2.pop());
        System.out.println("stack2.pop() - " + stack2.pop());
        System.out.println("stack2 - " + stack2);
        stack2.push(2);
        stack2.push(8);
        stack2.push(7);
        stack2.push(10);
        stack2.push(5);
        stack2.push(6);
        stack2.push(13);
        stack2.push(11);
        stack2.push(14);
        stack2.push(12);
        stack2.push(17);
        stack2.push(15);
        stack2.push(16);
        stack2.push(19);
    }
}

/**
 * An implementation of a stack as an array.
 */
class ArrayStack {
    private Object[] data;
    private int size;

    private static int INITIAL_SIZE = 10;

    /**
     * Constructs an empty stack.
     */
    public ArrayStack() {
        data = new Object[INITIAL_SIZE];
        size = 0;
    }

    /**
     * Constructs a stack with given size.
     *
     * @param initialSize the initial stack size.
     */
    public ArrayStack(int initialSize) {
        data = new Object[initialSize];
        size = 0;
    }

    /**
     * Checks whether this stack is empty.
     *
     * @return true if the stack is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Gets the element from the top of the stack, without removing it.
     *
     * @return the element at the top of the stack
     *
     * @throws EmptyStackException if stack is empty
     *
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public Object peek() {
        if(data == null || size == 0) {
            throw new EmptyStackException();
        }

        return data[size - 1];
    }

    /**
     * Removes the element from the top of the stack.
     *
     * @return the removed element
     *
     * @throws EmptyStackException if stack is empty
     *
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public Object pop() {

        if(size == 0) {
            throw new EmptyStackException();
        }

        Object data = peek();
        size--;

        return data;
    }

    /**
     * Adds an element to the top of the stack.
     *
     * @param element the element to add
     *
     * @throws ArrayIndexOutOfBoundsException if the stack is full
     *
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public void push(Object element) { 
        if(size >= data.length) {
            throw new ArrayIndexOutOfBoundsException();
        }

        data[size] = element;
        size++;
    }

    /**
     * Gets the string representation of this stack.
     *
     * @return this stack, represented as a String
     */
    public String toString() {
        return Arrays.toString(data);
    }
}