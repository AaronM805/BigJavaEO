package ch16_basic_data_structures.chapter_examples.section3;

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
     * Checks whether this queue is empty.
     *
     * @return true if this queue is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Adds an element to the tail of this queue.
     *
     * @param element the element to add
     */
    public void add(Object element) {
        growIfNecessary();

        data[tail] = element;
        tail = (tail + 1) % data.length;
        size++;
    }

    /**
     * Removes an element from the head of this queue.
     *
     * @return the removed element
     *
     * @throws NoSuchElementException if queue is empty
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

    /**
     * Grows the element array if the current size equals the capacity.
     */
    private void growIfNecessary() {
        if(size == data.length) {
            Object[] tmp = new Object[data.length * 2];

            for(int i = 0; i < data.length; i++) {
                tmp[i] = data[(head + i) % elements.length];
            }

            data = tmp;
            head = 0;
            tail = size;
        }
    }
}