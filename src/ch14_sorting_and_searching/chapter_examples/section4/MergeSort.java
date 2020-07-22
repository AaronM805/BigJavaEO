package ch14_sorting_and_searching.chapter_examples.section4;

/**
 * Sorts data using merge sort.
 *
 * @author Aaron Martinez
 * @version 0.1
 */
public class MergeSort{

    /**
     * Sorts data using merge sort.
     *
     * @param a data to be sorted
     */
    public static void sort(int[] a) {
        sort(a, 0, a.length-1);
    }

    private static void sort(int[] a, int left, int right) {
        if (right > left) {
            int middle = (right + left) / 2;
            sort(a, left, middle);
            sort(a, middle + 1, right);

            merge(a, left, middle, right);
        }
    }

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
}