package com.adventofcode.problems.twentytwo.day5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveInstructionTest {

  MoveInstruction inst = new MoveInstruction(4,14, 3);

  @Test
  void getSourceStackId() {
    assertEquals(4, inst.getSourceStackId());
  }

  @Test
  void getDestinationStackId() {
    assertEquals(14, inst.getDestinationStackId());
  }

  @Test
  void getNumberOfBoxesToMove() {
    assertEquals(3, inst.getNumberOfBoxesToMove());
  }
}