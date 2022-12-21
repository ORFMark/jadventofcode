package com.adventofcode.problems.twentytwo.day10.CathodeComputer;

public abstract class CathodeInstruction {
  protected final int CYCLES;

  protected CathodeInstruction(int cyclesPerInstruction) {
    this.CYCLES = cyclesPerInstruction;
  }

  public int getNumberOfCyclesToExecute() {
    return CYCLES;
  }

  public abstract int runInstruction(int currentRegister);
}
