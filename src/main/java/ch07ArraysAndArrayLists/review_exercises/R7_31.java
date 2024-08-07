package ch07ArraysAndArrayLists.review_exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class R7_31 {
    public static void main(String[] args) {

        List<String> words = new ArrayList<>();

        words.add("Hello");
        words.add("Andrea");
        words.add("Ana");
        words.add("Julie");
        words.add("No");
        words.add("Sal");

        List<String> words2 = new ArrayList<>(words);
        Collections.copy(words2, words);

        System.out.println(words);
        removeForward(words);
        System.out.println(words);
        System.out.println("\n");
        System.out.println(words2);
        removeBackwards(words2);
        System.out.println(words2);
    }

    private static void removeForward(List<String> words) {
        int i = 0;
        while (i < words.size()) {
            String word = words.get(i);
            
            if (word.length() < 4) {
                words.remove(i);
            }
            else {
                i++;
            }
        }
    }

    private static void removeBackwards(List<String> words) {
        int idx = words.size() - 1;

        while(idx >= 0) {
            if(words.get(idx).length() < 4)
                words.remove(idx);
            
            idx--;
        }
    }
}