package ch14SortingAndSearching.chapter_examples.section6;

/**
 * This class will be used for all of the various searching implementations.
 *
 * @author Aaron N. Martinez
 * @version 0.1
 */
public class Search {

    /**
     * This method searching for a value using linear search. It returns the first index of the match or -1 if there is no match.
     *
     * @param a the array to search in
     * @param value the value to search for
     *
     * @return the index position if the value is found, -1 othewise
     *
     */
    public static int linearSearch(int[] a, int value) {

        for(int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] a, int value) {
        return binarySearch(a, value, 0, a.length - 1);
    }

    private static int binarySearch(int[] a, int value, int from, int to) {
        if (from < to) {
            int middle = (from + to) / 2;

            if (value == a[middle]) {
                return middle;
            }
            else if (value > a[middle]) {
                return binarySearch(a, value, middle + 1, to);
            }
            else {
                return binarySearch(a, value, from, middle - 1);
            }
        }
        else {
            return -1;
        }
    }
}