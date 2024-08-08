package ch01Introduction.practiceExercises;

/**
 * Write a program that prints the balance of an account after the first, second, and
 * third year. The account has an initial balance of $1,000 and earns 5 percent interest
 * per year.
 *
 * Difficulty: medium
 */
public class E1_4 {
	private double balance;
	private static final double INTEREST_RATE = 0.05;
	
	public E1_4() {
		balance = 1000;
	}
	
	public void applyInterest() {
		balance *= (1 + INTEREST_RATE);
	}
	public double balance() {
		return balance;
	}

	public double interestRate() {
		return INTEREST_RATE;
	}
}
