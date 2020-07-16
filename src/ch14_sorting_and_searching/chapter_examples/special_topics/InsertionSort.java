package ch14_sorting_and_searching.chapter_examples.special_topics;

/**
 * Sorts arrays using insertion sort.
 *
 * @author Aaron Martinez
 * @version 0.1
 */
public class InsertionSort {
    /*
    • We assume that the initial sequence a[0] a[1] … a[k] of an array is already sorted
        ○ k is initially set to 0
    • The initial sequence is enlarged by inserting the next array element, a[k+1], at the proper location
reaching the end of the array completes the sort
*/
    public static void sort(int[] a) {
        /*
            [7, 9, 1, 10, 0, 2, 6]
                       i
            k = 2
        */
        for(int i = 0; i < a.length; i++) {
            int k = i;

            while(k > 0 && a[k] < a[k-1]) {
                int tmp = a[k];
                a[k] = a[k-1];
                a[k-1] = tmp;
                k--;
            }
        }
    }
}