package com.adventofcode.problems.nineteen.dayone;

import com.adventofcode.problems.Problem;
import com.adventofcode.utilities.parsers.IntegerInputParser;

import java.util.LinkedList;
import java.util.List;

public class RocketEquationPart2 implements Problem {

  @Override
  public String run(String input) {
    List<Integer> moduleMasses = new IntegerInputParser().splitInputIntoElements(input);
    int fuelNeeded = 0;
    for (int mass : moduleMasses) {
      fuelNeeded += calculateFuelForModule(mass);
    }
    return Integer.toString(fuelNeeded);
  }

  private Integer calculateFuelForModule(int moduleMass) {
    int moduleFuel = (moduleMass/3) -2;
    List<Integer> additionalFuelRequired = new LinkedList<>();
    int fuel = (moduleFuel/3) - 2 ;
    while(fuel > 0) {
      additionalFuelRequired.add(fuel);
      fuel = (fuel/3) - 2;
    }
    for (int moreFuel : additionalFuelRequired) {
      moduleFuel += moreFuel;
    }
    return moduleFuel;
  }
}
