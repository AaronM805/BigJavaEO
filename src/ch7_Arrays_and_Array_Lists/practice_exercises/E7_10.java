package ch7_Arrays_and_Array_Lists.practice_exercises;

import java.util.Arrays;

import utils.ArrayUtil;
/**
 * Difficulty: Medium
 * 
 * Prompt
 * Write array methods that carry out the following tasks for an array of integers by completing the ArrayMethods class. For each
 * method, provide a test program.
 *		a. Swap the first and last elements in the array - DONE
 *		b. Shift all elements to the right by one and move the last element into the first position. For example, 1 4 9 16 25
 *			would be transformed to 25 1 4 9 16 - DONE
 *		c. Replace all even elements with 0 - DONE
 *		d. Replace each element except the first and last by the larger of its two neighbors - DONE
 *		e. Remove the middle element if the array length is odd, or the middle two elements if the length is even - DONE
 *		f. Move all even elements to the front, otherwise preserving the order of the elements - DONE
 *		g. Return the second-largest element in the array - DONE
 *		h. Return true if the array is currently sorted in increasing order - DONE
 *		i. Return true if the array contains two adjacent duplicate elements - DONE
 *		j. Return true if the array contains duplicate elements (which need not be adjacent). - DONE
 * 
 * TIME: 02:34:44
 */
public class E7_10 {
	public static void main(String[] args) {
		int[] values = ArrayUtil.randomIntArray(15, 10);
		ArrayMethods test = new ArrayMethods(values);
		System.out.println(Arrays.toString(values));
		System.out.println("Contains adjacent duplicates? " + test.containsAdjacentDuplicates());
		System.out.println("Contains duplicates? " + test.containsDuplicates());
		System.out.println("Second Largest " + test.getSecondLargest());
		System.out.println("Is the array sorted? " + test.isSorted());
		System.out.println();

		values = ArrayUtil.randomIntArray(15, 17);
		test = new ArrayMethods(values);
		System.out.println(Arrays.toString(values));
		System.out.println("Contains adjacent duplicates? " + test.containsAdjacentDuplicates());
		System.out.println("Contains duplicates? " + test.containsDuplicates());
		System.out.println("Second Largest " + test.getSecondLargest());
		System.out.println();

		values = ArrayUtil.randomIntArray(15, 500);
		test = new ArrayMethods(values);
		System.out.println(Arrays.toString(values));
		System.out.println("Contains adjacent duplicates? " + test.containsAdjacentDuplicates());
		System.out.println("Contains duplicates? " + test.containsDuplicates());
		System.out.println("Second Largest " + test.getSecondLargest());
		System.out.println("Is the array sorted? " + test.isSorted());
		Arrays.sort(values);
		System.out.println(Arrays.toString(values));
		test = new ArrayMethods(values);
		System.out.println("Is the array sorted? " + test.isSorted());
		System.out.println();

		values = ArrayUtil.randomIntArray(15, 50);
		test = new ArrayMethods(values);
		System.out.println(Arrays.toString(values));
		test.moveEvenToFront();
		System.out.println(test);
		System.out.println();

		values = ArrayUtil.randomIntArray(15, 15);
		test = new ArrayMethods(values);
		System.out.println(Arrays.toString(values));
		System.out.println("new length: " + test.removeMiddle());
		System.out.println(test);
 	 	System.out.println();

 	 	values = ArrayUtil.randomIntArray(14, 15);
		test = new ArrayMethods(values);
		System.out.println(Arrays.toString(values));
		System.out.println("new length: " + test.removeMiddle());
		System.out.println(test);
		System.out.println();

		values = ArrayUtil.randomIntArray(14, 500);
		test = new ArrayMethods(values);
		System.out.println(Arrays.toString(values));
		test.replaceByLargestNeighbor();
		System.out.println(test);
		System.out.println();

		values = ArrayUtil.randomIntArray(14, 500);
		test = new ArrayMethods(values);
		System.out.println(Arrays.toString(values));
		test.replaceEven();
		System.out.println(test);
		System.out.println();

		values = ArrayUtil.randomIntArray(14, 500);
		test = new ArrayMethods(values);
		System.out.println(Arrays.toString(values));
		test.shiftRight();
		System.out.println(test);
		System.out.println();

		values = ArrayUtil.randomIntArray(14, 500);
		test = new ArrayMethods(values);
		System.out.println(Arrays.toString(values));
		test.swapFirstAndLast();
		System.out.println(test);
		System.out.println();
	}
}

class ArrayMethods {
	private int[] values;
	
	public ArrayMethods(int [] initialValues) {
		values = initialValues;
	}

	/**
	 * This method checks if array contains two adjacent duplicate elements.
	 *
	 * @return true if array contains two adjacent duplicate elements, false otherwise.
	 *
	 * Time Complexity: O(N)
 	 * Space Complexity: O(1)
	 */
	public boolean containsAdjacentDuplicates() {
		/*
		[4, 5, 7, 9, 10, 13] - false
		[4, 5, 7, 7, 10, 13] - true
		*/
		if(null == values || values.length < 2) {
			return false;
		}

		for(int i = 0; i < values.length - 2; i++) {
			if(values[i] == values[i+1]) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This method checks if array contains two duplicate elements, regardless if they are
	 * adjacent or not.
	 *
	 * @return true if array contains duplicate elements, false otherwise.
	 *
	 * Time Complexity: O(N)
 	 * Space Complexity: O(1)
	 */
	public boolean containsDuplicates() {
		/*
		[4, 5, 7, 9, 10, 13] - false
		[4, 5, 7, 7, 10, 13] - true
		[8, 9, 10, 11, 13, 9] - true
           f               b		
		*/

    	if(null == values || values.length < 2) {
    		return false;
    	}

		int front = 0;
		int back = values.length - 1;
		while(front < values.length - 2) {
			if(front == back) {
				front++;
				back = values.length - 1;
			}

			if(values[front] != values[back]) {
				back--;
			}
			else {
				return true;
			}
		}

		return false;
	}	

	/**
	 * This method returns the second-largest element in array, or Integer.MIN_VALUE if there is no second largest.
	 *
	 * @return the second-largest element in array, or Integer.MIN_VALUE if no value exists.
	 *
	 * Time Complexity: O(N)
 	 * Space Complexity: O(1)
	 */
	public int getSecondLargest() {
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int i = 0; i < values.length; i++) {
			if(values[i] > largest) {
				secondLargest = largest;
				largest = values[i];
			}
			else if(values[i] > secondLargest && values[i] < largest) {
				secondLargest = values[i];
			}
		}

		return secondLargest;
	}

	/**
	 * This method checks if array is sorted in increasing order.
	 *
	 * @return true if array is sorted in increasing order, false otherwise.
	 *
	 * Time Complexity: O(N)
 	 * Space Complexity: O(1)
	 */
	public boolean isSorted() {
		boolean isSorted = true;
		int count = 1;
		while(isSorted && count < values.length) {
			if(values[count] < values[count - 1]) {
				isSorted = false;
			}
			count++;
		}
		return isSorted;
	}

	/**
	 * This method moves all even elements to the front of array, otherwise it preserves the
	 * order of the elements
	 *
	 * ** Time Complexity: O(N(E-C)) - the inner while loop only iterates constan times, namely (E-C (even - count))
 	 * Space Complexity: O(1)
	 */
	public void moveEvenToFront() {
		/*
		EXAMPLE:
		
		[3] - do nothing
		[-1, 3] - no even
		[-1, 2] - [2, -1]
		[4, 8, 12, -1, 3, 9, 11, 13]
		           c             e

		count = 2
		even = 6
		array.length = 8
		12
		tmpCnt = 6

		while even < array.length
		 	if array[even] is not even
		 		increment even
		 	else
		 		tmpVal = array[even]
		 		tmpCnt = even
		 		while(tmpCnt > count)
					array[tmpCnt] = array[tmpCnt - 1]
					tmpCnt--
				array[count] = tmpVal
				count++
				even++
		[8, 10, 12, 8, -1, 3, 7, 15, 7, 9]
                        c                  e


                   i
        tmpVAl = 8
        cnt = i

        while i >= 0
        	if values[i] is even
        		set count to i
				set tmp to values[i]
			else
				i--

			if(count is not 0)
				
		[1, 3]
		[2, 3]
		[3, 2]
		*/

		if(values.length < 2) {
			return;
		}

		int count = 0, evenPos = 0;
		while(evenPos < values.length) {
			if(values[evenPos] % 2 != 0) {
				evenPos++;
			}
			else {
				int tmpVal = values[evenPos];
				int tmpCount = evenPos;
				while(tmpCount > count) {
					values[tmpCount] = values[tmpCount - 1];
					tmpCount--;
				}
				values[count] = tmpVal;
				count++;
				evenPos++;
			}
		}
	}

	/**
	 * This method removes the middle element if the array length is odd, or the middle two
	 * elements if the length is even
	 *
	 * @return the new array length
	 *
	 * Time Complexity: O(N)
 	 * Space Complexity: O(1)
	 */
	public int removeMiddle() {
		/*
		 if array length < 3, return same array
		 given arr = [4, 3, 9, 0, 8]
		 	remove 9; length / 2 = index 2
		 	length = index
		 	from index to end of array
		 		shift array to the left, starting at index + 1
		 		length++

		 given arr = [9, 2, 9, 10, 9, 10]
		 	remove 2 and 9; length-1 / 2 = index (3-1)
		 	length = index
		 	from index to end of array
		 		shift array to the left, start at index + 2
		 		length++
		*/
		if(null == values) {
			return -1;
		}
		else if(values.length < 3) {
			return values.length;
		}

		int index = values.length % 2 == 0 ? (values.length - 1) / 2 : values.length / 2;
		int increment = values.length % 2 == 0 ? 2 : 1;
		int length = index;

		for(; index + increment < values.length; index++) {
			values[index] = values[index+increment];
			length++;
		}
		return length;
	}
	
	/**
	 * This method replaces each element, except the first and last, by the larger of its
	 * two neighbors.
	 *
	 * Time Complexity: O(N)
 	 * Space Complexity: O(1)
	 */
	public void replaceByLargestNeighbor() {
		// we start at index 1 and go to values.length - 2
		// we compare L and R and set index to largest
		// we are assuming that the array will be modified and that the left child may not be the original value.
		for(int i = 1; i < values.length - 2; i++) {
			int left = values[i - 1];
			int right = values[i + 1];

			values[i] = left > right ? left : right;
		}
	}

	/**
	 * This method replaces all even elements with 0.
	 *
	 * Time Complexity: O(N)
 	 * Space Complexity: O(1)
	 */
	public void replaceEven() {
		/*
			
			INPUT/OUTPUT
			Input - int[] values
			Output - even elements should be replaced with 0
			
			EXAMPLE
			1 4 9 16 25 -> 1 0 9 0 25
			
			STEPS
			Iterate through array
			If element is even, replace with 0
			
			ALGORITHMS
			Modified Linear Search (7.3.5), modified Inserting an Element (7.3.7)
			
			for(int idx = 0; idx < values.length; idx++) { 
				if (values[pos] % 2 == 0) { 
					Values[pos] = 0
				}
			}
			
			SUBTASK/PSEUDOCODE
			 for each element in values
				If element is even
					Replace element with 0
			
			TEST
			1 4 9 16 25
			1 is not even, move on
			4 is event, replace with 0
			9 is not even, move on
			16 is even, replace with 0
			25 is not even, move on
		*/
		for(int idx = 0; idx < values.length; idx++) { 
			if (values[idx] % 2 == 0) { 
				values[idx] = 0;
			}
		}
	}

	/**
	 * This method shifts all elements to the right by one and move the last element into
	 * the first position.
	 *
	 * Time Complexity: O(N)
 	 * Space Complexity: O(1)
	 */
	public void shiftRight() {
		/*
			Inputs - values array
			Output - elements in array shifted to right by one. Last element goes in first pos
			
			Example:
			
			1 4 9 16 25 would shift to 25 1 4 9 16
			
			Starting at the last position
			Get last element and store in a temp location
			Get element at last position minus one and place it at last position plus 1
			Go down the array until you get to the first position
			Place the temp element and place it in first position
			
			The two algorithms that I can use and modify are: removing an element (7.3.6) and Inserting an element (7.3.7)
			
			7.3.6
			for (int i = pos + 1; i < currentSize; i++) { 
			values[i - 1] = values[i]; } 
			
			
			7.3.7
			values[currentSize - 1] = newElement;
			
			for (int i = currentSize - 1; i > pos; i--) {
			values[i] = values[i - 1]; } 
			values[pos] = newElement;
			
			PSEUDOCODE
			Set tmp to values[values.length - 1]
			For idx starting at values.lengh - 1 going down to 1
				Set values[idx] = values[idx - 1]
			
			Set values[0] = tmp
			
			TEST
			Tmp = 25
			1 1 4 9 16
			  |
			
			25 1 4 9 16
		*/
		
		int temp = values[values.length - 1];
		for(int idx = values.length - 1; idx > 0; idx--) {
			values[idx] = values[idx - 1];
		}
		values[0] = temp;
	}

	/**
	 * This method swaps the first and last elements in array.
	 *
	 * Time Complexity: O(1)
 	 * Space Complexity: O(1)
	 */
	public void swapFirstAndLast() {
		int tmp = values[0];
		values[0] = values[values.length - 1];
		values[values.length - 1] = tmp;
	}

	/**
	 * This method returns a string representation of ArrayMethods.
	 *
	 * @return string representation of this ArrayMethods class.
	 */
	public String toString() {
		return Arrays.toString(values);
	}
}