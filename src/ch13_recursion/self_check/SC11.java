package ch13_recursion.self_check;

public class SC11 {

    public static void main(String[] args) {
        int value = 4;
        System.out.println("Recursive: " + recursiveFactorial(value));
        System.out.println("Iterative: " + iterativeFactorial(value));
        System.out.println("Expected: 24");

        value = 10;
        System.out.println("Recursive: " + recursiveFactorial(value));
        System.out.println("Iterative: " + iterativeFactorial(value));
        System.out.println("Expected: 3628800");

        value = 13;
        System.out.println("Recursive: " + recursiveFactorial(value));
        System.out.println("Iterative: " + iterativeFactorial(value));
        System.out.println("Expected: 3628800");

        value = 15;
        System.out.println("Recursive: " + recursiveFactorial(value));
        System.out.println("Iterative: " + iterativeFactorial(value));
        System.out.println("Expected: 3628800");
    }

    public static long recursiveFactorial(int factorial){
		
		if(factorial == 1) {
			return 1;
		}
		else {
			return recursiveFactorial(factorial - 1) * factorial;
		}
	}
	
	public static long iterativeFactorial(int factorial) {
		
		int result = 1;
		for(int idx = 1; idx <= factorial; idx++) {
			result *= idx;
		}
		return result;
    }
}