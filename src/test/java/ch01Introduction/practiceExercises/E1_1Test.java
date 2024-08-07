package ch01Introduction.practiceExercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class E1_1Test {
	
	@Test
	public void testGreeting() {
		E1_1 greet = new E1_1();
		
		assertEquals("Hola Aaron!", greet.greet());
	}
}
