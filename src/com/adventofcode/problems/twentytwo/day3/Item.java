package com.adventofcode.problems.twentytwo.day3;

public class Item implements Comparable<Item> {
  private final char value;
  private final int priority;
  public Item(char value) {
    if(Character.isAlphabetic(value)) {
      this.value = value;
      if(Character.isUpperCase(value)) {
        priority = value - 'A' + 27;
      } else {
        priority = value - 'a' + 1;
      }
    } else {
      throw new IllegalArgumentException("Item codes must be alphabetic characters");
    }
  }
  public char getValue() {
    return value;
  }

  public int getPriority() {
    return priority;
  }

  @Override
  public int compareTo(Item o) {
    return this.getPriority() - o.getPriority();
  }

  @Override
  public int hashCode() {
    return this.getPriority() + this.getValue();
  }

  @Override
  public String toString() {
    return String.format("Item value: %s, prio %d", value, priority);
  }

  @Override
  public boolean equals(Object itemToCompare) {
    if (itemToCompare == this) {
      return true;
    } else if (itemToCompare instanceof Item item) {
      return (item.getValue() == this.getValue());
    } else {
      return false;
    }
  }
}
