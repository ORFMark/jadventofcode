package com.adventofcode.problems.twentytwo.day1;

import com.adventofcode.problems.twentytwo.day1.data.ElfBackpack;
import com.adventofcode.problems.twentytwo.day1.data.ElfExpedition;
import com.adventofcode.problems.twentytwo.day1.parser.ElfBackpackParser;
import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

import java.util.List;

public class CalorieCountingPart2 extends InsturmentedProblem {
  private static final String PROBLEM_NAME = "CalorieCounting";
  private static final int YEAR = 2022;
  private static final int DAY = 1;
  private static final int PART = 2;

  @Override
  public String run(String input) {
    ElfExpedition expedition = new ElfExpedition();
    List<ElfBackpack> elves = new ElfBackpackParser().splitInputIntoElements(input, "\n");
    expedition.addElves(elves);
    return Integer.toString(expedition.computeHoardedCalories());
  }

  public String getIdentifer() {
    return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
  }
}
