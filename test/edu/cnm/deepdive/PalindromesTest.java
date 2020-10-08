package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PalindromesTest {

  static final String[] inputValues = {
      "radar",
      "sonar",
      "abba",
      "abb",
      "x",
      ""
  };

  static final boolean[] expectedValues = {
      true,
      false,
      true,
      false,
      true,
      true
  };

  @Test
  private void testRecursive() {
    for (int i = 0; i < inputValues.length; i++) {
      String input = inputValues[i];
      boolean expected = expectedValues[i];
      boolean actual = Palindromes.testRecursive(input);
      assertEquals(expected, actual);
    }
  }
}
