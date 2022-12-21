package com.adventofcode.problems.twentytwo.day10;

import com.adventofcode.problems.twentytwo.day10.CathodeComputer.CathodeAddx;
import com.adventofcode.problems.twentytwo.day10.CathodeComputer.CathodeInstruction;
import com.adventofcode.problems.twentytwo.day10.CathodeComputer.CathodeNoOp;
import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.text.RawStringInputParser;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CathodeProgramParser implements InputParser<CathodeInstruction> {

  @Override
  public List<CathodeInstruction> splitInputIntoElements(String problemInput, String deliminatorRegex) {
    List<String> rawInstructions = new RawStringInputParser().splitInputIntoElements(problemInput, deliminatorRegex);
    List<CathodeInstruction> program = new LinkedList<>();
    for(String instruction : rawInstructions) {
      if(instruction.contains("noop")) {
        program.add(new CathodeNoOp());
      } else if(instruction.contains("addx")) {
        Scanner intScanner = new Scanner(instruction).useDelimiter("[^\\d]+");
        int valueToAdd = intScanner.nextInt();
        if(valueToAdd > 0 && instruction.contains("-")) {
          valueToAdd = -valueToAdd;
        }
        program.add(new CathodeAddx(valueToAdd));
        intScanner.close();
      }
    }
    return program;
  }
}
