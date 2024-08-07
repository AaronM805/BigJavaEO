package ch07ArraysAndArrayLists.practice_exercises;
import java.util.Arrays;

public class E7_4 {
    public static void main(String[] args) {

        Student aaron = new Student(10);

        aaron.addScore(8);
        aaron.addScore(2);
        aaron.addScore(10);
        aaron.addScore(9);
        aaron.addScore(6);
        aaron.addScore(5);

        System.out.println(aaron.toString());
        aaron.removeMin();
        System.out.println(aaron.toString());
    }
}

class Student {
    private double[] scores;
    private int scoresSize;

    public Student(int capacity) {
        scores = new double[capacity];
        scoresSize = 0;
    }

    public boolean addScore(double score) {
        if (scoresSize < scores.length) {
            scores[scoresSize] = score;
            scoresSize++;
            return true;
        } else
            return false;
    }

    public int minimumPosition() {
        if (scoresSize == 0) {
            return -1;
        }

        int smallestPosition = 0;
        for (int i = 1; i < scoresSize; i++) {
            if (scores[i] < scores[smallestPosition])
                smallestPosition = i;
        }
        return smallestPosition;
    }

    public double sum() {
        double total = 0;
        for (int i = 0; i < scoresSize; i++) {
            total = total + scores[i];
        }
        return total;
    }

    public void removeMin() {
        /*
         * 1. Determine inputs/outputs Input: scores array Output: scores array minus
         * min value removed
         * 
         * 2. Break down problem into smaller tasks Iterate through scores to find index
         * at min element Starting at min element, shift remaining values to the left
         * 
         * 3. Describe each subtask in pseudocode minPos = 0 For each element in scores
         * If element less than element at minPos minPos = index Set element at minPos
         * to be the last element in array Decremnt size
         * 
         * Time complexity: O(N) Space complexity: O(1)
         * 
         * 4. Test pseudocode by working problem Scores = {8, 2, 10, 9, 6, 5} minPos = 1
         * 
         */
        int minPos = 0;

        for (int idx = 1; idx < scoresSize; idx++) {
            if (scores[idx] < scores[minPos])
                minPos = idx;
        }

        scores[minPos] = scores[scoresSize - 1];
        scoresSize--;

    }

    public void removeScore(int pos) {
        scores[pos] = scores[scoresSize - 1];
        scoresSize--;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "Student [scores=" + Arrays.toString(scores) + ", scoresSize=" + scoresSize + "]";
    }
}
