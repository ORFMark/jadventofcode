package com.adventofcode.problems.twentytwo.day9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RopeBridgePart1Test {
  private static String EXAMPLE_INPUT = "R 4\n" +
          "U 4\n" +
          "L 3\n" +
          "D 1\n" +
          "R 4\n" +
          "D 1\n" +
          "L 5\n" +
          "R 2";

  @Test
  void testExampleInput() {
    assertEquals("13", new RopeBridgePart1().run(EXAMPLE_INPUT));
  }

  @Test
  void testSingleStep() {
    assertEquals("1", new RopeBridgePart1().run("U 1"));
  }
  @Test
  void testSingleLongStep() {
    assertEquals("2", new RopeBridgePart1().run("U 2"));
  }
  @Test
  void testMixedSteps() {
    assertEquals("2", new RopeBridgePart1().run("U 2\nR 1"));
  }
  @Test
  void testTwoLongSteps() {
    assertEquals("3", new RopeBridgePart1().run("U 2\nR 2"));
  }

}