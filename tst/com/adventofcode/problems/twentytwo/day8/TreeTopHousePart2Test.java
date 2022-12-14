package com.adventofcode.problems.twentytwo.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeTopHousePart2Test {

  private static final String EXAMPLE_INPUT = """
          30373
          25512
          65332
          33549
          35390""";
  @Test
  void run() {
    assertEquals("8", new TreeTopHousePart2().run(EXAMPLE_INPUT));
  }
}