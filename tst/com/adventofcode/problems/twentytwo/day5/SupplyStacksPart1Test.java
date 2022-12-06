package com.adventofcode.problems.twentytwo.day5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupplyStacksPart1Test {

  public static String EXAMPLE_INPUT = """
              [D]   \s
          [N] [C]   \s
          [Z] [M] [P]
           1   2   3\s

          move 1 from 2 to 1
          move 3 from 1 to 3
          move 2 from 2 to 1
          move 1 from 1 to 2""";
  @Test
  @Disabled
  public void exampleInputTest() {
    assertEquals("CMZ", new SupplyStacksPart1().run(EXAMPLE_INPUT));
  }
}