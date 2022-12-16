package com.adventofcode.problems.twentytwo.day5;

public class MoveInstruction {
  private final int sourceStackId;
  private final int destinationStackId;
  private final int numberOfBoxesToMove;

  public MoveInstruction(int sourceStackId, int destinationStackId, int numberOfBoxesToMove) {
    this.sourceStackId = sourceStackId;
    this.destinationStackId = destinationStackId;
    this.numberOfBoxesToMove = numberOfBoxesToMove;
  }
  public int getSourceStackId() {
    return sourceStackId;
  }

  public int getDestinationStackId() {
    return destinationStackId;
  }

  public int getNumberOfBoxesToMove() {
    return numberOfBoxesToMove;
  }
}
