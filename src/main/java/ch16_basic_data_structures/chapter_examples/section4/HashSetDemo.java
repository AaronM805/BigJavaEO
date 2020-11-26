package ch16_basic_data_structures.chapter_examples.section4;

import java.util.Iterator;

/**
 * This program demonstrates the hash set class.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet names = new HashSet(50, false);

        names.add("Aaron");
        names.add("Ugh");
        names.add("Andrea");
        names.add("Cynthia");
        names.add("cynthia");
        names.add("Mari");
        names.add("Danny");
        names.add("Ana");
        names.add("Marisela");
        names.add("Gabriela");
        names.add("Jose Aaron");
        names.add("Harry");
        names.add("Sue");
        names.add("Nina");
        names.add("Susannah");
        names.add("Larry");
        names.add("Eve");
        names.add("Sarah");
        names.add("Adam");
        names.add("Tony");
        names.add("Katherine");
        names.add("Juliet");
        names.add("Romeo");
        names.add("Romeo");
        names.add("George");
        names.add("VII");

        System.out.println(names);

        Iterator iter = names.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}