package com.adventofcode.utilities.general.parsers.text;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RawStringInputParserTest {

  @Test
  void testNullString() {
    RawStringInputParser testParser = new RawStringInputParser();
    assertThrows(NullPointerException.class, () -> testParser.splitInputIntoElements(null));
  }

  @Test
  void testEmptyString() {
    RawStringInputParser testParser = new RawStringInputParser();
    List<String> testList = testParser.splitInputIntoElements("");
    assertTrue(testList.isEmpty());
  }

  @Test
  void testOneElementString() {
    String expectedInput = "hello!";
    RawStringInputParser testParser = new RawStringInputParser();
    List<String> testList = testParser.splitInputIntoElements(expectedInput);
    assertFalse(testList.isEmpty());
    assertEquals(1, testList.size());
    assertEquals(expectedInput, testList.get(0));
  }

  @Test
  void testOneElementStringWithNewLine() {
    String expectedInput = "hello!\n";
    RawStringInputParser testParser = new RawStringInputParser();
    List<String> testList = testParser.splitInputIntoElements(expectedInput);
    assertFalse(testList.isEmpty());
    assertEquals(1, testList.size());
    assertEquals("hello!", testList.get(0));
  }

  @Test
  void testMultiElementString() {
    String expectedInput = " hello!\nGoodBye!";
    RawStringInputParser testParser = new RawStringInputParser();
    List<String> testList = testParser.splitInputIntoElements(expectedInput);
    assertFalse(testList.isEmpty());
    assertEquals(2, testList.size());
    assertEquals(" hello!", testList.get(0));
    assertEquals("GoodBye!", testList.get(1));
  }

  @Test
  void testMultiElementStringWithCommaDeliminator() {
    String expectedInput = " hello! ,GoodBye!";
    RawStringInputParser testParser = new RawStringInputParser();
    List<String> testList = testParser.splitInputIntoElements(expectedInput, ",");
    assertFalse(testList.isEmpty());
    assertEquals(2, testList.size());
    assertEquals(" hello! ", testList.get(0));
    assertEquals("GoodBye!", testList.get(1));
  }
}