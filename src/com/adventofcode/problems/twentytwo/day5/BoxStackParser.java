package com.adventofcode.problems.twentytwo.day5;

import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.numerics.IntegerInputParser;
import com.adventofcode.utilities.general.parsers.text.RawStringInputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.LinkedList;
import java.util.List;

public class BoxStackParser implements InputParser<BoxStack> {


  @Override
  public List<BoxStack> splitInputIntoElements(String problemInput, String deliminatorRegex) {
    List<String> stackStrings = new RawStringInputParser().splitInputIntoElements(problemInput,deliminatorRegex);
    List<BoxStack> result = new LinkedList<>();
    for(String stack : stackStrings) {
      List<String> levels = new RawStringInputParser().splitInputIntoElements(stack, "\n");
      int numberOfLevels = levels.size()-1;
      String stackNumbering = levels.get(numberOfLevels);
      List<Integer> stackNumbers = new IntegerInputParser().splitInputIntoElements(stackNumbering, " ");
      int numberOfStacks = stackNumbers.size();
      for(int stackNumber = 0; stackNumber < numberOfStacks; stackNumber++) {
        result.add(new BoxStack());
      }
      for(int level = numberOfLevels-1; level>=0; level --) {
        String levelDescriptor = levels.get(level);
        for(int index = 0; index < numberOfStacks; index++) {
          String itemString = levelDescriptor.substring(0,3);
          if(itemString.contains("[")) {
            result.get(index).addItem(itemString.charAt(1));
          }
          if(levelDescriptor.length() > 3) {
            levelDescriptor = levelDescriptor.substring(4);
          }
        }
      }

    }
    return result;
  }
}
