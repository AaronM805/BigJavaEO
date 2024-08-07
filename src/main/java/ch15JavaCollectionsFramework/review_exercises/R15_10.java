package ch15JavaCollectionsFramework.review_exercises;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Difficulty: Medium
 *
 * You are given a linked list of strings. Remove all elements with length less than or equal to three.
 *
 * @author Aaron Martinez
 * @version 0.1
 */
public class R15_10 {

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
        ListIterator<String> iter = words.listIterator();

        while(iter.hasNext()) {
            String word = iter.next();

            if(word.length() <= WORD_LENGTH) {
                iter.remove();
            }
        }
    }
}