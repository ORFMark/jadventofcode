package com.adventofcode.problems.nineteen.dayone;

import com.adventofcode.problems.Problem;
import com.adventofcode.utilities.parsers.IntegerInputParser;

import java.util.List;

public class RocketEquationPart1 implements Problem {

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
    return (moduleMass/3) -2;
  }
}
