package com.adventofcode.utilities.nineteen.intcode;

import com.adventofcode.utilities.nineteen.intcode.opcodes.AdditionOpCode;
import com.adventofcode.utilities.nineteen.intcode.opcodes.HaltOpCode;
import com.adventofcode.utilities.nineteen.intcode.opcodes.MultiplicationOpCode;
import com.adventofcode.utilities.nineteen.intcode.opcodes.OpCode;

import java.util.List;

public class Computer {

  List<Integer> program;
  public Computer(List<Integer> program) {
    this.program = program;
  }

  public void loadNewProgram(List<Integer> program) {
    this.program = program;
  }

  public int runProgram(int resultIndex) {
    List<Integer> changedProgram = program;
    int currentIndex = 0;
    boolean continueExecuting = true;
    OpCode opCodeToExecute;
    while (continueExecuting) {
      int opCode = changedProgram.get(currentIndex);
      opCodeToExecute = switch (opCode) {
        case 99 -> new HaltOpCode();
        case 1 -> new AdditionOpCode();
        case 2 -> new MultiplicationOpCode();
        default -> throw new IllegalArgumentException("Invalid Program!");
      };
      changedProgram = opCodeToExecute.runOpCode(changedProgram, currentIndex);
      currentIndex += 4;
      continueExecuting = opCodeToExecute.continueExecutionAferOpCode();
    }
    return changedProgram.get(resultIndex);
  }

  public int runProgram() {
    return runProgram(0);
  }
}
