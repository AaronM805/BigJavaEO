package ch01Introduction.practiceExercises;

import javax.swing.JOptionPane;

/**
 * Modify the below program so it to print “Hello, name!”,
 * displaying the name that the user typed in.
 *
 * Difficulty: medium
 * Actual: easy
 */
public class E1_16 {
  public static void greetings() {
    String name = JOptionPane.showInputDialog("What is your name?");
    System.out.println("Hello, " + name + "!");
  }
}
