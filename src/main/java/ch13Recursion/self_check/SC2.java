package ch13Recursion.self_check;

public class SC2 {
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

        if(width <= 0) {
            return 0;
        }
        else {
            Square smallerTriangle = new Square(width - 1);
            int smallerArea = smallerTriangle.getArea();
            return smallerArea + width + width - 1;
        }
    }
}