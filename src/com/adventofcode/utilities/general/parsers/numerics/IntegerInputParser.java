package com.adventofcode.utilities.general.parsers.numerics;

import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;
import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.LinkedList;
import java.util.List;

public class IntegerInputParser implements InputParser<Integer> {

  @Override
  public List<Integer> splitInputIntoElements(String problemInput, String deliminatorRegex) {
      List<Integer> cleanLines = new LinkedList<>();
      List<String> lines = new StringInputParser().splitInputIntoElements(problemInput, deliminatorRegex);
      for(String line : lines) {
        cleanLines.add(Integer.parseInt(line));
      }
      return cleanLines;
  }
}
