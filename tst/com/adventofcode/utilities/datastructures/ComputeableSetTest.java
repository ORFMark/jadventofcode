package com.adventofcode.utilities.datastructures;

import com.adventofcode.utilities.general.datastructures.ComputeableSet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ComputeableSetTest {

  ComputeableSet<Integer> firstTestSet;
  ComputeableSet<Integer> secondTestSet;

  @BeforeEach
  public void setup() {
    firstTestSet = new ComputeableSet<>();
    secondTestSet = new ComputeableSet<>();

    firstTestSet.add(1);
    firstTestSet.add(2);
    secondTestSet.add(2);
    secondTestSet.add(3);
  }

  @Test
  void intersection() {
    Set<Integer> intsect = firstTestSet.intersection(secondTestSet);
    assertEquals(1, intsect.size());
    assertTrue(intsect.contains(2));
  }

  @Test
  void union() {
    Set<Integer> un = firstTestSet.union(secondTestSet);
    assertEquals(3, un.size());
  }
}