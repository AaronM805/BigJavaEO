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
  public static void greetings() throws MalformedURLException {
    // TODO - need to use a correct image
    URL imageLocation = new URL("https://www.dropbox.com/scl/fi/d0wthx90va83grxcu9vq3/CA19-20240415131812a.jpg");
    JOptionPane.showMessageDialog(null, "Buenas Tardes", "Saludos", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
  }
}