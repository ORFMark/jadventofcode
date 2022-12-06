package com.adventofcode.problems.twentytwo.day3;

import com.adventofcode.utilities.general.datastructures.ComputeableSet;

import java.util.ArrayList;
import java.util.List;


public class Rucksack {
  List<ComputeableSet<Item>> compartments;

  public Rucksack(int numberOfCompartments) {
    compartments = new ArrayList<>(numberOfCompartments);
    for(int i = 0; i < numberOfCompartments; i++) {
      compartments.add(new ComputeableSet<>());
    }
  }

  /**
   *
   * @param compartmentNumber the one-indexed number of the compartment you want to add the item to
   * @param itemToAdd
   */
  public void addItem(int compartmentNumber, Item itemToAdd) {
    compartments.get(compartmentNumber-1).add(itemToAdd);
  }

  public ComputeableSet<Item> getDuplicatedItemsBetweenCompartments(int firstCompartment, int secondCompartment) {
    return compartments.get(firstCompartment-1).intersection(compartments.get(secondCompartment-1));
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder("Rucksack: ");
    for(int i = 0; i < compartments.size(); i++) {
      ComputeableSet<Item> compartment = compartments.get(i);
      StringBuilder compartmentString = new StringBuilder();
      for (Item item : compartment) {
        compartmentString.append(item.getValue());
      }
      result.append(String.format("Compartment %d, %s; ", i + 1, compartmentString.toString()));
    }
    return result.toString();
  }

  public ComputeableSet<Item> getContents() {
    ComputeableSet<Item> result = new ComputeableSet<>();
    for(ComputeableSet<Item> compartment : compartments) {
        result.addAll(compartment);
    }
    return result;
  }
}
