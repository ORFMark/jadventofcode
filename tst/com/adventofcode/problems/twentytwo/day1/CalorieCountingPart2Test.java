package com.adventofcode.problems.twentytwo.day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalorieCountingPart2Test {

  public static String TEST_INPUT = "1000\n" +
          "2000\n" +
          "3000\n" +
          "\n" +
          "4000\n" +
          "\n" +
          "5000\n" +
          "6000\n" +
          "\n" +
          "7000\n" +
          "8000\n" +
          "9000\n" +
          "\n" +
          "10000";
  @Test
  void run() {
    CalorieCountingPart2 testProblem = new CalorieCountingPart2();
    assertEquals("45000", testProblem.run(TEST_INPUT));
  }
}