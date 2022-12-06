package com.adventofcode.problems.twentytwo.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CampCleanupPart1Test {

  public static String EXAMPLE_INPUT = """
          2-4,6-8
          2-3,4-5
          5-7,7-9
          2-8,3-7
          6-6,4-6
          2-6,4-8""";

  @Test
  void run() {
    assertEquals("2", new CampCleanupPart1().run(EXAMPLE_INPUT));
  }
}