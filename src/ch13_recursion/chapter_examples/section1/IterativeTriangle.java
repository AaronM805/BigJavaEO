package ch13_recursion.chapter_examples.section1;

public class IterativeTriangle {
    private int width;
    
    /**
     * Constructs a triangular shape.
     * @param width the width (and height) of the triangle
     */
    public IterativeTriangle(int width) {
        this.width = width;
    }
    
    /**
     * Computes the area of the triangle.
     * @return the area
     */
    public int getArea() {

        int area = 0;
        for(int i = 1; i <= width; i++) {
            area += i;
        }
        return area;
        //return (width * (width + 1) / 2);
    }
}