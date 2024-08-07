package ch13Recursion.review_exercises;

public class R13_9 {
	public static void main(String[] args) {
		System.out.println(Fibonacci.fibCount);
		System.out.println("fib(5) = " + Fibonacci.fib(5));
		System.out.println(Fibonacci.fibCount);
		Fibonacci.fibCount = 0;

		System.out.println(Fibonacci.fibCount);
		System.out.println("fib(8) = " + Fibonacci.fib(8));
		System.out.println(Fibonacci.fibCount);
		Fibonacci.fibCount = 0;

		System.out.println(Fibonacci.fibCount);
		System.out.println("fib(10) = " + Fibonacci.fib(10));
		System.out.println(Fibonacci.fibCount);
		Fibonacci.fibCount = 0;

		System.out.println(Fibonacci.fibCount);
		System.out.println("fib(12) = " + Fibonacci.fib(12));
		System.out.println(Fibonacci.fibCount);
		Fibonacci.fibCount = 0;
		
		System.out.println(Fibonacci.fibCount);
		System.out.println("fib(15) = " + Fibonacci.fib(15));
		System.out.println(Fibonacci.fibCount);
	}
}

class Fibonacci {

	public static int fibCount = 0;
	/**
     * Computes a Fibonacci number.
     * @param n an integer
     * @return the nth Fibonacci number
     */
    public static long fib(int n) {
    	fibCount++;
        if(n <= 2) {
            return 1;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}