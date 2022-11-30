package com.adventofcode.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

  @Test
  void getIdentifer() {
    Problem idenifiedProblem = new Problem() {
      @Override
      public String run(String input) {
        return input;
      }
    };
    assertEquals("ORFMark's Advent of code -1, Day -1,  part -1", idenifiedProblem.getIdentifer());
  }
}