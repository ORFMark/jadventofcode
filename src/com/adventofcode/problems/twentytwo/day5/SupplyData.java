package com.adventofcode.problems.twentytwo.day5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SupplyData {

  private final List<BoxStack> boxStacks;
  private final List<MoveInstruction> instructions;

  public SupplyData(List<BoxStack> supplyStacks, List<MoveInstruction> instructions) {
    this.boxStacks = new ArrayList<>(supplyStacks);
    this.instructions = new LinkedList<>(instructions);
  }
  public List<MoveInstruction> getInstructions() {
    return instructions;
  }
  public List<BoxStack> getBoxStacks() {
    return boxStacks;
  }

  public void executeInstructions(boolean retainStackOrder) {
    if(retainStackOrder) {
      for (MoveInstruction instruction : instructions) {
        boxStacks.get(instruction.getDestinationStackId() - 1).pullItemsInOrderFrom(boxStacks.get(instruction.getSourceStackId() - 1),
                instruction.getNumberOfBoxesToMove());
      }
    } else {
      for (MoveInstruction instruction : instructions) {
        boxStacks.get(instruction.getDestinationStackId() - 1).pullItemsFrom(boxStacks.get(instruction.getSourceStackId() - 1),
                instruction.getNumberOfBoxesToMove());
      }
    }
  }

  public String displayStacks() {
    StringBuilder builder = new StringBuilder();
    for(int i = 0; i < boxStacks.size(); i++) {
      builder.append(String.format("Stack %d: %s | ", i+1, boxStacks.get(i).toString()));
    }
    return builder.toString();
  }
}
