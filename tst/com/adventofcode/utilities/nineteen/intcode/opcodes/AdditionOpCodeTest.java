package com.adventofcode.utilities.nineteen.intcode.opcodes;

import com.adventofcode.utilities.parsers.numerics.IntegerInputParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.adventofcode.utilities.nineteen.intcode.opcodes.OpCodeTestConstants.TEST_PROGRAM;
import static org.junit.jupiter.api.Assertions.*;

class AdditionOpCodeTest {
  AdditionOpCode opCode = new AdditionOpCode();
  List<Integer> testProgram;


  @BeforeEach
  void setUp() {
    testProgram = new IntegerInputParser().splitInputIntoElements(TEST_PROGRAM, ",");
  }

  @Test
  void opCodeValue() {
    assertEquals(1, opCode.opCodeValue());
  }

  @Test
  void runOpCode() {
    int startIndex = 0;
    List<Integer> result = opCode.runOpCode(testProgram, startIndex);
    assertEquals(70, result.get(3));
    assertEquals(3, testProgram.get(3));
  }
}