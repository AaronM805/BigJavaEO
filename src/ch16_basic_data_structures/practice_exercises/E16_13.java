package ch16_basic_data_structures.practice_exercises;

/**
 * Add a method firstToLast to the implementation of a queue in Exercise E16.12. The method moves the element at the head of the
 * queue to the tail of the queue. The element that was second in line will now be at the head.
 * 
 * TIME: 00:20:52
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
/**
 *Difficulty: Easy
 */
public class E16_13 {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        queue.firstToLast();
        System.out.println(queue);
    }
}
