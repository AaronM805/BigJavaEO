package ch14SortingAndSearching.chapter_examples.section1;

/**
 * The sort method of this class sorts an array, using the selection sort algorithm.
 */
public class SelectionSorter {

    /**
     * Sorts an array, using selection sort.
     * @param a the array to sort
     */
    public static void sort(int[] a) {
        /*
            Pseudocode
            iterate through array, starting at 0 up to length - 2
                find the minimum position starting at 1 to length
                swap elements at i and minPos of array
        */
        for(int i = 0; i < a.length - 1; i++) {
            // find minPos
            int minPos = minimumPosition(a, i);
            // swap elements
            swap(a, i, minPos);
        }
    }

    /**
     * Finds the smallest element in array and returns it's position. Finds the smallest element in a tail range of the array.
     * 
     * @param a the array to look for smallest position. the array to sort.
     * @param idx the current index. (from) the first position in a to compare.
     * @return the position of smallest element. the position of the smallest element in the range from a[from] ... a[a.length - 1]
     */
    private static int minimumPosition(int[] a, int idx) {
        int minPos = idx;
        for(int i = idx + 1; i < a.length; i++) {
            if(a[i] < a[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }
    
    /**
     * This method swaps the elements, at given positions, of the array.
     * @param a the array
     * @param idx the current position
     * @param minPos the position of the smallest elemnt in array
     */
    private static void swap(int[] a, int idx, int minPos) {
        int tmp = a[idx];
        a[idx] = a[minPos];
        a[minPos] = tmp;
    }
}