package com.adventofcode.utilities.parsers;

import com.adventofcode.utilities.parsers.InputParser;
import com.adventofcode.utilities.parsers.StringInputParser;

import java.util.LinkedList;
import java.util.List;

public class DoubleInputParser implements InputParser<Double> {

  @Override
  public List<Double> splitInputIntoElements(String problemInput) {
      List<Double> cleanLines = new LinkedList<>();
      List<String> lines = new StringInputParser().splitInputIntoElements(problemInput);
      for(String line : lines) {
        cleanLines.add(Double.parseDouble(line));
      }
      return cleanLines;
  }
}
