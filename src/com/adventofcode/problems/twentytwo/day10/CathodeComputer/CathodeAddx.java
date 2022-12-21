package com.adventofcode.problems.twentytwo.day10.CathodeComputer;

public class CathodeAddx extends CathodeInstruction {

  private int instructionArg;
  public CathodeAddx(int valueToAdd) {
    super(2);
    this.instructionArg = valueToAdd;
  }

  @Override
  public int runInstruction(int currentRegister) {
    return currentRegister+instructionArg;
  }
}
