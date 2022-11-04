package com.adventofcode.utilities.nineteen.intcode;

import com.adventofcode.utilities.parsers.numerics.IntegerInputParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.adventofcode.utilities.nineteen.intcode.opcodes.OpCodeTestConstants.TEST_PROGRAM;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
  Computer intCodeComputer;
  @BeforeEach
  void setUp() {
     intCodeComputer = new Computer(new IntegerInputParser().splitInputIntoElements(TEST_PROGRAM, ","));
  }

  @Test
  void runFirstTestProgram() {
    assertEquals(3500, intCodeComputer.runProgram());
  }

  @Test
  void runSecondTestProgram() {
    intCodeComputer.loadNewProgram(new IntegerInputParser().splitInputIntoElements("1,0,0,0,99", ","));
    assertEquals(2, intCodeComputer.runProgram());
  }

  @Test
  void runThirdTestProgram() {
    intCodeComputer.loadNewProgram(new IntegerInputParser().splitInputIntoElements("2,3,0,3,99", ","));
    assertEquals(6, intCodeComputer.runProgram(3));
  }

  @Test
  void runFourthTestProgram() {
    intCodeComputer.loadNewProgram(new IntegerInputParser().splitInputIntoElements("1,1,1,4,99,5,6,0,99", ","));
    assertEquals(2, intCodeComputer.runProgram(4));
    assertEquals(30, intCodeComputer.runProgram(0));
  }
}