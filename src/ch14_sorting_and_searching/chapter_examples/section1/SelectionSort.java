package ch14_sorting_and_searching.chapter_examples.section1;

public class SelectionSort {
    public static void sort(int[] data) {
        for(int i = 0; i < data.length - 1; i++) {
            int smallestPos = findMinIndex(data, i);
            swap(data, i, smallestPos);
        }
    }

    private static int findMinIndex(int[] data, int index) {
        int minPos = index;
        for(int j = index + 1; j < data.length; j++) {
            if(data[j] < data[minPos]) {
                minPos = j;
            }
        }
        return minPos;
    }

    private static void swap(int[] data, int src, int des) {
        if(src != des) {
            int tmp = data[src];
            data[src] = data[des];
            data[des] = tmp;
        }
    }
}