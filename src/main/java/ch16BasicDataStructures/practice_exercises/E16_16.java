package ch16BasicDataStructures.practice_exercises;

import ch16BasicDataStructures.chapter_examples.section3.CircularArrayQueue;
/**
 * Add a method lastToFirst, as described in Exercise E16.14, to the circular array implementation of a queue.
 * 
 * TIME: 00:37:17
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */
/**
 *Difficulty: Easy
 */
public class E16_16 {
    public static void main(String[] args) {
        CircularArrayQueue queue = new CircularArrayQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        for(int i = 1; i <= 5; i++) {
            queue.lastToFirst();
            System.out.println(queue);
        }

        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        queue.add(11);
        System.out.println(queue);
        for(int i = 1; i <= 5; i++) {
            queue.lastToFirst();
            System.out.println(queue);
        }
    }
    
}