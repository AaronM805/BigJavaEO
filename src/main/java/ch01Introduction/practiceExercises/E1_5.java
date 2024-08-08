package ch01Introduction.practiceExercises;

/**
 * Write a program that displays your name inside a box on the screen, like this: Dave
 * Do your best to approximate lines with characters such as | - +.
 *
 * Difficulty: easy
 */
public class E1_5 {
  public String displayNameInsideBox() {
    String displayName = "+----------------+" +
      "\n" +
      "| Aaron Martinez |" +
      "\n" +
      "+----------------+";
    System.out.print(displayName);
    return displayName;
  }
}
