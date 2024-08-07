package ch07ArraysAndArrayLists.practice_exercises;

import java.util.Arrays;

public class E7_8 {
    public static void main(String[] args) {

        int[] arr = {8, 9, 4, 10, 3, 4, 5, 12};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(swap(arr)));
    }

    /*
        Write a method that implements the following algorithm:
            i=0
            j=size/2
            While(i<size/2)
                Swap elements at positions i and j
                i++
                j++

        Time complexity: O(N)
        Space complexity: O(1) since no new space is used
    */
    public static int[] swap(int[] arr) {
	
		int i = 0;
		int j = arr.length / 2;
		
		while(i < arr.length / 2) {
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			i++;
			j++;
		}
	
		return arr;
    }
}