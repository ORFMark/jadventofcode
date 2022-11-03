package com.adventofcode.utilities.parsers;

import java.util.LinkedList;
import java.util.List;

public class IntegerInputParser implements InputParser<Integer> {

  @Override
  public List<Integer> splitInputIntoElements(String problemInput) {
      List<Integer> cleanLines = new LinkedList<>();
      List<String> lines = new StringInputParser().splitInputIntoElements(problemInput);
      for(String line : lines) {
        cleanLines.add(Integer.parseInt(line));
      }
      return cleanLines;
  }
}
