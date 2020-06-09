package ch7_Arrays_and_Array_Lists.review_exercises;

public class R7_29 {

    private static int ROWS = 10;
    private static int COLUMNS = 10;
    public static void main(String[] args) {
        
        int[][] values = new int[ROWS][COLUMNS];

        // fill all entries with 0
        System.out.println("Fill all entries with 0");
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLUMNS; j++) {
                values[i][j] = 0;
            }
        }

        printArray(values);

        // fill elements alternatively with 0s and 1s in a checkerboard pattern
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLUMNS; j++) {
                values[i][j] = i % 2 | j % 2;
            }
        }

        printArray(values);

        // fill only the elements in the top and bottom rows with zeroes
        for(int i = 0; i < ROWS; i += (ROWS - 1)) {
            for(int j = 0; j < COLUMNS; j++) {
                values[i][j] = 0;
            }
        }

        printArray(values);


    }

    private static void printArray(int[][] values) {
        // print the array in tabular form
        for(int i = 0; i < ROWS; i++) {
            for(int j = 0; j < COLUMNS; j++) {
                System.out.printf("%5d", values[i][j]);
            }
            System.out.println();
        }
    }
}