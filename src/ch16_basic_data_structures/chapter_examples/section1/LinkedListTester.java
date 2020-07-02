package ch16_basic_data_structures.chapter_examples.section1;

/**
 * This class serves as a tester for LinkedList implementation from the chapter example.
 *
 * @author Aaron Martinez
 * @version 0.1
 */
public class LinkedListTester {
    public static void main(String[] args) {
<<<<<<< HEAD
        LinkedList list = initializeLinkedList();
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.removeFirst());
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list);
        System.out.println(list.removeFirst());
        System.out.println(list.getFirst());
        System.out.println(list);

        list = initializeLinkedList();
        ListIterator iterator = list.listIterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        iterator = list.listIterator();
        int count = 0;
        int addAtPos = 4;
        System.out.println(list);
        while(iterator.hasNext()) {
            count++;
            if(count % addAtPos == 0) {
                iterator.add("Z");
            }
            iterator.next();
        }
        System.out.println(list);

        list = initializeLinkedList();
        iterator = list.listIterator();
        count = 0;
        addAtPos = 3;
        System.out.println(list);
        while(iterator.hasNext()) {
            count++;
            iterator.next();
            if(count % addAtPos == 0) {
                iterator.remove();
            }
        }
        System.out.println(list);

        list = initializeLinkedList();

        iterator = list.listIterator();
        count = 0;
        addAtPos = 5;
        System.out.println(list);
        while(iterator.hasNext()) {
            count++;
            iterator.next();
            if(count % addAtPos == 0) {
                iterator.set("SET");
            }
        }
        System.out.println(list);
    }

    private static LinkedList initializeLinkedList() {
=======
>>>>>>> Updated chapter examples.
        LinkedList list = new LinkedList();
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        list.addFirst("D");
        list.addFirst("E");
        list.addFirst("F");
<<<<<<< HEAD

        return list;
=======
        System.out.println(list);
        ListIterator iterator = list.listIterator();

>>>>>>> Updated chapter examples.
    }
}