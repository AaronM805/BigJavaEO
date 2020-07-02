<<<<<<< HEAD
package ch16_basic_data_structures.chapter_examples.section1;
=======
<<<<<<< HEAD:src/ch16_basic_data_structures/self_check/LinkedList.java
package ch16_basic_data_structures.self_check;

import ch16_basic_data_structures.chapter_examples.section1.ListIterator;
=======
package ch16_basic_data_structures.chapter_examples.section1;
>>>>>>> Updated chapter examples.:src/ch16_basic_data_structures/chapter_examples/section1/LinkedList.java
>>>>>>> Updated chapter examples.

import java.util.NoSuchElementException;

/**
 * This class implements the basic functionality for a linked list.
 * 
 * A linked list is a sequence of nodes with efficient element insertion and removal. This class contains a subset of the methods
 * of the standard java.util.LinkedList class.
 *
 * @author Aaron Martinez
<<<<<<< HEAD
 * @version 0.1
=======
 * @version 0.2
>>>>>>> Updated chapter examples.
 */
public class LinkedList {

	private Node head;
<<<<<<< HEAD
	private int currentSize;
=======
>>>>>>> Updated chapter examples.
	// may or may not be provided in other implemenations.
	// private Node tail;

	/**
	 * Creates a default linked list.
	 *
	 * Constructs  an empty linked list.
	 */
	public LinkedList() {
<<<<<<< HEAD
		head = null;
		currentSize = 0;
=======
	   head = null;
>>>>>>> Updated chapter examples.
	}

	/**
	 * Adds a new node to the linked list.
	 *
	 * Adds an element to the front of the linked list.
	 *
	 * @param element the element to add
	 */
	public void addFirst(Object element) {
		Node newNode = new Node(element);
		newNode.next = head;
		head = newNode;
<<<<<<< HEAD
		currentSize++;
=======
	}

	/**
	 * Adds an element to the end of the linked list.
	 *
	 * @param element the element to add
	 */
	public void addLast(Object element) {
		Node tmp = head;

		while(tmp.next != null) {
			tmp = tmp.next;
		}

		Node newNode = new Node(element);
		tmp.next = newNode;
>>>>>>> Updated chapter examples.
	}

	/**
	 * Gets the first node from the linked list.
	 *
	 * Returns the first element in the linked list.
	 *
	 * @return the first element in the linked list
	 */
	public Object getFirst() {
		if(head == null) {
			throw new NoSuchElementException();
		}
		return head.data;
	}

	/**
<<<<<<< HEAD
	 * Gets the head of the linked list. This is not a correct implementation, but we just doing this to solve for Practice
	 * Problem E16_5.
	 *
	 * @return head of linked list
	 */
	public Node getHead() {
		return head;
	}

	/**
=======
>>>>>>> Updated chapter examples.
	 * Returns an iterator for iterating through this list.
	 *
	 * @return an iterator for iterating through this list
	 */
	public ListIterator listIterator() {
		return new LinkedListIterator();
	}

	/**
	 * Removes the first node from the linked list.
	 *
	 * Removes the first element in the linked list.
	 *
	 * @return the removed element
	 */
	public Object removeFirst() {
		if(head == null) {
			throw new NoSuchElementException();
		}

		Object element = head.data;
		head = head.next;
<<<<<<< HEAD
		currentSize--;
=======
>>>>>>> Updated chapter examples.

		return element;
	}

<<<<<<< HEAD
	/**
	 * Gets the current size of this linked list.
	 *
	 * @return this size
	 */
	public int size() {
		return currentSize;
	}

	/**
	 * Gets the string representation of this linked list.
	 *
	 * @return current representation of this linked list
	 */
=======
>>>>>>> Updated chapter examples.
	public String toString() {
		StringBuilder sb = new StringBuilder();
		ListIterator iter = this.listIterator();

		sb.append("[");
		while(iter.hasNext()) {
<<<<<<< HEAD
			Object next = iter.next();
			String delimiter = iter.hasNext() ? ", " : "";
			sb.append(next).append(delimiter);
		}
		sb.append("]");

		return sb.toString();
=======
			String delimiter = iter.hasNext() ? ", " : "";
			sb.append(iter.next).append(delimiter);
		}
		sb.append("]");

		sb.toString();
>>>>>>> Updated chapter examples.
	}

	class LinkedListIterator implements ListIterator {
		private Node position;
		private Node previous;
		private boolean isAfterNext;

		/**
		 * Default constructor to create a linked list iterator.
		 *
		 * Constructs an iterator that points to the front of the linked list.
		 */
		public LinkedListIterator() {
			position = null;
			previous = null;
			isAfterNext = false;
		}

		/**
		 * Adds an element before the iterator position and moves the iterator past the inserted element.
		 *
		 * @param element the element to add
		 */
		public void add(Object element) {
			if(position == null) {
				addFirst(element);
				position = head;
			}
			else {
				Node newNode = new Node(element);
				newNode.next = position.next;
				position.next = newNode;
				position = newNode;
			}
			isAfterNext = false;
<<<<<<< HEAD
			currentSize++;
=======
>>>>>>> Updated chapter examples.
		}

		/**
		 * Tests if there is an element after the iterator position.
		 *
		 * @return true if there is an element after the iterator position.
		 */
		public boolean hasNext() {
			if(position == null) {
				return head != null;
			}
			else {
				return position.next != null;
			}
		}

		/**
		 * Moves the iterator past the next element.
		 *
		 * @return the traversed element
		 */
		public Object next() {
			if(!hasNext()) {
				throw new NoSuchElementException();
			}

			previous = position; //Remember for remove;
			isAfterNext = true;

			// position = position == null ? first : position.next;
			if(position == null) {
				position = head;
			}
			else {
				position = position.next;
			}

			return position.data;
		}

		/**
		 * Removes the last traversed element. This method may only be called after a call to the next method.
		 */
		public void remove() {
			if(!isAfterNext) {
				throw new IllegalStateException();
			}

			if(position == head) {
				removeFirst();
			}
			else {
				previous.next = position.next;
<<<<<<< HEAD
				currentSize--;
			}
=======
			}

>>>>>>> Updated chapter examples.
			position = previous;
			isAfterNext = false;
		}

		/**
		 * Sets the last traversed element to a different value.
		 *
		 * @param element the element to set
		 */
		public void set(Object element) {
			if(!isAfterNext) {
				throw new IllegalStateException();
			}

			position.data = element;
		}
	}

<<<<<<< HEAD
	/**
	 * A node is a concept used to store inforation for each linked list node. We are making this class public to solve for
	 * Practice Exercise E16.5.
	 *
	 */
	public class Node {
=======
	class Node {
>>>>>>> Updated chapter examples.
		public Object data;
		public Node next;

		Node(Object data) {
			this.data = data;
		}
	}
}