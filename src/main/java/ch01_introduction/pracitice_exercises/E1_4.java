package ch01_introduction.pracitice_exercises;

public class E1_4 {
	private double balance;
	private double interestRate;
	
	public E1_4() {
		balance = 1000;
		interestRate = 0.05;
	}
	
	public void applyInterest() {
		balance *= (1 + interestRate);
	}
	public double balance() {
		return balance;
	}

	public double interestRate() {
		return interestRate;
	}
}
