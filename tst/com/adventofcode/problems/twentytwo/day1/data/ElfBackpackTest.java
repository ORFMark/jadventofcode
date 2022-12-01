package com.adventofcode.problems.twentytwo.day1.data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfBackpackTest {

  ElfBackpack backpackToTest;

  @BeforeEach
  public void setupBackpack() {
    backpackToTest = new ElfBackpack();
  }

  @Test
  public void testSumWithEmptyPackpack() {
    assertEquals(0, backpackToTest.sumBackback());
  }

  @Test
  public void testMaxWithEmptyPackpack() {
    assertEquals(0, backpackToTest.maxBackback());
  }

  @Test
  public void testMaxWithOneItem() {
    backpackToTest.addItem(42);
    assertEquals(42, backpackToTest.maxBackback());
  }

  @Test
  public void testSumWithOneItem() {
    backpackToTest.addItem(42);
    assertEquals(42, backpackToTest.sumBackback());
  }

  @Test
  public void testMaxWithManyItems() {
    backpackToTest.addItem(42);
    backpackToTest.addItem(23);
    assertEquals(42, backpackToTest.maxBackback());
  }

  @Test
  public void testSumWithManyItems() {
    backpackToTest.addItem(42);
    backpackToTest.addItem(23);
    assertEquals(65, backpackToTest.sumBackback());
  }

}