package ch16BasicDataStructures.practice_exercises;
/**
 * Add a method lastToFirst to the implementation of a queue in Exercise E16.12. The method moves the element at the tail of the
 * queue to the head.
 * 
 * TIME: 00:14:42
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
/**
 *Difficulty: Easy
 */
public class E16_14 {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        for(int i = 1; i <= 6; i++) {
            System.out.println(queue);
            queue.lastToFirst();
        }
    }   
}