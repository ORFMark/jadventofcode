package com.adventofcode.utilities.general.parsers;

import com.adventofcode.utilities.general.parsers.numerics.DoubleInputParser;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DoubleInputParserTest {

  @Test
  void testNullString() {
    DoubleInputParser testParser = new DoubleInputParser();
    assertThrows(NullPointerException.class, () -> testParser.splitInputIntoElements(null));
  }

  @Test
  void testEmptyString() {
    DoubleInputParser testParser = new DoubleInputParser();
    List<Double> testList = testParser.splitInputIntoElements("");
    assertTrue(testList.isEmpty());
  }

  @Test
  void testInvalidString() {
    DoubleInputParser testParser = new DoubleInputParser();
    assertThrows(IllegalArgumentException.class, () -> testParser.splitInputIntoElements("hello"));
  }

  @Test
  void testOneElementString() {
    String expectedInput = "1";
    DoubleInputParser testParser = new DoubleInputParser();
    List<Double> testList = testParser.splitInputIntoElements(expectedInput);
    assertFalse(testList.isEmpty());
    assertEquals(1, testList.size());
    assertEquals(1.0, testList.get(0));
  }

  @Test
  void testOneElementStringWithNewLine() {
    String expectedInput = "1\n";
    DoubleInputParser testParser = new DoubleInputParser();
    List<Double> testList = testParser.splitInputIntoElements(expectedInput);
    assertFalse(testList.isEmpty());
    assertEquals(1.0, testList.size());
    assertEquals(1.0, testList.get(0));
  }

  @Test
  void testMultiElementString() {
    String expectedInput = "1\n2.5";
    DoubleInputParser testParser = new DoubleInputParser();
    List<Double> testList = testParser.splitInputIntoElements(expectedInput);
    assertFalse(testList.isEmpty());
    assertEquals(2, testList.size());
    assertEquals(1.0, testList.get(0));
    assertEquals(2.5, testList.get(1));
  }
}