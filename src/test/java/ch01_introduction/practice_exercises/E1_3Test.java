package ch01_introduction.practice_exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch01_introduction.pracitice_exercises.E1_3;

public class E1_3Test {
	
	@Test
	public void testProductOfFirstTenPositiveIntegers() {
		E1_3 product = new E1_3();
		
		assertEquals(3_628_800, product.product());
	}
}
