package com.adventofcode.problems.twentytwo.day9;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RopeMotionParserTest {

  private static String EXAMPLE_INPUT = "R 4\n" +
          "U 4\n" +
          "L 3\n" +
          "D 1\n" +
          "R 4\n" +
          "D 1\n" +
          "L 5\n" +
          "R 2";
  @Test
  void splitInputIntoElements() {
    RopeMotionParser parser = new RopeMotionParser();
    List<RopeMotion> motionList = parser.splitInputIntoElements(EXAMPLE_INPUT, "\n");
    assertEquals(8, motionList.size());
  }
}