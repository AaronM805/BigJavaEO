package ch07ArraysAndArrayLists.review_exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class R7_33 {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(8);
        list1.add(9);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(8);
        list2.add(9);

        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(4);
        list3.add(8);
        list3.add(5);
        list3.add(9);

        // a. Test that two arrays contain the same elements in the same order
        System.out.println("Expected: True\t\tActual: " + list1.equals(list2));
        System.out.println("Expected: False\t\tActual: " + list1.equals(list3));

        // b. Copy one array list to another
        List<Integer> copy = new ArrayList<>(list2);
        System.out.println(copy.toString());
        System.out.println(list2.toString());

        Collections.copy(copy, list3);
        System.out.println(list3.toString());
        System.out.println(copy.toString());

        // c. Fill an array list with zeroes, overwriting all elements in it
        Collections.fill(copy, 0);
        System.out.println(copy.toString());

        // d. Remove all elements from an array list
        list1 = new ArrayList<>();
        list3.clear();
        System.out.println(list1.toString());
        System.out.println(list3.toString());
    }
    
}