package ch01Introduction.practiceExercises;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Modify the program below to show a different greeting and image.
 *
 * Difficulty: medium
 */
public class E1_18 {
  public static void main(String[] args) throws MalformedURLException {
    URL imageLocation = new URL("http://horstmann.com/java4everyone.duke.gif");
    JOptionPane.showMessageDialog(null, "Hello", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
  }
}
