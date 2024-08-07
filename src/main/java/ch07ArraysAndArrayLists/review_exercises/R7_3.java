package ch07ArraysAndArrayLists.review_exercises;

/**
 * Difficulty: Easy
 * 
 * Prompt:
 * 
 * Write a program that contains a bounds error. Run the program. What happens to your computer?
 * 
 * Nothing happens to my computer, but when I try to compile this code, I will get an ArrayIndexOutOfBoundsException error.
 * 
 * TIME:
 * Time Complexity:
 * Space Complexity:
 */
public class R7_3 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[5] = 4;
    }
}