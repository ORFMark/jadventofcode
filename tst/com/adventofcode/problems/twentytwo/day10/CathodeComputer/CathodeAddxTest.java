package com.adventofcode.problems.twentytwo.day10.CathodeComputer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CathodeAddxTest {
  CathodeInstruction testAddx = new CathodeAddx(4);

  @Test
  void testCycleCount() {
    assertEquals(2, testAddx.getNumberOfCyclesToExecute());
  }

  @Test
  void testInstruction() {
    assertEquals(8, testAddx.runInstruction(4));
  }
}