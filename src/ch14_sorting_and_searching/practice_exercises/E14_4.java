package ch14_sorting_and_searching.practice_exercises;

import java.util.Arrays;

import ch14_sorting_and_searching.practice_exercises.sorts.MergeSorter;

public class E14_4 {
    public static void main(String[] args) {
        String[] strArray = {"Waterbuffalo", "Water", "boy", "Aaron", "aaron", "andrea", "Asquared", "A squared", "zoo", "light"};
        
        System.out.println(Arrays.toString(strArray));
        MergeSorter.stringSort(strArray);
        System.out.println(Arrays.toString(strArray));
    }
}