package com.adventofcode.problems.twentytwo.day8;

import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.LinkedList;
import java.util.List;

public class GroveParser implements InputParser<Grove> {


  @Override
  public List<Grove> splitInputIntoElements(String problemInput, String deliminatorRegex) {
    List<String> groves = new StringInputParser().splitInputIntoElements(problemInput,deliminatorRegex);
    List<Grove> result = new LinkedList();
    for(String grove : groves) {
      List<String> rows = new StringInputParser().splitInputIntoElements(grove, "\n");
      final int NUMBER_OF_ROWS = rows.size();
      final int NUMBER_OF_COLUMNS = rows.get(0).length();
      Grove treeGrove = new Grove(NUMBER_OF_COLUMNS, NUMBER_OF_ROWS);
      for (int rowNumber = 0; rowNumber < NUMBER_OF_ROWS; rowNumber++) {
        for (int columnNumber = 0; columnNumber < NUMBER_OF_COLUMNS; columnNumber++) {
          treeGrove.setTreeHeight(rows.get(rowNumber).charAt(columnNumber) - 48, rowNumber, columnNumber);
        }
      }
      result.add(treeGrove);
    }
    return result;
  }
}
