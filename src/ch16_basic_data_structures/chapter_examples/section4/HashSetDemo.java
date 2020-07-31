package ch16_basic_data_structures.chapter_examples.section4;

import java.util.Iterator;

/**
 * This program demonstrates the hash set class.
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet names = new HashSet(50);

        names.add("Aaron", false);
        names.add("Ugh", false);
        names.add("Andrea", false);
        names.add("Cynthia", false);
        names.add("cynthia", false);
        names.add("Mari", false);
        names.add("Danny", false);
        names.add("Ana", false);
        names.add("Marisela", false);
        names.add("Gabriela", false);
        names.add("Jose Aaron", false);
        names.add("Harry", false);
        names.add("Sue", false);
        names.add("Nina", false);
        names.add("Susannah", false);
        names.add("Larry", false);
        names.add("Eve", false);
        names.add("Sarah", false);
        names.add("Adam", false);
        names.add("Tony", false);
        names.add("Katherine", false);
        names.add("Juliet", false);
        names.add("Romeo", false);
        names.add("Romeo", false);
        names.add("George", false);
        names.add("VII", false);

        System.out.println(names);

        Iterator iter = names.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}