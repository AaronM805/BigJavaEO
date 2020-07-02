package ch16_basic_data_structures.chapter_examples.section1;

/**
 * This class serves as a tester for LinkedList implementation from the chapter example.
 *
 * @author Aaron Martinez
 * @version 0.1
 */
public class LinkedListTester {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.addFirst("D");
        list.addFirst("E");
        list.addFirst("F");
        System.out.println(list);
        ListIterator iterator = list.listIterator();

    }
}