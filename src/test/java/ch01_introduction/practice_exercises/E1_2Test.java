package ch01_introduction.practice_exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch01_introduction.pracitice_exercises.E1_2;

public class E1_2Test {
	
	@Test
	public void testSumOfFirstTenPositiveIntegers() {
		E1_2 sum = new E1_2();
		
		assertEquals(55, sum.sum());
	}
}
