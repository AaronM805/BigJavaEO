package ch13_recursion.practice_exercises;

public class E13_1 {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(3, 4);
        System.out.println("Run 1");
        System.out.println("getArea(): " + rec.getArea());
        System.out.println("getArea2(): " + rec.getArea2());
        System.out.println("Expected: 12");
        
        rec = new Rectangle(3, 10);
        System.out.println("\nRun 2");
        System.out.println("getArea(): " + rec.getArea());
        System.out.println("getArea2(): " + rec.getArea2());
        System.out.println("Expected: 30");
    }
}

/**
 * Difficulty: Easy
 * 
 * Prompt:
 * Given a class Rectangle with instance variables width and height, provide a recursive getArea method. Construct a rectangle
 * whose width is one less than the original and call its getArea method.
 * 
 * TIME:
 * Time Complexity:
 * Space Complexity:
 */
class Rectangle {
    private final int width;
    private final int height;

    public Rectangle(final int width, final int height) {
        this.width = width;
        this.height = height;
    }

    /*
    INPUTS - No method parameters but instance variables are width and height.
    
    DESIRED OUTPUT - Rectangle area
    
    EXAMPLE
        Width = 4
        Height = 3
        
        [][][][]
        [][][][]
        [][][][]
        
        getArea() = 12
    
    Break down the problem into smaller tasks
        Consider various ways to simplify inputs
        
        [][][] []     [][] [][]    [] [][][]
        [][][] []                  
                        [][][][]     [][][][]
        [][][] []     [][][][]     [][][][]
        
        
        Combine solutions with simpler inputs into a solution of the original problem
        
            If size == 1
                Return 1
            Else
                getArea(width - 1, height - 1) + width + height - 1 
        
        Find solutions to the simplest inputs
        
            If dimension == 1
                Return 1
        
        Implement the solution by combining the simple cases and the reduction step
            If dimension == 1
                Return 1
            Else
                getArea(width - 1, height - 1) + width + height - 1
            
    
    TEST
    
        Width = 3, height = 4
        
        getArea(3)               getArea(4)
        getArea(2)               getArea(3)
        getArea(1) return 1      getArea(2)
                                    getArea(1) return 1
    
        This may work but need to understand how to test
    Turn the pseudocode into Java statements
    
    Provide input and output
    */
    /**
     * This method calculates the area of this rectangle recursively.
     *
     * @return area of this rectangle.
     */
    public int getArea() {
        if(width <= 0 || height <= 0) {
            return 0;
        }
        else {

            Rectangle smallerRectangle = new Rectangle(width - 1, height - 1);
            int smallerArea = smallerRectangle.getArea();

            return smallerArea + width + height - 1;
        }
    }

    /**
     * This method calculates the area of this rectangle recursively.
     *
     * @return area of this rectangle.
     */
    public int getArea2() {
        return getArea(width, height);
    }

    private int getArea(int width, int height) {
        if(width <= 0 || height <= 0) {
            return 0;
        }
        else {
            return getArea(width - 1, height - 1) + width + height - 1 ;
        }
    }
}