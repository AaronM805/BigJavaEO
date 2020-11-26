package ch15_the_java_collections_framework.review_exercises;

import java.util.LinkedList;
import java.util.ListIterator;


/**
 * Difficulty: Easy
 *
 * Explain what the following code prints. Draw a picture of the linked list and the iterator position after each step.
 *
 * Using this to verify my answer that was written out by hand.
 *
 * @author Aaron Martinez
 * @version 0.1
 */
public class R15_8 {
    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<>();
        ListIterator<String> iterator = staff.listIterator();
        iterator.add("Tom");
        iterator.add("Diana");
        iterator.add("Harry");
        iterator = staff.listIterator();

        if (iterator.next().equals("Tom")) {
            iterator.remove();
        }

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}