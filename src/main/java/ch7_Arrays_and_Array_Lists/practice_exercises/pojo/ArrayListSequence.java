package ch7_Arrays_and_Array_Lists.practice_exercises.pojo;

import java.util.ArrayList;

public class ArrayListSequence {
    private ArrayList<Integer> values;

    public ArrayListSequence() {
        values = new ArrayList<Integer>();
    }

    public void add(int n) {
        values.add(n);
    }

    /*
     * Problem E7.22
     * Difficulty: Easy
     *
     * TIME: 00:33:16
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    /**
     * This method creates a new sequence, appending this and the other sequence, without modifying either sequence.
     *
     * For example, if a is 1 4 9 16 and b is the sequence 9 7 4 9 11 then the call to a.append(b) returns the sequence
     * 1 4 9 16 9 7 4 9 11 without modifying a or b.
     *
     * @param other - the other sequence that will be joined to this sequence.
     *
     * @return a sequence consisting of this and other.
     *
     */
    public ArrayListSequence append(ArrayListSequence other) {

        ArrayListSequence appendedSeq = new ArrayListSequence();

        String a = this.toString();
        String b = other.toString();

        Integer[] arrayA = convertToArray(a);
        Integer[] arrayB = convertToArray(b);

        append(appendedSeq, arrayA);
        append(appendedSeq, arrayB);

        return appendedSeq;
    }

    /*
     * Problem E7.23
     * Difficulty: Medium
     * 
     * TIME: 00:16:31
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    /**
     * This method merges two sequences, alternating elements from both sequences.
     *
     * For example, if a is 1 4 9 16 and b is 9 7 4 9 11 then a.merge(b) returns the sequence 1 9 4 7 9 4 16 9 11 without
     * modifying a or b.
     */
    public ArrayListSequence merge(ArrayListSequence other) {

        ArrayListSequence appendedSeq = new ArrayListSequence();
        Integer[] arrayA = convertToArray(this.toString());
        Integer[] arrayB = convertToArray(other.toString());

        int count = 0;
        while(count < arrayA.length && count < arrayB.length) {
            appendedSeq.add(arrayA[count]);
            appendedSeq.add(arrayB[count]);
            count++;
        }

        if(count < arrayA.length) {
            merge(appendedSeq, arrayA, count);
        }
        else {
            merge(appendedSeq, arrayB, count);
        }

        return appendedSeq;
    }

    /*
     * Problem E7.24
     * Difficulty: Medium
     *
     * TIME: 00:48:19
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    /**
     * This method merges two sorted sequences, producing a new sorted sequence. If a or b is not sorted, the longest prefixes of
     * a and b that are sorted are merged.
     * 
     * For example, if a is 1 4 9 16 and b is 4 7 9 9 11 then a.mergeSorted(b) returns the sequence 1 4 4 7 9 9 9 11 16.
     */
    public ArrayListSequence mergeSorted(ArrayListSequence other) {

        ArrayListSequence seq = new ArrayListSequence();
        Integer[] arrayA = convertToArray(this.toString());
        Integer[] arrayB = convertToArray(other.toString());
        int idxA = 0;
        int lengthA = getLastSortedPosition(arrayA);
        int idxB = 0;
        int lengthB = getLastSortedPosition(arrayB);

        while(idxA < lengthA || idxB < lengthB) {
            if(idxA < lengthA && idxB < lengthB) {
                if(arrayA[idxA] <= arrayB[idxB]) {
                    seq.add(arrayA[idxA++]);
                }
                else {
                    seq.add(arrayB[idxB++]);
                }
            }
            else if(idxA < lengthA) {
                seq.add(arrayA[idxA++]);
            }
            else if(idxB < lengthB) {
                seq.add(arrayB[idxB++]);
            }
        }
        return seq;
    }

    public String toString() {
        return values.toString();
    }

    private void append(ArrayListSequence dest, Integer[] src) {

        for(Integer element : src) {
            dest.add(element);
        }
    }

    private Integer[] convertToArray(String str) {
        str = str.replaceAll("\\[|\\]", "");
        String[] arr = str.split(",");
        Integer[] numArray = new Integer[arr.length];

        for(int i = 0; i < arr.length; i++) {
            numArray[i] = Integer.valueOf(arr[i].trim());
        }

        return numArray;
    }

    private int getLastSortedPosition(Integer[] arr) {
        int count = 1;
        int tmp = arr[0];
        boolean sorted = true;

        while(sorted) {
            if(count < arr.length && arr[count] >= tmp) {
                tmp = arr[count];
                count++;
            }
            else {
                sorted = false;
            }   
        }
        return count;
    }

    private void merge(ArrayListSequence dst, Integer[] src, int index) {
        while(index < src.length) {
            dst.add(src[index++]);
        }
    }
}