package com.adventofcode.problems.twentytwo.day5;

import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MoveInstructionParser implements InputParser<MoveInstruction> {

  @Override
  public List<MoveInstruction> splitInputIntoElements(String problemInput, String deliminatorRegex) {
    List<String> rawInstructions = new StringInputParser().splitInputIntoElements(problemInput, deliminatorRegex);
    List<MoveInstruction> cleanInstructions = new LinkedList<>();
    for(String rawInst : rawInstructions) {
        Scanner intScanner = new Scanner(rawInst).useDelimiter("[^\\d]+");
        int moved = intScanner.nextInt();
        int source = intScanner.nextInt();
        int dest = intScanner.nextInt();
        cleanInstructions.add(new MoveInstruction(source, dest, moved));
        intScanner.close();
    }
    return cleanInstructions;
  }
}
