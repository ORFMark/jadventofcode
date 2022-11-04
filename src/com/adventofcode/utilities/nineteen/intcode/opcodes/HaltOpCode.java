package com.adventofcode.utilities.nineteen.intcode.opcodes;

import java.util.List;

public class HaltOpCode implements OpCode{

  @Override
  public boolean continueExecutionAferOpCode() {
    return false;
  }

  @Override
  public int opCodeValue() {
    return 99;
  }

  @Override
  public List<Integer> runOpCode(List<Integer> program, int opCodeIndex) {
    return program;
  }
}
