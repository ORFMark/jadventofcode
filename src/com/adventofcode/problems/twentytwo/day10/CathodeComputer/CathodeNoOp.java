package com.adventofcode.problems.twentytwo.day10.CathodeComputer;

public class CathodeNoOp extends CathodeInstruction{

  public CathodeNoOp() {
    super(1);
  }


  @Override
  public int runInstruction(int currentRegister) {
    return currentRegister;
  }
}
