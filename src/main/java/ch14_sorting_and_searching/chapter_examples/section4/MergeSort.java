package ch14_sorting_and_searching.chapter_examples.section4;

/**
 * Sorts data using merge sort.
 *
 * @author Aaron Martinez
 * @version 0.1
 */
public class MergeSort{

    /**
     * Sorts array using merge sort.
     *
     * @param a the array to sort
     */
    public static void sort(int[] a) {
        sort(a, 0, a.length-1);
    }

    /**
     * Sorts array using merge sort.
     *
     * @param a the array to sort
     */
    public static void sort(String[] a) {
        sort(a, 0, a.length - 1);
    }

    /**
     * Method that will be called to recursively sort the array.
     *
     * @param a the array to sort
     * @param left the leftmost index of the array
     * @param right the rightmost index of the array
     */
    private static void sort(int[] a, int left, int right) {
        if (right > left) {
            int middle = (right + left) / 2;
            sort(a, left, middle);
            sort(a, middle + 1, right);

            merge(a, left, middle, right);
        }
    }

    /**
     * Method that will b called to recursively sort the array.
     *
     * @param a the array to be sorted
     * @param left the leftmost index of the array
     * @param right the rightmost index of the array
     */
    private static void sort(String[] a, int left, int right) {
        if (right > left) {
            int middle = (right + left) / 2;

            sort(a, left, middle);
            sort(a, middle + 1, right);

            merge(a, left, middle, right);
        }
    }

    /**
     * Merges an array using the left, middle, and right indeces.
     *
     * @param a the array to sort
     * @param left the left index of they array
     * @param middle the middle index of the array
     * @param right the right index of the array
     */
    private static void merge(int[] a, int left, int middle, int right) {
        int size1 = middle - left + 1;
        int size2 = right - middle;   
        int[] LEFT = new int[size1];
        int[] RIGHT = new int[size2];

        for (int i = 0; i < size1; i++) {
            LEFT[i] = a[left+i];
        }

        for (int i = 0; i < size2; i++) {
            RIGHT[i] = a[middle+1+i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i < size1 && j < size2) {
            if (LEFT[i] <= RIGHT[j]) {
                a[k] = LEFT[i];
                i++;
            }
            else {
                a[k] = RIGHT[j];
                j++;
            }
            k++;
        }

        while (i < size1) {
            a[k] = LEFT[i];
            i++;
            k++;
        }

        while (j < size2) {
            a[k] = RIGHT[j];
            j++;
            k++;
        }
    }

    /**
     * Merges an array using the left, middle, and right indeces.
     *
     * @param a the array to sort
     * @param left the left index of they array
     * @param middle the middle index of the array
     * @param right the right index of the array
     */
    private static void merge(String[] a, int left, int middle, int right) {
        // left = 0, middle = 0, right = 1
        int leftSize = middle - left + 1;
        int rightSize = right - middle;
        String[] leftArr = new String[leftSize];
        String[] rightArr = new String[rightSize];

        for(int i = 0; i < leftSize; i++) {
            leftArr[i] = a[left + i];
        }

        for(int i = 0; i < rightSize; i++) {
            rightArr[i] = a[middle + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i < leftSize && j < rightSize) {
            if(leftArr[i].compareTo(rightArr[j]) < 0) {
                a[k] = leftArr[i];
                i++;
            }
            else {
                a[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while(i < leftSize) {
            a[k] = leftArr[i];
            i++;
            k++;
        }

        while(j < rightSize) {
            a[k] = rightArr[j];
            j++;
            k++;
        }
    }
}