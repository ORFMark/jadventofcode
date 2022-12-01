package com.adventofcode.problems.twentytwo.day1.parser;

import com.adventofcode.problems.twentytwo.day1.data.ElfBackpack;
import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.numerics.IntegerInputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.LinkedList;
import java.util.List;

public class ElfBackpackParser implements InputParser<ElfBackpack> {
  @Override
  public List<ElfBackpack> splitInputIntoElements(String problemInput, String deliminatorRegex) {
    List<String> dirtyInput = new StringInputParser().splitInputIntoElements(problemInput, "\n\n");
    IntegerInputParser backpackParser = new IntegerInputParser();
    List<ElfBackpack> elves = new LinkedList<>();
    for(String backpack : dirtyInput) {
      if(!backpack.isEmpty()) {
        List<Integer> food = backpackParser.splitInputIntoElements(backpack, "\n");
        ElfBackpack currentElfBackpack = new ElfBackpack();
        for(int item : food) {
          currentElfBackpack.addItem(item);
        }
        elves.add(currentElfBackpack);
      }
    }
    return elves;
  }
}
