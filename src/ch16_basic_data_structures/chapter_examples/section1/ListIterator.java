package ch16_basic_data_structures.chapter_examples.section1;

/**
 * A list iterator allows access to a position in a linked list. This interface contains a subset of the methods of the standard
 * java.util.ListIterator interface. The methods for backward traversal are not included.
 *
 */
public interface ListIterator {
	
	/**
	 * This method adds a new node to the linked list at the current position.
	 *
	 * Adds an element before the iterator position and moves the iterator past the inserted element.
	 *
	 * @param element the element to add
	 */
	void add(Object element);

	/**
	 * This method checks whether there is a next node and return true if there is, or false otherwise.
	 *
	 * Tests if there is an element after the iterator position.

	 * @return true if there is an element after the iterator position
	 */
	boolean hasNext();

	/**
	 * Thie method gets the next node, or null if there is none.
	 *
	 * Moves the iterator past the enxt element.
	 *
	 * @return the traversed element
	 */
	Object next();

	/**
	 * This method removes the element that precedes the next value.
	 *
	 * Removes the last traversed element. This method may only be called after a call to the next method.
	 */
	void remove();

	/**
	 * This method changes the data stored in previously visited element.
	 *
	 * Sets the last traversed element to a different value.
	 *
	 * @param element the element to set
	 */
	void set(Object element);
}