package com.adventofcode.problems.twentytwo.day3;

public class RucksackFactory {

  private RucksackFactory() {}


  public static Rucksack buildRucksack(String descriptionString) {
    Rucksack rucksack = new Rucksack(2);
    int length = descriptionString.length();
    char[] firstCompartment = descriptionString.substring(0, (length/2)).toCharArray();
    char[] secondCompartment = descriptionString.substring((length/2), length).toCharArray();
    if(firstCompartment.length != secondCompartment.length) {
      throw new IllegalArgumentException("Bad description string, string must be evenly divisible");
    }
    for (char value : firstCompartment) {
      rucksack.addItem(1, new Item(value));
    }
    for (char value : secondCompartment) {
      rucksack.addItem(2, new Item(value));
    }
    return rucksack;
  }
}
