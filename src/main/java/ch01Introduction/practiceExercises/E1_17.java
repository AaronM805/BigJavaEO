package ch01Introduction.practiceExercises;

import javax.swing.JOptionPane;

/**
 * Modify the program from Exercise E1.16 so that the dialog continues with the
 * message “My name is Hal! What would you like me to do?” Discard the user’s input
 * and display a message such as
 * I'm sorry, Dave. I'm afraid I can't do that.
 * Replace Dave with the name that was provided by the user.
 *
 * Difficulty: hard
 * actual: easy
 */
public class E1_17 {
  public static void greetingsFromHal() {
    String name = JOptionPane.showInputDialog("What is your name?");
    JOptionPane.showInputDialog("My name is Hal! What would you like me to do?");
    System.out.println("I'm sorry, " + name + ". I'm afraid I can't do that.");
  }
}
