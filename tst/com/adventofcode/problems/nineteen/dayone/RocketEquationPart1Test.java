package com.adventofcode.problems.nineteen.dayone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RocketEquationPart1Test {

  @Test
  void firstExample() {
    assertEquals("2", new RocketEquationPart1().run("12"));
  }

  @Test
  void secondExample() {
    assertEquals("2", new RocketEquationPart1().run("14"));
  }

  @Test
  void thirdExample() {
    assertEquals("654", new RocketEquationPart1().run("1969"));
  }

  @Test
  void fourthExample() {
    assertEquals("33583", new RocketEquationPart1().run("100756"));
  }
}