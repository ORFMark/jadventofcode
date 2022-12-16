package com.adventofcode.problems.twentytwo.day5;

import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.text.RawStringInputParser;

import java.util.LinkedList;
import java.util.List;

public class SupplyDataParser implements InputParser<SupplyData> {


  @Override
  public List<SupplyData> splitInputIntoElements(String problemInput, String deliminatorRegex) {
    List<SupplyData> result = new LinkedList<>();
    List<String> dataDumps = new RawStringInputParser().splitInputIntoElements(problemInput, deliminatorRegex);
    for (String dump : dataDumps) {
      List<String> seperator = new RawStringInputParser().splitInputIntoElements(dump, "\n\n");
      List<BoxStack> stack = new BoxStackParser().splitInputIntoElements(seperator.get(0), "\n\n");
      List<MoveInstruction> instructions = new MoveInstructionParser().splitInputIntoElements(seperator.get(1), "\n");
      result.add(new SupplyData(stack, instructions));
    }
    return result;
  }
}
