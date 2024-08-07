package ch14SortingAndSearching.chapter_examples.special_topics;

/**
 * This class implements the quick sort algorithm.
 *
 * @author Aaron Martinez
 * @version 0.1
 */
public class QuickSort {
    
    /**
     * Sorts an array using quick sort.
     *
     * @param arr the array to sort
     */
    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int from, int to) {
        if (from < to) {
            int partition = partition(arr, from, to);

            sort(arr, from, partition - 1);
            sort(arr, partition + 1, to);
        }
    }

    private static int partition(int[] arr, int from, int to) {
        int pivot = arr[to];
        int i = from - 1;

        for(int j = from; j < to; j++) {
            if (arr[j] <= pivot) {
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        int tmp = arr[i+1];
        arr[i+1] = arr[to];
        arr[to] = tmp;
        return i + 1;
    }
}