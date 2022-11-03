package com.adventofcode.problems.twentyone.daytwo;

import java.util.LinkedList;
import java.util.List;

public class DiveUtilities {

    public static List<Direction> parseInput(String input) {
      List<Direction> directions = new LinkedList<>();
      String[] inputDirections = input.split("\n");
      for(String dirct : inputDirections) {
          dirct = dirct.trim();
          String[] splitString = dirct.split(" ");
          directions.add(new Direction(splitString[0], Integer.parseInt(splitString[1])));
      }
      return directions;
    }
}
