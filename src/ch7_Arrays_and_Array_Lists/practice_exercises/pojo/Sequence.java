package ch7_Arrays_and_Array_Lists.practice_exercises.pojo;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Sequence {
    private int[] values;

    public Sequence(int size) {
        values = new int[size];
    }

    public Sequence(int[] vals) {
        values = vals;
    }
    
    public void set(int i, int n) {
        values[i] = n;
    }
    
    public int get(int i) {
        return values[i];
    }

    /*
     * Problem E7.11
     * Difficulty: Medium
     * TIME: 00:14:20
     * Time Complexity: O(N)
     * Space Complexity: O(1)
    */
    /**
     * This method checks whether two sequences have the same values in the same order.
     *
     * @param other - the other sequence to compare.
     *
     * @return true if this sequence and other are the same sequence, false otherwise.
     */
    public boolean equals(Sequence other) {
        if(this.size() != other.size()) {
            return false;
        }

        for(int i = 0; i < this.size(); i++) {
            if(this.get(i) != other.get(i)) {
                return false;
            }
        }
        return true;
    }

    /*
     * Problem E7.12
     * Difficulty: Medium
     * TIME: 00:15:12
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    /**
     * This method checks whether two sequences have the same value in some order, ignoring duplicates. The two sequences
     * 1 4 9 16 9 7 4 9 11 and 11 11 7 9 16 4 1 would be considered identical.
     *
     * @return true if this and other sequence have the same values, otherwise false.
     */
    public boolean sameValues(Sequence other) {
        Set<Integer> set = getSetOfValues();
        for(int i = 0; i < other.size(); i++) {
            if(!set.contains(other.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        return values.length;
    }

    public String toString() {
        return Arrays.toString(values);
    }

    private Set<Integer> getSetOfValues() {
        Set<Integer> set = new HashSet<>();

        for(int val : values) {
            set.add(val);
        }
        return set;
    }
}