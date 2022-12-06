package com.adventofcode.problems.twentytwo.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CampCleanupPart2Test {

  public static String EXAMPLE_INPUT = """
          2-4,6-8
          2-3,4-5
          5-7,7-9
          2-8,3-7
          6-6,4-6
          2-6,4-8""";

  @Test
  void run() {
    assertEquals("4", new CampCleanupPart2().run(EXAMPLE_INPUT));
  }
}