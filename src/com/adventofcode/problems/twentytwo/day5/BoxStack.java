package com.adventofcode.problems.twentytwo.day5;

import java.util.Collection;
import java.util.Stack;

public class BoxStack {
  private final Stack<Character> theStack = new Stack<>();

  public void addItem(char valueToAdd) {
    theStack.add(valueToAdd);
  }

  public void addItems(Collection<Character> itemsToAdd) {
    theStack.addAll(itemsToAdd);
  }

  public void moveItemsTo(BoxStack recevingStack, int numberOfItems) {
    for(int i = 0; i < numberOfItems && !theStack.empty(); i++) {
      recevingStack.addItem(theStack.pop());
    }
  }

  public void pullItemsFrom(BoxStack givingStack, int numberOfItems) {
    givingStack.moveItemsTo(this, numberOfItems);
  }

  public void moveItemsInOrderTo(BoxStack recevingStack, int numberOfItems) {
    BoxStack temp = new BoxStack();
    this.moveItemsTo(temp, numberOfItems);
    temp.moveItemsTo(recevingStack, numberOfItems);
  }

  public void pullItemsInOrderFrom(BoxStack givingStack, int numberOfItems) {
    givingStack.moveItemsInOrderTo(this, numberOfItems);
  }

  public Character pop() {
    return theStack.pop();
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    for(Character item : theStack) {
      builder.append(String.format("%c,", item));
    }
    return builder.toString();
  }

  public int size() {
    return theStack.size();
  }

}
