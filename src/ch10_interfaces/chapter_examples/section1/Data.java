package ch10_interfaces.chapter_examples.section1;

public class Data {
    /**
     * Computes the average of the measures of the given objects.
     *
     * @param objects an array of Measurable objects
     *
     * @return the average of the measures
     */
    public static double average(Measurable[] objects) {
        double sum = 0;

        for(Measurable ob : objects) {
            sum += ob.getMeasure();
        }

        return objects.length > 0 ? sum / objects.length : 0;
    }
}