package ch16_basic_data_structures.chapter_examples.section4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This class implements a hash set using separate chaining
 *
 * @author Aaron N Martinez (re-implementing from original example)
 * @version 0.1
 */
public class HashSet {
    private Node[] buckets;
    private int size;
    private boolean madCompression;

    /**
     * Constructs a hash table.
     *
     * @param bucketsLength the length of the buckets array
     */
    public HashSet(int bucketsLength, boolean madCompression) {
        buckets = new Node[bucketsLength];
        this.madCompression = madCompression;
        size = 0;
    }

    /**
     * Adds an element to this set.
     *
     * @param x an object
     *
     * @return true if x is a new object, false if x was already in the set
     */
    public boolean add(Object x) {
        if(contains(x)) {
            return false;
        }
        // compress to find index
        int position = getPosition(x);
        Node current = new Node(x);

        current.next = buckets[position];
        buckets[position] = current;
        size++;

        return true;
    }

    /**
     * Tests for set membership.
     *
     * @param x an object
     *
     * @return true if x is an element of this set
     */
    public boolean contains(Object x) {
        //compress to find position of x
        int position = getPosition(x);

        // get current node from bucket
        Node current = buckets[position];
        // check to see if x is in this bucket, since it should have same hash code
        while(current != null) {
            if(current.data.equals(x)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

     /**
     * Returns an iterator that traverses the element of this set.
     *
     * @return a hash set iterator
     */
    public Iterator iterator() {
        return new HashSetIterator();
    }

    /**
     * Removes an object from this set.
     *
     * @param x an object
     *
     * @return true if x was removed from this set, false if x was not an element of this set
     */
    public boolean remove(Object x) {
        if(!contains(x)) {
            return false;
        }

        int position = getPosition(x);

        Node current = buckets[position];

        while(current != null && current.next != null) {
            if(current.next.data.equals(x)) {
                current.next = current.next.next;
                size--;
                return true;
            }
        }

        return false;
    }

    /**
     * Gets the number of elements in this set.
     *
     * @return the number of elements
     */
    public int size() {
        return size;
    }

    /**
     * Gets the string representation of this hash table.
     *
     * @retun string representation of this hash table
     */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HashSet[buckets=[");
        for(int i = 0; i < buckets.length; i++) {
            Node current = buckets[i];

            if(current != null) {
                while(current != null && current.next != null) {
                    sb.append(current);
                    current = current.next;
                    if(current != null) {
                        sb.append("->");
                    }
                }
                sb.append(current);
                if(i < buckets.length - 1) {
                    sb.append(", ");
                }
            }
            else {
                sb.append(current);
                if(i < buckets.length - 1) {
                    sb.append(", ");
                }
            }   
        }
        sb.append("], size=").append(size).append("]");
        return sb.toString();
    }

    private int getPosition(Object x) {
        int h = x.hashCode();

        if(h < 0) {
            h = -h;
        }
        return h % buckets.length;
    }

    class HashSetIterator implements Iterator {
        private int bucketIndex;
        private Node current;

        /**
         * Constructs a hash set iterator that points to the first element of the hash set.
         */
        public HashSetIterator() {
            bucketIndex = -1;
            current = null;
        }

        /**
         * Tests for next element
         *
         * @return true if there is a next element, false if there is no next element
         */
        public boolean hasNext() {
            // if current has a next value then we know there is next; return true
            if (current != null && current.next != null) {
                return true;
            }

            // if current is at the end of the bucket, we search for the next bucket that is not empty.
            for(int i = bucketIndex + 1; i < buckets.length; i++) {
                if (buckets[i] != null) {
                    bucketIndex = i;
                    return true;
                }
            }
            // if all buckets are empty we will return false
            return false;
        }

        /**
         * Gets the next element of collection
         *
         * @return the next element in the collection
         *
         * @throws NoSuchElementException() if there are no more elements
         */
        public Object next() {
            // if current is not null and there is a next, move to next
            if (current != null && current.next != null) {
                current = current.next;
            }
            // there are no more elements in bucket, find the next bucket w/ elements
            else if (bucketIndex == buckets.length) {
                throw new NoSuchElementException();
            }
            else {
                current = buckets[bucketIndex];
            }
            return current.data;
        }

        /**
         * Removes an object from this set.
         * 
         * This method is currently unsupported
         */
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class Node {
        public Object data;
        public Node next;

        public Node(Object data) {
            this.data = data;
        }

        public String toString() {
            return "" + data;
        }
    }
}