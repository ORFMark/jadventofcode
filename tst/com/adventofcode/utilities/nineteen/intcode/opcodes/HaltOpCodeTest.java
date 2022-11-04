package com.adventofcode.utilities.nineteen.intcode.opcodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class HaltOpCodeTest {


  HaltOpCode opCode = new HaltOpCode();
  @Test
  void continueExecutionAferOpCode() {
    assertFalse(opCode.continueExecutionAferOpCode());
  }

  @Test
  void correctOpCodeValue() {
    assertEquals(99, opCode.opCodeValue());
  }
}