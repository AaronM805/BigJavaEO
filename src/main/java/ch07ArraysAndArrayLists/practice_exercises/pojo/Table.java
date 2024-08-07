package ch07ArraysAndArrayLists.practice_exercises.pojo;
import java.util.Arrays;

public class Table {
    private int[][] values;

    public Table(int rows, int columns) {
        values = new int[rows][columns];
    }

    public void set(int i, int j, int n) {
        values[i][j] = n;
    }

    /*
     * Problem 7.16
     * Difficulty: Medium
     *
     * TIME: 00:24:47
     * Time Complexity:
     * Space Complexity:
     */
    /**
     * This method computes the average of the neighbors of a table element in eight directions. If the element is located at the
     * boundary of the array, include only the neighbors that are in the table.
     *
     * For example, if row and column are both 0, there re only three neighbors.
     *
     * @param row - the row position
     * @param column - the column position
     *
     * @return the average of the neighbors of a table in eight directions of position row x column.
     */
    public double neighborAverage(int row, int column) {

        double sum = 0;

        // if(row == 0) {
        //  if(column)
        // }

        /*
        [i - 1][j - 1] [i - 1][j] [i - 1][j + 1]
        [i][j - 1]     [i][j]     [i][j + 1]
        [i + 1][j - 1] [i + 1][j] [i + 1][j + 1]
        */

        return sum / values.length;
    }

    /*
     * Problem: 7.17
     * Difficulty: Medium
     *
     * TIME: 00:24:47
     * Time Complexity:
     * Space Complexity:
     */
    /**
     * This method returns the sum of the ith row (if horizontal is true) or column (if horizontal is false).
     *
     * @param i - the row or column to add.
     * @param horizontal - sums the row if true, column otherwise.
     *
     * @return the sum of row or column i.
     */
    public double sum(int i, boolean horizontal) {
        double sum = 0;

        if(horizontal) {
            int row = i - 1;
            for(int col = 0; col < values[row].length; col++) {
                sum += values[row][col];
            }
        }
        else {
            int col = i - 1;
            for(int row = 0; row < values.length; row++) {
                sum += values[row][col];
            }
        }

        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("[").append("\n");
        for(int i = 0; i < values.length; i++) {
            sb.append(Arrays.toString(values[i])).append("\n");
        }
        sb.append("]");

        return sb.toString();
    }
}