package com.adventofcode.problems.twentytwo.day3;

import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

import java.util.List;
import java.util.Set;

public class RucksackReorganizationPart1 extends InsturmentedProblem {
  private static final String PROBLEM_NAME = "RucksackReorganization";
  private static final int YEAR = 2022;
  private static final int DAY = 3;
  private static final int PART = 1;

  @Override
  public String run(String input) {
    List<Rucksack> rucksacks = new RucksackParser().splitInputIntoElements(input, "\n");
    int answer = 0;
    for (Rucksack sack : rucksacks) {
      Set<Item> duplicatedItems = sack.getDuplicatedItemsBetweenCompartments(1,2);
      for (Item dup : duplicatedItems) {
        answer += dup.getPriority();
      }
    }
    return Integer.toString(answer);
  }
  @Override
  public String getIdentifer() {
    return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
  }
}
