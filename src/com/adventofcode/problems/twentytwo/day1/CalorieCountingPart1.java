package com.adventofcode.problems.twentytwo.day1;

import com.adventofcode.problems.twentytwo.day1.data.ElfBackpack;
import com.adventofcode.problems.twentytwo.day1.data.ElfExpedition;
import com.adventofcode.problems.twentytwo.day1.parser.ElfBackpackParser;
import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;
import com.adventofcode.utilities.general.parsers.numerics.IntegerInputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.LinkedList;
import java.util.List;

public class CalorieCountingPart1 extends InsturmentedProblem {
  private static final String PROBLEM_NAME = "CalorieCounting";
  private static final int YEAR = 2022;
  private static final int DAY = 1;
  private static final int PART = 1;

  @Override
  public String run(String input) {
    List<ElfBackpack> elves = new ElfBackpackParser().splitInputIntoElements(input, "\n");
    ElfExpedition expedition = new ElfExpedition();
    for (ElfBackpack elf : elves) {
      expedition.addElf(elf);
    }
    return Integer.toString(expedition.findElfWithTheMostFood().sumBackback());
  }

  public String getIdentifer() {
    return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
  }
}
