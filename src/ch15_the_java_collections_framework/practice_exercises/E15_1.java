package ch15_the_java_collections_framework.practice_exercises;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Write a method
 *  public static void downsize(LinkedList<String> employeeNames, int n)
 * that removes every nth employee from a linked list.
 *
 * TIME: 00:13:46
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
/**
 * Difficulty: Medium
 */
public class E15_1 {

    public static void main(String[] args) {
        LinkedList<String> employeeNames = new LinkedList<>();
        employeeNames.add("A");
        employeeNames.add("B");
        employeeNames.add("C");
        employeeNames.add("D");
        employeeNames.add("E");
        employeeNames.add("F");
        employeeNames.add("G");
        employeeNames.add("H");
        employeeNames.add("I");

        System.out.println(employeeNames);
        downsize(employeeNames, 3);
        System.out.println(employeeNames);
    }

    public static void downsize(LinkedList<String> employeeNames, int n) {
        /*
        ["A", "B", "D", "E", "G", "H"]; 3
                                   |
        count = 9
        */
        ListIterator<String> iterator = employeeNames.listIterator();
        int count = 0;

        while(iterator.hasNext()) {
            iterator.next();
            count++;

            if(count % n == 0) {
                iterator.remove();
            }
        }
    }
}