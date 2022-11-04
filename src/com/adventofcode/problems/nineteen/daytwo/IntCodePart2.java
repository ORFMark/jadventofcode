package com.adventofcode.problems.nineteen.daytwo;

import com.adventofcode.problems.Problem;
import com.adventofcode.utilities.nineteen.intcode.Computer;
import com.adventofcode.utilities.parsers.numerics.IntegerInputParser;

import java.util.LinkedList;
import java.util.List;

public class IntCodePart2 implements Problem {

  @Override
  public String run(String input) {
    List<Integer> mainProgram = new IntegerInputParser().splitInputIntoElements(input, ",");
    for(int noun = 0; noun <= 99; noun++) {
      for(int verb = 0; verb <= 99; verb++) {
        LinkedList<Integer> program = new LinkedList<>(mainProgram);
        program.set(1, noun);
        program.set(2, verb);
        Computer intCodeComputer = new Computer(program);
        int result = intCodeComputer.runProgram(0);
        if(result == 19690720) {
          String nounString = Integer.toString(noun);
          String verbString = Integer.toString(verb);
          if(nounString.length() < 2) {
            nounString = "0" + nounString;
          }
          if(verbString.length() < 2) {
            verbString = "0" + verbString;
          }
          return Integer.toString(100 * Integer.parseInt(nounString+verbString));
        }
      }
    }
    return "NAN";
  }
}
