package ch01Introduction.practiceExercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class E1_7Test {

  @Test
  public void testNameAsMorseCode() {
    String expected = ".- .- .-. --- -.";

    assertEquals(expected, E1_7.nameAsMorseCode("Aaron"));
  }
}
