package ch14_sorting_and_searching.chapter_examples.section1;

import utils.ArrayUtil;
/**
 * The sort method of this class sorts an array, using the selection sort algorithm.
 *
 * @author Aaron N. Martinez
 * @version 0.1
 */
public class SelectionSort {

    /**
     * Sorts an array, using selection sort, in ascending order.
     *
     * @param data the array to sort
     * @param ascOrder flag indicating whether to sort data in ascending order, or descending order
     */
    public static void sort(int[] data, boolean ascOrder) {
        for(int i = 0; i < data.length - 1; i++) {
            int position = findIndex(data, i, ascOrder);
            ArrayUtil.swap(data, i, position);
        }
    }

    /**
     * Finds the smallest element in array and returns it's position. Finds the smallest element in a tail range of the array.
     * 
     * @param data the array to look for smallest position
     * @param index the current index. (from) the first position in data to compare.
     * @param ascOrder flag indicating whether to sort data in ascending order, or descending order
     *
     * @return the position of smallest element. The position of the smallest element in the range from a[from] ...
     *         a[a.length - 1].
     */
    private static int findIndex(int[] data, int index, boolean ascOrder) {
        int pos = index;
        for(int j = index + 1; j < data.length; j++) {
            if((ascOrder && data[j] < data[pos]) || (!ascOrder && data[j] > data[pos])) {
                pos = j;
            }
        }
        return pos;
    }
}