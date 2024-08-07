package ch15JavaCollectionsFramework.review_exercises;

import java.util.LinkedList;

/**
 * Difficulty: Easy
 *
 * Explain what the following code prints. Draw a picture of the linked list after each step
 *
 * Using this to verify my answer that was written out by hand.
 *
 * @author Aaron Martinez
 * @version 0.1
 */
public class R15_5 {
    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<>();
        staff.addFirst("Harry");  
        staff.addFirst("Diana");
        staff.addFirst("Tom");

        System.out.println(staff.removeFirst());
        System.out.println(staff.removeFirst());
        System.out.println(staff.removeFirst());
    }
}