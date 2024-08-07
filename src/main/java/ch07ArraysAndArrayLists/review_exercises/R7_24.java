package ch07ArraysAndArrayLists.review_exercises;

import java.util.Arrays;
import java.util.Random;

public class R7_24 {

    public static void main(String[] args) {
        int[] values = new int[10];

        System.out.println("Run 1");
        makeCombination(values, 30);
        System.out.println(Arrays.toString(values));

        System.out.println("\n\nRun 2");
        makeCorrectCombination1(values, 15);
        System.out.println(Arrays.toString(values));

        System.out.println("\n\nRun 3");
        values = makeCorrectCombination2(values, 50);
        System.out.println(Arrays.toString(values));
    }

    /* 
     * (H) What is wrong with the following method that aims to fill an array with random numbers?
     *
     * The numbers array is being initialized within the makeCombination method, so it's scope is only within this method. Also,
     * the values array is referencing the address to the original array. Once we fill the numbers array with random numbers and
     * assign the same reference to values, we leave this method so the reference will be lost. We either need to directly add
     * the random numbers into the values array or return a new array.
     */
    public static void makeCombination(int[] values, int n) {
        Random generator = new Random();
        int[] numbers = new int[values.length];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(n);
        }
        values = numbers;

        System.out.println(Arrays.toString(values));
    }

    public static void makeCorrectCombination1(int[] values, int n) {
        Random generator = new Random();
        
        for(int i = 0; i < values.length; i++) {
            values[i] = generator.nextInt(n);
        }
        System.out.println(Arrays.toString(values));
    }

    public static int[] makeCorrectCombination2(int[] values, int n) {
        Random generator = new Random();

        int[] numbers = new int[values.length];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = generator.nextInt(n);
        }
        return numbers;
    }   
}