package com.adventofcode.problems.twentytwo.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RucksackReorganizationPart1Test {

  private static final String TEST_INPUT = "vJrwpWtwJgWrhcsFMMfFFhFp\n" +
          "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL\n" +
          "PmmdzqPrVvPwwTWBwg\n" +
          "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn\n" +
          "ttgJtRGJQctTZtZT\n" +
          "CrZsJsPPZsGzwwsLwLmpwMDw";

  @Test
  void testWithGivenInput() {
    assertEquals("157", new RucksackReorganizationPart1().run(TEST_INPUT));
  }
}