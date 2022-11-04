package com.adventofcode.utilities.nineteen.intcode.opcodes;

import java.util.List;

public interface OpCode {

  default boolean continueExecutionAferOpCode() {
    return true;
  }

  int opCodeValue();
  List<Integer> runOpCode(List<Integer> program, int opCodeIndex);
}
