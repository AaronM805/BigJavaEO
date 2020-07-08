package ch15_the_java_collections_framework.practice_exercises;

import java.util.Stack;

/**
 * Use a stack to reverse the words of a sentence. Keep reading words until you have a word that ends in a period, adding them
 * onto a stack. When you have a word with a period, pop the words off and print them. Stop when there are no more words in the
 * input. For example, you should turn the input
 *  Mary had a little lamb. Its fleece was white as snow.
 *
 * into
 * 
 * Lamb little a had mary. Snow as white was fleece its.
 *
 * Pay attention to capitalization and the placement of the period.
 *
 * Difficulty: Medium
 * 
 * TIME:
 * Time Complexity:
 * Space Complexity:
 */
public class E15_8 {
    public static void main(String[] args) {
        String paragraph = "Mary had a little lamb. Its fleece was white as snow.";
        System.out.println(reverse(paragraph));
    }

    public static String reverse(String input) {
        /*
        split the string at every period and store into a sentence array
        for each sentence
            for each word in the sentence
                if it is the first word, lowercase it and add a period
                else if it the last word, make first word uppercase

                push each word onto the stack


            while stack is not empty
                pop from the stack and print

        
        */
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String[] sentences = input.split(".");

        for(int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].trim().split(" ");
            for(int j = 0; j < words.length; j++) {
                String word = words[j];
                if(j == 0) {
                    word = word.substring(0, 1).toLowerCase() + word.substring(1) + ".";
                }
                else if(j == words.length - 1) {
                    word = word.substring(0, 1).toUpperCase() + word.substring(1);
                }

                stack.push(word);
            }

            while(!stack.empty()) {
                sb.append(stack.pop()).append(" ");
            }
        }

        return sb.toString();
    }
}