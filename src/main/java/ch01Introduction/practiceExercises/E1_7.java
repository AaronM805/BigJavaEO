package ch01Introduction.practiceExercises;

import java.util.HashMap;
import java.util.Map;

/**
 * Write a program that prints your name in Morse code, like this:
 * .... .- .-. .-. -.--
 * Use a separate call to System.out.print for each letter.
 *
 * Difficulty: medium
 */
public class E1_7 {
  private static final Map<Character, String> MORSE_CODE_MAP;

  static {
    MORSE_CODE_MAP = new HashMap<>();
    MORSE_CODE_MAP.put('A', ".-");
    MORSE_CODE_MAP.put('B', "-...");
    MORSE_CODE_MAP.put('C', "-.-.");
    MORSE_CODE_MAP.put('D', "-..");
    MORSE_CODE_MAP.put('E', ".");
    MORSE_CODE_MAP.put('F', "..-.");
    MORSE_CODE_MAP.put('G', "--.");
    MORSE_CODE_MAP.put('H', "....");
    MORSE_CODE_MAP.put('I', "..");
    MORSE_CODE_MAP.put('J', ".---");
    MORSE_CODE_MAP.put('K', "-.-");
    MORSE_CODE_MAP.put('L', ".-..");
    MORSE_CODE_MAP.put('M', "--");
    MORSE_CODE_MAP.put('N', "-.");
    MORSE_CODE_MAP.put('O', "---");
    MORSE_CODE_MAP.put('P', ".--.");
    MORSE_CODE_MAP.put('Q', "--.-");
    MORSE_CODE_MAP.put('R', ".-.");
    MORSE_CODE_MAP.put('S', "...");
    MORSE_CODE_MAP.put('T', "-");
    MORSE_CODE_MAP.put('U', "..-");
    MORSE_CODE_MAP.put('V', "...-");
    MORSE_CODE_MAP.put('W', ".--");
    MORSE_CODE_MAP.put('X', "-..-");
    MORSE_CODE_MAP.put('Y', "-.--");
    MORSE_CODE_MAP.put('Z', "--..");
  }

  public String nameAsMorseCode(String name) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < name.length(); i++) {
      String upperCaseName = name.toUpperCase();
      String morse = MORSE_CODE_MAP.get(upperCaseName.charAt(i));
      sb.append(morse);
      sb.append(" ");
      System.out.print(morse  + " ");
    }

    return sb.toString().trim();
  }
}
