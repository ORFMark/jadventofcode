package com.adventofcode.problems.nineteen.dayone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RocketEquationPart2Test {

  @Test
  void firstExample() {
    assertEquals("2", new RocketEquationPart2().run("14"));
  }

  @Test
  void secondExample() {
    assertEquals("966", new RocketEquationPart2().run("1969"));
  }

  @Test
  void thirdExample() {
    assertEquals("50346", new RocketEquationPart2().run("100756"));
  }
}