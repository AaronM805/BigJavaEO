package ch13_recursion.chapter_examples.section1;

/**
     * A triangle shape composed of stacked unit squares like this:
     * []
     * [][]
     * [][][]
     * ...
     */
public class RecursiveTriangle {
    private int width;
    
    /**
     * Constructs a triangular shape.
     * @param width the width (and height) of the triangle
     */
    public RecursiveTriangle(int width) {
        this.width = width;
    }
    
    /**
     * Computes the area of the triangle.
     * @return the area
     */
    public int getArea() {

        if(width <= 0) {
            return 0;
        }
        else if(width == 1) {
            return 1;
        }
        else {
            RecursiveTriangle smallerTriangle = new RecursiveTriangle(width - 1);
            int smallerArea = smallerTriangle.getArea();
            return smallerArea + width;
        }
    }
}