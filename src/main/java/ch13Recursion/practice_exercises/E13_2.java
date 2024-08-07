package ch13Recursion.practice_exercises;

public class E13_2 {
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Run 1");
        System.out.println("Area: " + square.getArea());
        System.out.println("Expected: 25");

        square = new Square(10);
        System.out.println("\nRun 2");
        System.out.println("Area: " + square.getArea());
        System.out.println("Expected: 100");

        square = new Square(7);
        System.out.println("\nRun 3");
        System.out.println("Area: " + square.getArea());
        System.out.println("Expected: 49");
    }
}


/**
 * Difficulty: Medium
 * 
 * Prompt:
 * Given a class Square with an instance variable width, provide a recursive getArea method. Construct a square whose width is
 * one less than the original and call its getArea method.
 * 
 * TIME:
 * Time Complexity:
 * Space Complexity:
 *
 * A square shape composed of stacked unit squares like this:
 * [][][]
 * [][][]
 * [][][]
 * ...
 */
class Square {
    private int width;
    
    /**
     * Constructs a square shape.
     * @param width the width (and height) of this square
     */
    public Square(int width) {
        this.width = width;
    }
    
    /**
     * Computes the area of this square.
     * @return the area
     */
    public int getArea() {

        return getArea(width);
        
    }

    private int getArea(int width) {
        if(width <= 0) {
            return 0;
        }
        else {
            return getArea(width - 1) + width + width - 1;
        }
    }
}