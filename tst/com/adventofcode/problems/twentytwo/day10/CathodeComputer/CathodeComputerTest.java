package com.adventofcode.problems.twentytwo.day10.CathodeComputer;

import com.adventofcode.problems.twentytwo.day10.CathodeProgramParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CathodeComputerTest {
  public String EXAMPLE_INPUT = "addx 15\n" +
          "addx -11\n" +
          "addx 6\n" +
          "addx -3\n" +
          "addx 5\n" +
          "addx -1\n" +
          "addx -8\n" +
          "addx 13\n" +
          "addx 4\n" +
          "noop\n" +
          "addx -1\n" +
          "addx 5\n" +
          "addx -1\n" +
          "addx 5\n" +
          "addx -1\n" +
          "addx 5\n" +
          "addx -1\n" +
          "addx 5\n" +
          "addx -1\n" +
          "addx -35\n" +
          "addx 1\n" +
          "addx 24\n" +
          "addx -19\n" +
          "addx 1\n" +
          "addx 16\n" +
          "addx -11\n" +
          "noop\n" +
          "noop\n" +
          "addx 21\n" +
          "addx -15\n" +
          "noop\n" +
          "noop\n" +
          "addx -3\n" +
          "addx 9\n" +
          "addx 1\n" +
          "addx -3\n" +
          "addx 8\n" +
          "addx 1\n" +
          "addx 5\n" +
          "noop\n" +
          "noop\n" +
          "noop\n" +
          "noop\n" +
          "noop\n" +
          "addx -36\n" +
          "noop\n" +
          "addx 1\n" +
          "addx 7\n" +
          "noop\n" +
          "noop\n" +
          "noop\n" +
          "addx 2\n" +
          "addx 6\n" +
          "noop\n" +
          "noop\n" +
          "noop\n" +
          "noop\n" +
          "noop\n" +
          "addx 1\n" +
          "noop\n" +
          "noop\n" +
          "addx 7\n" +
          "addx 1\n" +
          "noop\n" +
          "addx -13\n" +
          "addx 13\n" +
          "addx 7\n" +
          "noop\n" +
          "addx 1\n" +
          "addx -33\n" +
          "noop\n" +
          "noop\n" +
          "noop\n" +
          "addx 2\n" +
          "noop\n" +
          "noop\n" +
          "noop\n" +
          "addx 8\n" +
          "noop\n" +
          "addx -1\n" +
          "addx 2\n" +
          "addx 1\n" +
          "noop\n" +
          "addx 17\n" +
          "addx -9\n" +
          "addx 1\n" +
          "addx 1\n" +
          "addx -3\n" +
          "addx 11\n" +
          "noop\n" +
          "noop\n" +
          "addx 1\n" +
          "noop\n" +
          "addx 1\n" +
          "noop\n" +
          "noop\n" +
          "addx -13\n" +
          "addx -19\n" +
          "addx 1\n" +
          "addx 3\n" +
          "addx 26\n" +
          "addx -30\n" +
          "addx 12\n" +
          "addx -1\n" +
          "addx 3\n" +
          "addx 1\n" +
          "noop\n" +
          "noop\n" +
          "noop\n" +
          "addx -9\n" +
          "addx 18\n" +
          "addx 1\n" +
          "addx 2\n" +
          "noop\n" +
          "noop\n" +
          "addx 9\n" +
          "noop\n" +
          "noop\n" +
          "noop\n" +
          "addx -1\n" +
          "addx 2\n" +
          "addx -37\n" +
          "addx 1\n" +
          "addx 3\n" +
          "noop\n" +
          "addx 15\n" +
          "addx -21\n" +
          "addx 22\n" +
          "addx -6\n" +
          "addx 1\n" +
          "noop\n" +
          "addx 2\n" +
          "addx 1\n" +
          "noop\n" +
          "addx -10\n" +
          "noop\n" +
          "noop\n" +
          "addx 20\n" +
          "addx 1\n" +
          "addx 2\n" +
          "addx 2\n" +
          "addx -6\n" +
          "addx -11\n" +
          "noop\n" +
          "noop\n" +
          "noop";
  private List<CathodeInstruction> program;
  @BeforeEach
  void setUp() {
    program = new CathodeProgramParser().splitInputIntoElements(EXAMPLE_INPUT, "\n");
    assertEquals(146, program.size());
  }

  @Test
  void resetComputer() {
    CathodeComputer testComputer = new CathodeComputer(program);
    testComputer.getRegisterValueAtCycleNumber(70);
    testComputer.resetComputer();
    assertEquals(1, testComputer.getRegisterValueAtCycleNumber(0));
  }

  @Test
  void getRegisterValueAtCycleNumber() {
    CathodeComputer cathodeComputer = new CathodeComputer(program);
    assertEquals(21, cathodeComputer.getRegisterValueAtCycleNumber(20));
  }
}