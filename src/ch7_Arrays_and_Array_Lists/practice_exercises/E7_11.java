package ch7_Arrays_and_Array_Lists.practice_exercises;

import ch7_Arrays_and_Array_Lists.practice_exercises.pojo.Sequence;
public class E7_11 {
    public static void main(String[] args) {
        int[] identical = {1, 2, 3, 4, 5, 6, 7};
        Sequence s1 = new Sequence(identical);
        Sequence s2 = new Sequence(identical);
        System.out.println("Are s1 and s2 identical? " + s1.equals(s2));
        System.out.println("expected: true");

        identical = new int[]{1, 2, 3, 4, 5};
        s2 = new Sequence(identical);
        System.out.println("Are s1 and s2 identical? " + s1.equals(s2));
        System.out.println("expected: false");

        int[] notIdentical = {1, 2, 3, 6, 7, 8, 9};
        s2 = new Sequence(notIdentical);
        System.out.println("Are s1 and s2 identical? " + s1.equals(s2));
        System.out.println("expected: false");
    }
}