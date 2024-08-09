package ch01Introduction.practiceExercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class E1_2Test {
	
	@Test
	public void testSumOfFirstTenPositiveIntegers() {
		assertEquals(55, E1_2.sum());
	}
}
