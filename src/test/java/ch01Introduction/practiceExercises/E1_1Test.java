package ch01Introduction.practiceExercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class E1_1Test {
	
	@Test
	public void testGreeting() {
		assertEquals("Hola Aaron!", E1_1.greet());
	}
}
