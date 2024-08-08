package ch01Introduction.practiceExercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class E1_5Test {

  @Test
  public void testNameDisplay() {

    String expected = "+----------------+" +
      "\n" +
      "| Aaron Martinez |" +
      "\n" +
      "+----------------+";
    E1_5 nameDisplay = new E1_5();
    assertEquals(expected, nameDisplay.displayNameInsideBox());
  }
}
