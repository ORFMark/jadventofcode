package com.adventofcode.utilities.nineteen.intcode.opcodes;

import com.adventofcode.utilities.parsers.numerics.IntegerInputParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.adventofcode.utilities.nineteen.intcode.opcodes.OpCodeTestConstants.TEST_PROGRAM;
import static org.junit.jupiter.api.Assertions.*;

class MultiplicationOpCodeTest {
  MultiplicationOpCode opCode = new MultiplicationOpCode();
  List<Integer> testProgram;


  @BeforeEach
  void setUp() {
    testProgram = new IntegerInputParser().splitInputIntoElements(TEST_PROGRAM, ",");
  }

  @Test
  void opCodeValue() {
    assertEquals(2, opCode.opCodeValue());
  }

  @Test
  void runOpCode() {
    int startIndex = 4;
    List<Integer> result = opCode.runOpCode(testProgram, startIndex);
    assertEquals(150, result.get(0));
    assertEquals(1, testProgram.get(0));
  }
}