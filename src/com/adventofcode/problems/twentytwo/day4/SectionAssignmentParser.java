package com.adventofcode.problems.twentytwo.day4;

import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.numerics.IntegerInputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SectionAssignmentParser implements InputParser<SectionAssignment> {

  @Override
  public List<SectionAssignment> splitInputIntoElements(String problemInput, String deliminatorRegex) {
    StringInputParser assignmentParser = new StringInputParser();
    IntegerInputParser intParser = new IntegerInputParser();
    List<SectionAssignment> result = new LinkedList<>();
    List<String> sectionStrings = assignmentParser.splitInputIntoElements(problemInput, deliminatorRegex);
    for (String sectionAssignment : sectionStrings) {
      List<Integer> sections = intParser.splitInputIntoElements(sectionAssignment, "-");
      if (!(sections.isEmpty() || sections.size() % 2 != 0)) {
        while (!sections.isEmpty()) {
          result.add(new SectionAssignment(sections.remove(0), sections.remove(0)));
        }
      }
    }
    return result;
  }

}
