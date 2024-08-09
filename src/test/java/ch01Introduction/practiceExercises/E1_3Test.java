package ch01Introduction.practiceExercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class E1_3Test {
	
	@Test
	public void testProductOfFirstTenPositiveIntegers() {
		assertEquals(3_628_800, E1_3.product());
	}
}
