package ch10_interfaces.chapter_examples.section1;

/**
 * This program demonstrates the measurable BankAccount and Country classes.
 */
public class MeasurableTester {
    public static void main(String[] args) {
        // Calling the average method with an array of BankAccount objectas
        Measurable[] accounts = new Measurable[3];
        
        accounts[0] = new BankAccount(0);
        accounts[1] = new BankAccount(10_000);
        accounts[2] = new BankAccount(2000);

        double averageBalance = Data.average(accounts);
        System.out.println("Average balance " + averageBalance);
        System.out.println("Expected: 4000");

        // Calling the average method with an array of Country objects
        Measurable[] countries = new Measurable[3];

        countries[0] = new Country("Uruguay", 176_220);
        countries[1] = new Country("Thailand", 513_120);
        countries[2] = new Country("Belgium", 30_510);

        double averageArea = Data.average(countries);
        System.out.println("Average area " + averageArea);
        System.out.println("Expected: 239950");
    }
}