package com.adventofcode.problems.twentytwo.day1;

import com.adventofcode.problems.twentytwo.day1.data.ElfBackpack;
import com.adventofcode.problems.twentytwo.day1.parser.ElfBackpackParser;
import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;
import com.adventofcode.utilities.general.parsers.numerics.IntegerInputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.LinkedList;
import java.util.List;

public class CalorieCountingPart2 extends InsturmentedProblem {
  private static final String PROBLEM_NAME = "CalorieCounting";
  private static final int YEAR = 2022;
  private static final int DAY = 1;
  private static final int PART = 2;

  @Override
  public String run(String input) {
    List<ElfBackpack> elves = new ElfBackpackParser().splitInputIntoElements(input, "\n");
    List<ElfBackpack> hoardingElves = new LinkedList<>();
    for (ElfBackpack elfBackpack : elves) {
      if(hoardingElves.size() < 3) {
        hoardingElves.add(elfBackpack);
      } else if (hoardingElves.get(2).sumBackback() < elfBackpack.sumBackback()) {
        hoardingElves.set(2, elfBackpack);
      }
      hoardingElves.sort((o1, o2) -> o2.sumBackback() - o1.sumBackback());
    }
    int hoardedCalories = 0;
    for(ElfBackpack hoard : hoardingElves) {
      hoardedCalories += hoard.sumBackback();
    }
    return Integer.toString(hoardedCalories);
  }

  public String getIdentifer() {
    return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
  }
}
