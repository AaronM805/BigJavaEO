package ch15_the_java_collections_framework.practice_exercises;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

/**
 * A homeowner rents out parking spaces in a driveway during special events. The driveway is a “last-in, first-out” stack. Of
 * course, when a car owner retrieves a vehicle that wasn’t the last one in, the cars blocking it must temporarily move to the
 * street so that the requested vehicle can leave. Write a program that models this behavior, using one stack for the driveway
 * and one stack for the street. Use integers as license plate numbers. Positive numbers add a car, negative numbers remove a
 * car, zero stops the simulation. Print out the stack after each operation is complete.
 *
 * Difficulty: Medium
 * 
 * TIME: 00:29:13
 */
public class E15_10 {
    public static void main(String[] args) {
        Parking parking = new Parking();
        Scanner input = new Scanner(System.in);
        int value = Integer.MAX_VALUE;
        do {
            try {
                value = input.nextInt();
                if (value < 0) {
                    parking.remove(Math.abs(value));
                }
                else if(value > 0) {
                    parking.add(value);
                }
            }
            catch (EmptyStackException ese) {
                System.out.println("The parking garage is empty.");
            }
            
        }while (value != 0);
        input.close();
    }
}

/**
 * This class models a parking space where cars are addede to a driveway, and temporarily moved to a street when removing a car
 * that wasn't the last one in.
 *
 * @author Aaron Martinez
 * @version 0.1
 */
class Parking {
    Stack<Integer> driveway;
    Stack<Integer> street;

    /**
     * Constructs an empty parking lot.
     */
    public Parking() {
        driveway = new Stack<>();
        street = new Stack<>();
    }

    /**
     * Adds the car with given licence plate to the driveway.
     *
     * @param licencePlate the car with given licence plate is added to the driveway
     *
     * Time Complexity: O(1)
     * Space Complexity: O(1)
     */
    public void add(int licencePlate) {
        driveway.add(licencePlate);
        System.out.println(driveway);
        System.out.println(street);
    }

    /**
     * Removes the car with the given licence plate from the driveway. If it is not the first one in the driveway, it will
     * move other cars to the street temporarily.
     *
     * @param licencePlate the car with the given licence plate to remove
     * @return the car with the given licence plate number
     * @throws EmptyStackException if the stack is empty
     *
     * Time Complexity: O(N + M); N size of driveway, M size of street
     * Space Complexity: O(1); no additional space is used aside from what is already defined
     */
    public int remove(int licencePlate) {
        if (driveway.empty()) {
            throw new EmptyStackException();
        }

        while (driveway.peek() != licencePlate) {
            street.push(driveway.pop());
        }

        int car = driveway.pop();
        System.out.println(driveway);
        System.out.println(street);

        while(!street.empty()) {
            driveway.push(street.pop());
        }

        System.out.println(driveway);
        System.out.println(street);

        return car;
    }
}