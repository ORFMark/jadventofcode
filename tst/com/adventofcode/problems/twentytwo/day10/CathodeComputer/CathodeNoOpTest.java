package com.adventofcode.problems.twentytwo.day10.CathodeComputer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CathodeNoOpTest {

  CathodeInstruction testInstruction = new CathodeNoOp();
  @Test
  void testCycleCount() {
    assertEquals(1, testInstruction.getNumberOfCyclesToExecute());
  }

  @Test
  void testInstruction() {
    assertEquals(4, testInstruction.runInstruction(4));
  }
}