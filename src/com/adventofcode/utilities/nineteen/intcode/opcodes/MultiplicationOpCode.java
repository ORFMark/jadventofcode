package com.adventofcode.utilities.nineteen.intcode.opcodes;

import java.util.LinkedList;
import java.util.List;

public class MultiplicationOpCode implements OpCode{
  @Override
  public int opCodeValue() {
    return 2;
  }

  @Override
  public List<Integer> runOpCode(List<Integer> program, int opCodeIndex) {
    List<Integer> result = new LinkedList<>(program);
    int firstPositionToFetch = program.get(opCodeIndex+1);
    int secondPositionToFetch = program.get(opCodeIndex+2);
    int positionToStore = program.get(opCodeIndex+3);
    //run the op code
    result.set(positionToStore, program.get(firstPositionToFetch) * program.get(secondPositionToFetch));
    //return the modified program
    return result;
  }
}
