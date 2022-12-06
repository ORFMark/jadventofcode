package com.adventofcode.problems.twentytwo.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

  @Test
  void testLowerCaseBehavior() {
    Item testItem = new Item('a');
    assertEquals('a', testItem.getValue());
    assertEquals(1, testItem.getPriority());
  }

  @Test
  void testUpperCaseBehavior() {
    Item testItem = new Item('A');
    assertEquals('A', testItem.getValue());
    assertEquals(27, testItem.getPriority());
  }

  @Test
  void testBadCodeBehavior() {
    assertThrows(IllegalArgumentException.class, () -> {new Item('5');});
  }

  @Test
  void testCompareing() {
    Item upperCaseItem = new Item('B');
    Item lowerCaseItem = new Item('b');
    assertTrue(lowerCaseItem.compareTo(upperCaseItem) < 0);
  }
}