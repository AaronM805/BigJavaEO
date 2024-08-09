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

    assertEquals(expected, E1_5.printNameInsideBox());
  }
}
