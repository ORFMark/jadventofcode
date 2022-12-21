package com.adventofcode.problems.twentytwo.day9;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RopeBridgePart2Test {
  private static String EXAMPLE_INPUT = "R 5\n" +
          "U 8\n" +
          "L 8\n" +
          "D 3\n" +
          "R 17\n" +
          "D 10\n" +
          "L 25\n" +
          "U 20";

  @Test
  @Disabled
  void testExampleInput() {
    assertEquals("36", new RopeBridgePart2().run(EXAMPLE_INPUT));
  }

  @Test
  @Disabled
  void testSingleStep() {
    assertEquals("1", new RopeBridgePart2().run("U 1"));
  }
  @Test
  @Disabled
  void testSingleLongStep() {
    for(int i = 1; i <=9; i++) {
      assertEquals("1", new RopeBridgePart2().run(String.format("U %d", i)), String.format("Failed for %d steps", i));
    }
  }

  @Test
  @Disabled
  void testCompositeInput() {
    String compositeInput = "R 4\n" +
            "U 4\n" +
            "L 2\n";
    assertEquals("1", new RopeBridgePart2().run(compositeInput));
  }
  @Test
  @Disabled
  void testSingleExtraLongStep() {
    assertEquals("2", new RopeBridgePart2().run("U 10"));
  }
}