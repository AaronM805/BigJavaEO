package ch01Introduction.practiceExercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class E1_7Test {

  @Test
  public void testNameAsMorseCode() {
    E1_7 e1_7 = new E1_7();

    String expected = ".- .- .-. --- -.";

    assertEquals(expected, e1_7.nameAsMorseCode("Aaron"));
  }
}
