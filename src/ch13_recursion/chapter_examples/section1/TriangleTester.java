package ch13_recursion.chapter_examples.section1;

public class TriangleTester {
    public static void main(String[] args) {
        System.out.println("Run 1:");
        RecursiveTriangle rt = new RecursiveTriangle(10);
        IterativeTriangle ir = new IterativeTriangle(10);
        
        long start = System.currentTimeMillis();
        int rArea = rt.getArea();
        System.out.println("Recursive elapsed time: " + (System.currentTimeMillis() - start) + " ms");

        start = System.currentTimeMillis();
        int iArea = ir.getArea();
        System.out.println("Iterative elapsed time: " + (System.currentTimeMillis() - start) + " ms");

        System.out.println("Recursive Area: " + rArea);
        System.out.println("Iterative Area: " + iArea);
        System.out.println("Expected: 55");

        System.out.println("\n\nRun 2:");

        rt = new RecursiveTriangle(1_000);
        ir = new IterativeTriangle(1_000);

        start = System.currentTimeMillis();
        rArea = rt.getArea();
        System.out.println("Recursive elapsed time: " + (System.currentTimeMillis() - start) + " ms");
        
        start = System.currentTimeMillis();
        iArea = ir.getArea();
        System.out.println("Iterative elapsed time: " + (System.currentTimeMillis() - start) + " ms");

        System.out.println("Recursive Area: " + rArea);
        System.out.println("Iterative Area: " + iArea);

        System.out.println("\n\nRun 3:");

        rt = new RecursiveTriangle(5_000);
        ir = new IterativeTriangle(5_000);

        start = System.currentTimeMillis();
        rArea = rt.getArea();
        System.out.println("Recursive elapsed time: " + (System.currentTimeMillis() - start) + " ms");
        
        start = System.currentTimeMillis();
        iArea = ir.getArea();
        System.out.println("Iterative elapsed time: " + (System.currentTimeMillis() - start) + " ms");

        System.out.println("Recursive Area: " + rArea);
        System.out.println("Iterative Area: " + iArea);

        System.out.println("\n\nRun 4:");

        rt = new RecursiveTriangle(7_000);
        ir = new IterativeTriangle(7_000);

        start = System.currentTimeMillis();
        rArea = rt.getArea();
        System.out.println("Recursive elapsed time: " + (System.currentTimeMillis() - start) + " ms");
        
        start = System.currentTimeMillis();
        iArea = ir.getArea();
        System.out.println("Iterative elapsed time: " + (System.currentTimeMillis() - start) + " ms");

        System.out.println("Recursive Area: " + rArea);
        System.out.println("Iterative Area: " + iArea);

        System.out.println("\n\nRun 5:");

        rt = new RecursiveTriangle(8_000);
        ir = new IterativeTriangle(8_000);

        start = System.currentTimeMillis();
        rArea = rt.getArea();
        System.out.println("Recursive elapsed time: " + (System.currentTimeMillis() - start) + " ms");
        
        start = System.currentTimeMillis();
        iArea = ir.getArea();
        System.out.println("Iterative elapsed time: " + (System.currentTimeMillis() - start) + " ms");

        System.out.println("Recursive Area: " + rArea);
        System.out.println("Iterative Area: " + iArea);
    }
}