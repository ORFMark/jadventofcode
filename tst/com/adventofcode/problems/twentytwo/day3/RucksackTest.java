package com.adventofcode.problems.twentytwo.day3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RucksackTest {


  @Test
  void getDuplicatedItemsBetweenCompartments() {
    Rucksack testRucksack = RucksackFactory.buildRucksack("vJrwpWtwJgWrhcsFMMfFFhFp");
    assertEquals(1, testRucksack.getDuplicatedItemsBetweenCompartments(1,2).size());
    assertTrue(testRucksack.getDuplicatedItemsBetweenCompartments(1,2).contains(new Item('p')));
  }
}