package ch16_basic_data_structures.practice_exercises;

/**
 * Complete the implementation of a queue in Section 16.3.3, using a sequence of nodes for storing the elements.
 * 
 * TIME: 00:42:44
 */
/**
 *Difficulty: Easy
 */
public class E16_12 {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        System.out.println("queue - " + queue);
        System.out.println("queue.isEmpty() - " + queue.isEmpty());
        
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println("queue - " + queue);
        System.out.println("queue.isEmpty() - " + queue.isEmpty());

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println("queue - " + queue);
        System.out.println("queue.isEmpty() - " + queue.isEmpty());

        queue.add(8);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println("queue - " + queue);
        System.out.println("queue.isEmpty() - " + queue.isEmpty());
    }
}

/**
 * An implementation of a queue as a circular array.
 */
class LinkedListQueue {
    // Making public since other practice exercises will need access to these nodes. This is to avoid reimplementing the Queue
    // class.
    public Node head;
    public Node tail;

    /**
     * Constructs an empty queue.
     */
    public LinkedListQueue() {
        head = null;
        tail = null;
    }

    /**
     * Checks whether this queue is empty.
     *
     * @return true if this queue is empty
     */
    public boolean isEmpty() {
        return head == null && tail == null;
    }

    /**
     * Adds an element to the tail of this queue.
     *
     * @param element the element to add
     *
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public void add(Object element) {
        /*
            head = null
            tail = null

            Node curr

            head = curr
            tail = curr
        */
        Node curr = new Node(element);

        if (isEmpty()) {
            head = curr;
            tail = curr;
        }
        else if (head == tail) {
            head.next = curr;
            tail = curr;
        }
        else {
            tail.next = curr;
            tail = curr;
        }
    }

    /**
     * The element at the head is moved to the tail of the queue. The second element becomes the new head. From E16.13.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public void firstToLast() {
        Node tmp = head;
        while(tmp.next != null) {
            tmp = tmp.next;
        }
        if(tmp == tail) {
            tmp = new Node(head.data);
            tail.next = tmp;
            tail = tmp;
        }
        head = head.next;
    }

    /**
     * The element at the tail is moved to the head of the queue. The penultimate element becomes the new tail. From E16.14.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public void lastToFirst() {
        Node curr = head;
        Node previous = null;

        while(curr.next != null) {
            previous = curr;
            curr = curr.next;
        }

        if(curr == tail) {
            curr = new Node(tail.data);
            tail = previous;
            tail.next = null;

            curr.next = head;
            head = curr;
        }
    }

    /**
     * Removes an element from the head of this queue.
     *
     * @return the removed element
     *
     * @throws NullPointerException if queue is empty
     *
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public Object remove() {
        if (isEmpty()) {
            throw new NullPointerException();
        }

        Object data = head.data;
        head = head.next;

        return data;
    }

    /**
     * Returns a string representation of this queue.
     *
     * @return a string representation of this queue.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public String toString() {
        Node iterator = head;
        StringBuilder sb = new StringBuilder();
        
        if (iterator == null) {
            return "null";
        }

        while (iterator.next != null) {
            sb.append(iterator.data).append("->");
            iterator = iterator.next;
        }
        sb.append(iterator.data);

        return sb.toString();
    }

    class Node {
        Node next;
        Object data;

        public Node(Object data) {
            this.data = data;
        }
    }
}