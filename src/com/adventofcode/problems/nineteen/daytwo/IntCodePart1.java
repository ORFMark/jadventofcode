package com.adventofcode.problems.nineteen.daytwo;

import com.adventofcode.problems.InsturmentedProblem;
import com.adventofcode.utilities.nineteen.intcode.Computer;
import com.adventofcode.utilities.parsers.numerics.IntegerInputParser;

import java.util.List;

public class IntCodePart1 extends InsturmentedProblem {


  @Override
  public String run(String input) {
    List<Integer> program = new IntegerInputParser().splitInputIntoElements(input, ",");
    program.set(1, 12);
    program.set(2, 2);
    Computer intCodeComputer = new Computer(program);
    return Integer.toString(intCodeComputer.runProgram(0));
  }
}
