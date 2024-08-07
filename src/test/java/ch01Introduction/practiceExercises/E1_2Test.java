package ch01Introduction.practiceExercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class E1_2Test {
	
	@Test
	public void testSumOfFirstTenPositiveIntegers() {
		E1_2 sum = new E1_2();
		
		assertEquals(55, sum.sum());
	}
}
