package com.adventofcode.problems.twentytwo.day5;

import java.util.Collection;
import java.util.Stack;

public class BoxStack {
  private Stack<Character> theStack;

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
    for(int i = 0; i < numberOfItems; i++) {
      theStack.add(givingStack.pop());
    }
  }

  public Character pop() {
    return theStack.pop();
  }
}
