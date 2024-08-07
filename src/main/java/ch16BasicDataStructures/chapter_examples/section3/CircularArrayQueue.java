package ch16BasicDataStructures.chapter_examples.section3;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * An implementation of a queue as a circular array.
 */
public class CircularArrayQueue {
    private Object[] data;
    private int head;
    private int tail;
    private int size;

    /**
     * Constructs an empty queue.
     */
    public CircularArrayQueue() {
        final int INITIAL_SIZE = 10;
        data = new Object[INITIAL_SIZE];
        head = 0;
        tail = 0;
        size = 0;
    }

    /**
     * Adds an element to the tail of this queue.
     *
     * @param element the element to add
     *
     * Time Complexity: O(1)+
     * Space Complexity: O(1)+
     */
    public void add(Object element) {
        growIfNecessary();

        data[tail] = element;
        tail = (tail + 1) % data.length;
        size++;
    }

    /**
     * The element at the head is moved to the tail of the queue. The second element becomes the new head. From E16.15.
     *
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public void firstToLast() {
        add(remove());
    }

    /**
     * Checks whether this queue is empty.
     *
     * @return true if this queue is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * The element at the tail is moved to the head of the queue. The penultimate element becomes the new tail. From E16.16.
     *
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public void lastToFirst() {
        addToHead(removeFromTail());
    }

    /**
     * Removes an element from the head of this queue.
     *
     * @return the removed element
     *
     * @throws NoSuchElementException if queue is empty
     *
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public Object remove() {

        if(size == 0) {
            throw new NoSuchElementException();
        }

        Object val = data[head];
        head = (head + 1) % data.length;
        size--;

        return val;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CircularArrayQueue[data=").append(Arrays.toString(data))
          .append(", head=").append(head).append(", tail=").append(tail)
          .append(", size=").append(size).append("]");

        return sb.toString();
    }

    private void addToHead(Object data) {
        growIfNecessary();

        if(head == 0) {
            head = this.data.length - 1;
        }
        else {
            head--;
        }
        // head = (head % this.data.length) - 1;
        this.data[head] = data;
        size++;
    }

    /**
     * Removes an element from the tail of this queue.
     *
     * @return the removed element
     *
     * @throws NoSuchElementException if queue is empty
     */
    private Object removeFromTail() {
        if(size == 0) {
            throw new NoSuchElementException();
        }

        tail = (tail % data.length) - 1;
        Object val = data[tail];
        size--;

        return val;
    }

    /**
     * Grows the element array if the current size equals the capacity.
     */
    private void growIfNecessary() {
        if(size == data.length || (size > 0 && head == tail)) {
            Object[] tmp = new Object[data.length * 2];

            for(int i = 0; i < data.length; i++) {
                tmp[i] = data[(head + i) % data.length];
            }

            data = tmp;
            head = 0;
            tail = size;
        }
    }
}