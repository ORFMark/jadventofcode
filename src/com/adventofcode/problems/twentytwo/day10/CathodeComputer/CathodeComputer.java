package com.adventofcode.problems.twentytwo.day10.CathodeComputer;

import java.util.List;

public class CathodeComputer {
  private int cycleNumber = 0;
  private int register = 1;
  private final List<CathodeInstruction> program;

  public CathodeComputer(List<CathodeInstruction> program) {
    this.program = List.copyOf(program);
  }

  public void resetComputer() {
    cycleNumber = 0;
    register = 1;
  }

  public int getRegisterValueAtCycleNumber(int cycleNumber){
    for(CathodeInstruction instruction : program) {
      this.cycleNumber += instruction.getNumberOfCyclesToExecute();
      if(cycleNumber <= this.cycleNumber) {
        return register;
      } else {
        register = instruction.runInstruction(register);
      }
    }
    return register;
  }

}
