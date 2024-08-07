package ch07ArraysAndArrayLists.practice_exercises;

import ch07ArraysAndArrayLists.practice_exercises.pojo.ArraySequence;
public class E7_11 {
    public static void main(String[] args) {
        int[] identical = {1, 2, 3, 4, 5, 6, 7};
        ArraySequence s1 = new ArraySequence(identical);
        ArraySequence s2 = new ArraySequence(identical);
        System.out.println("Are s1 and s2 identical? " + s1.equals(s2));
        System.out.println("expected: true");

        identical = new int[]{1, 2, 3, 4, 5};
        s2 = new ArraySequence(identical);
        System.out.println("Are s1 and s2 identical? " + s1.equals(s2));
        System.out.println("expected: false");

        int[] notIdentical = {1, 2, 3, 6, 7, 8, 9};
        s2 = new ArraySequence(notIdentical);
        System.out.println("Are s1 and s2 identical? " + s1.equals(s2));
        System.out.println("expected: false");
    }
}