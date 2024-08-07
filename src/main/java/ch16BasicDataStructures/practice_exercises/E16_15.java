package ch16BasicDataStructures.practice_exercises;

import ch16BasicDataStructures.chapter_examples.section3.CircularArrayQueue;
/**
 * Add a method firstToLast, as described in Exercise E16.13, to the circular array implementation of a queue.
 * 
 * TIME: 00:11:57
 * Time Complexity: O(1)+
 * Space Complexity: O(1)+
 */
/**
 *Difficulty: Easy
 */
public class E16_15 {
    public static void main(String[] args) {
        CircularArrayQueue queue = new CircularArrayQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        queue.firstToLast();
        System.out.println(queue);
        queue.firstToLast();
        System.out.println(queue);
        queue.firstToLast();
        System.out.println(queue);

        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        System.out.println(queue);
        queue.firstToLast();
        System.out.println(queue);
        queue.firstToLast();
        System.out.println(queue);
        queue.firstToLast();
        System.out.println(queue);
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        System.out.println(queue);
        queue.firstToLast();
        System.out.println(queue);
        queue.firstToLast();
        System.out.println(queue);
        queue.firstToLast();
        System.out.println(queue);
    }
    
}