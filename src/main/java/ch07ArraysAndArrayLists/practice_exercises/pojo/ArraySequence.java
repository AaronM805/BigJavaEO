package ch07ArraysAndArrayLists.practice_exercises.pojo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArraySequence {
    private int[] values;

    public ArraySequence(int size) {
        values = new int[size];
    }

    public ArraySequence(int[] vals) {
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
    public boolean equals(ArraySequence other) {
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
     * Problem E7.13
     * Difficulty: Hard
     *
     * TIME: 00:44:52
     * Time Complexity: O(N)
     * Space Complexity: O(N + M)
     */
    /**
     * This method returns true if this sequence and other sequence have the same value in some order, with the same
     * multiplicities. For example, 1 4 9 16 9 7 4 9 11 is a permutation of 11 1 4 9 16 9 7 4 9 but 1 4 9 16 9 7 4 9 11
     * is not a permutation of 11 1 4 9 16 9 7 4 9.
     *
     * You will probably need one or more helper methods.
     *
     * @param other - the other sequence to compare against
     *
     * @return true if this sequence is a permutation and has the same multiplicity of the other sequece, otherwise return false
     */
    public boolean isPermutationOf(ArraySequence other) {
        // To check if it's a permutation w/ multiplicity, use map to store Key Value number - count
        Map<Integer, Integer> thisMap = convertToMap(this);
        Map<Integer, Integer> otherMap = convertToMap(other);

        for(Map.Entry<Integer, Integer> entry : thisMap.entrySet()) {
            if(!otherMap.containsKey(entry.getKey()) || otherMap.get(entry.getKey()) != entry.getValue()) {
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
    public boolean sameValues(ArraySequence other) {
        Set<Integer> set = getSetOfValues();
        for(int i = 0; i < other.size(); i++) {
            if(!set.contains(other.get(i))) {
                return false;
            }
        }
        return true;
    }

    /*
     * Problem E7.14
     * Difficulty: Medium
     * TIME: 00:06:08
     * Time Complexity: O(N)
     * Space Complexity: O(1) not taking into account the initialization of Sequence; O(N) otherwise.
     */
    /**
     * This method yields the sum of this sequence and another. If the sequences don't have the same length, the missing elements
     * are zero. For example, 1 4 9 16 9 7 4 9 11 and 11 11 7 9 16 4 1 is the sequence 12 15 16 25 25 11 5 9 11.
     *
     * @param other - the sequence to add with this sequence.
     *
     * @return the new sequence that contains the sum of this and other sequence.
     *
     */
    public ArraySequence sum(ArraySequence other) {
        int size = Math.max(this.size(), other.size());
        ArraySequence sequence = new ArraySequence(size);

        int i = 0;
        int j = 0;

        while(i < this.size() && j < other.size()) {
            int sum = this.get(i) + other.get(j);
            sequence.set(i, sum);
            i++;
            j++;
        }

        while(i < this.size()) {
            sequence.set(i, this.get(i));
            i++;
        }

        while(j < other.size()) {
            sequence.set(j, other.get(j));
            j++;
        }
        
        return sequence;
    }

    public int size() {
        return values.length;
    }

    public String toString() {
        return Arrays.toString(values);
    }

    private Map<Integer, Integer> convertToMap(ArraySequence sequence) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < sequence.size(); i++) {
            int key = sequence.get(i);
            if(!map.containsKey(key)) {
                map.put(key, 1);
            }
            else {
                map.put(key, map.get(key) + 1);
            }
        }
        return map;
    }

    private Set<Integer> getSetOfValues() {
        Set<Integer> set = new HashSet<>();

        for(int val : values) {
            set.add(val);
        }
        return set;
    }
}