package com.adventofcode.problems.twentytwo.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RucksackReorganizationPart2Test {

  private static final String TEST_INPUT = "vJrwpWtwJgWrhcsFMMfFFhFp\n" +
          "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL\n" +
          "PmmdzqPrVvPwwTWBwg\n" +
          "wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn\n" +
          "ttgJtRGJQctTZtZT\n" +
          "CrZsJsPPZsGzwwsLwLmpwMDw";

  @Test
  void testWithGivenInput() {
    assertEquals("70", new RucksackReorganizationPart2().run(TEST_INPUT));
  }
}