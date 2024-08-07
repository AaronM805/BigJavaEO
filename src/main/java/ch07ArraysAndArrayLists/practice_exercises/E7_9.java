package ch07ArraysAndArrayLists.practice_exercises;

public class E7_9 {
    public static void main(String[] args) {
        DataSet set = new DataSet(10);

        set.add(3);
        set.add(9);
        set.add(8);
        set.add(6);

        System.out.println("Run 1");
        System.out.println("Sum: " + set.sum());
        System.out.println("Expected: " + 26);
        System.out.println("Average: " + set.average());
        System.out.println("Expected: " + 6.5);
        System.out.println("Maximum: " + set.maximum());
        System.out.println("Expected: " + 9);
        System.out.println("Minimum: " + set.minimum());
        System.out.println("Expected: " + 3);

        set.add(10);
        set.add(13);
        set.add(16);
        set.add(7);

        System.out.println("\n\nRun 2");
        System.out.println("Sum: " + set.sum());
        System.out.println("Expected: " + 72);
        System.out.println("Average: " + set.average());
        System.out.println("Expected: " + 9);
        System.out.println("Maximum: " + set.maximum());
        System.out.println("Expected: " + 16);
        System.out.println("Minimum: " + set.minimum());
        System.out.println("Expected: " + 3);

        set.add(-1);
        set.add(909);
        set.add(79);

        System.out.println("\n\nRun 3");
        System.out.println("Sum: " + set.sum());
        System.out.println("Expected: " + 980);
        System.out.println("Average: " + set.average());
        System.out.println("Expected: " + 98);
        System.out.println("Maximum: " + set.maximum());
        System.out.println("Expected: " + 909);
        System.out.println("Minimum: " + set.minimum());
        System.out.println("Expected: " + -1);
    }

}

class DataSet {
    private int size;
    private double[] values;
    
    public DataSet(int maximumNumberOfValues) {
        values = new double[maximumNumberOfValues];
        size = 0;
    }
    
    /**
     * adds value to array.
     *
     * @param value the value to add
     */
    public void add(double value) {
        if(size < values.length) {
            values[size] = value;
            size++;
        }
    }
    
    /**
     * This method adds the elements in array.
     *
     * @return the sum of all elements in array.
     */
    public double sum() {
        double sum = 0.0;
        for(int idx = 0; idx < size; idx++) {
            sum += values[idx];
        }
        
        return sum;
    }
    
    /**
     * This method calculates the average of the elements in array.
     *
     * @return the average of all elements in values.
     */
    public double average() {
        return sum() / size;
    }
    
    /**
     * This method returns the maximum element in array
     *
     * @return the maximum element in array.
     */
    public double maximum() {
        double largest = values[0];
        for(int idx = 1; idx < size; idx++) {
            if(values[idx] > largest)
                largest = values[idx];
        }
        return largest;
    }
    
    /**
     * This method returns the minimum element in array
     *
     * @return the minimum element in array.
     */
    public double minimum() {
        double smallest = values[0];
        for(int idx = 1; idx < size; idx++) {
            if(values[idx] < smallest)
                smallest = values[idx];
        }
        return smallest;
    }
}