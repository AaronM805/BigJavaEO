package ch07ArraysAndArrayLists.practice_exercises;

import java.util.Arrays;

public class E7_6 {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 9, 16, 9, 7, 4, 9, 11};

        System.out.println(Arrays.toString(numbers));
        reverseArray(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    /*
        Write a method that reverses the sequence of elements in an array. For example, if you call the method with the array
		1 4 9 16 9 7 4 9 11
	    Then the array is changed to
		11 9 4 7 9 16 9 4 1
	
        We have a method that takes in an int array as parameter. We now need to reverse the order of the elements in the array.

        Time complexity: O(N)
        Space complexity: O(1) no new space is used for this
    */
    public static void reverseArray(int[] arr) {
		for(int idx = 0; idx < arr.length / 2; idx++) {
			int pos = arr.length  - 1 - idx;
			int temp = arr[idx];
			arr[idx] = arr[pos];
			arr[pos] = temp;
        }
        // return arr;
    }
}