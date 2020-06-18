package ch14_sorting_and_searching.practice_exercises;

import java.util.Scanner;

import ch14_sorting_and_searching.chapter_examples.section1.SelectionSorter;
import ch14_sorting_and_searching.chapter_examples.section2.StopWatch;
import utils.ArrayUtil;

public class E14_3 {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        //ask for smallest, largest value
        System.out.print("Enter the smallest and largest value to test: ");
        int minVal = in.nextInt();
        int maxVal = in.nextInt();
        // ask for number of measurements
        System.out.print("Enter number of measurements to be taken: ");
        int measurements = in.nextInt();
        in.close();

        // calculate how often the program should print output
        int interval = (maxVal - minVal) / measurements;
        StopWatch timer = new StopWatch();
        
        System.out.printf("%-10s%-10s","n", "ms");
        for(int idx = minVal; idx <= maxVal; idx++) {
            // TODO: I am not trying to pring out initial value. How else can I do this?
            if(idx != minVal && idx % interval == 0) {
                int[] a = ArrayUtil.randomIntArray(idx, idx);
                timer.start();
                SelectionSorter.sort(a);
                timer.stop();
                
                System.out.printf("\n%-10d%-10s",idx, timer.getElapsedTime());
            }
        }
        /*
            TABLE
            Format: center aligned
            
            N	Ms
            N	Ms
            N	ms
        */
    }
}