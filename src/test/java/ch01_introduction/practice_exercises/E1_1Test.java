package ch01_introduction.practice_exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ch01_introduction.pracitice_exercises.E1_1;

public class E1_1Test {
	
	@Test
	public void testGreeting() {
		E1_1 greet = new E1_1();
		
		assertEquals("Hola Aaron!", greet.greet());
	}
}
