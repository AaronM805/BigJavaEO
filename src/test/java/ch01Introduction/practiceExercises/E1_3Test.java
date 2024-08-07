package ch01Introduction.practiceExercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class E1_3Test {
	
	@Test
	public void testProductOfFirstTenPositiveIntegers() {
		E1_3 product = new E1_3();
		
		assertEquals(3_628_800, product.product());
	}
}
