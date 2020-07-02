package ch15_the_java_collections_framework.review_exercises;

import java.util.LinkedList;

/**
 * Difficulty: Medium
 *
 * You are given a linked list of strings. Remove all elements with length less than or equal to three using the removeIf method.
 * Use a lambda expression.
 *
 * @author Aaron Martinez
 * @version 0.1
 */
public class R15_11 {

    private static int WORD_LENGTH = 3;

    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();

        words.add("Aaron");
        words.add("Ana");
        words.add("Aa");
        words.add("Andrea");
        words.add("Aste");
        words.add("Por");
        words.add("No");
        words.add("Si");

        System.out.println(words);
        remove(words);
        System.out.println(words);
    }

    /**
     * Removes words with length less than or equal to 3.
     *
     * @param words the list to process 
     */
    public static void remove(LinkedList<String> words) {
        words.removeIf(word -> word.length() <= WORD_LENGTH);
    }
}