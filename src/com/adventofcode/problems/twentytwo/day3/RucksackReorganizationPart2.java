package com.adventofcode.problems.twentytwo.day3;

import com.adventofcode.utilities.general.datastructures.ComputeableSet;
import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

import java.util.LinkedList;
import java.util.List;

public class RucksackReorganizationPart2 extends InsturmentedProblem {
  private static final String PROBLEM_NAME = "RucksackReorganization";
  private static final int YEAR = 2022;
  private static final int DAY = 3;
  private static final int PART = 2;

  @Override
  public String run(String input) {
    List<Rucksack> rucksacks = new RucksackParser().splitInputIntoElements(input, "\n");
    List<List<Rucksack>> groups= new LinkedList<>();
    int answer = 0;
    int memberNumber = 0;
    List<Rucksack> group = new LinkedList<>();
    for (Rucksack sack : rucksacks) {
      group.add(sack);
      memberNumber = (memberNumber + 1) % 3;
      if(memberNumber == 0) {
        groups.add(group);
        group = new LinkedList<>();
      }
    }

    for(List<Rucksack> eachGroup : groups) {
      ComputeableSet<Item> badgeSet = new ComputeableSet();
      for (Rucksack groupMemer : eachGroup) {
        if (badgeSet.isEmpty()) {
          badgeSet.addAll(groupMemer.getContents());
        } else {
          badgeSet = badgeSet.intersection(groupMemer.getContents());
        }
      }
      for (Item badge : badgeSet) {
        answer += badge.getPriority();
      }
    }

    return Integer.toString(answer);
  }
  @Override
  public String getIdentifer() {
    return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
  }
}
