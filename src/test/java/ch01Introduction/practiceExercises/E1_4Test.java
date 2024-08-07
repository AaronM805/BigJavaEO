package ch01Introduction.practiceExercises;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class E1_4Test {
	
	private E1_4 account;
	
	@Before
	public void init() {
		account = new E1_4();
	}
	@Test
	public void testInitialBalance() {
		assertEquals(1000.0, account.balance(), 0);
	}
	
	@Test
	public void testInterestRate() {
		assertEquals(.05, account.interestRate(), 0);
	}
	
	@Test
	public void testBalanceAfterFirstYear() {
		account.applyInterest();
		assertEquals(1_050.0, account.balance(), 0);
	}
	
	@Test
	public void testBalanceAfterSecondYear() {
		account.applyInterest();
		account.applyInterest();
		assertEquals(1_102.5, account.balance(), 0);
	}
	
	@Test
	public void testBalanceAfterThirdYear() {
		account.applyInterest();
		account.applyInterest();
		account.applyInterest();
		assertEquals(1_157.62, account.balance(), 0.01);
	}
}
