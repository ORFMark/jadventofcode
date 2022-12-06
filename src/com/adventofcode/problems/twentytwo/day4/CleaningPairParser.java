package com.adventofcode.problems.twentytwo.day4;

import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.LinkedList;
import java.util.List;

public class CleaningPairParser implements InputParser<CleaningPair> {


  @Override
  public List<CleaningPair> splitInputIntoElements(String problemInput, String deliminatorRegex) {
    List<String> pairStrings = new StringInputParser().splitInputIntoElements(problemInput, deliminatorRegex);
    List<CleaningPair> result = new LinkedList<>();
    for(String pair : pairStrings) {
      List<SectionAssignment> sections = new SectionAssignmentParser().splitInputIntoElements(pair, ",");
      if((sections.size() %2 == 0)) {
        while(!sections.isEmpty()) {
          result.add(new CleaningPair(sections.remove(0), sections.remove(0)));
        }
      }
    }
    return result;
  }
}
