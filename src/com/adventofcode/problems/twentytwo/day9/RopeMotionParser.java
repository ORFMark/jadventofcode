package com.adventofcode.problems.twentytwo.day9;

import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RopeMotionParser implements InputParser<RopeMotion> {
  @Override
  public List<RopeMotion> splitInputIntoElements(String problemInput, String deliminatorRegex) {
    List<RopeMotion> motionList = new LinkedList<>();
    List<String> rawInstructions = new StringInputParser().splitInputIntoElements(problemInput, deliminatorRegex);

    for(String instruction : rawInstructions) {
      Scanner intScanner = new Scanner(instruction).useDelimiter("[^\\d]+");
      char direc = instruction.charAt(0);
      int distance = intScanner.nextInt();
      intScanner.close();
      motionList.add(new RopeMotion(direc, distance));
    }
    return motionList;
  }
}
