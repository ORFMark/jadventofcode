package com.adventofcode.problems.twentytwo.day3;

import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.LinkedList;
import java.util.List;

public class RucksackParser implements InputParser<Rucksack> {
  @Override
  public List<Rucksack> splitInputIntoElements(String problemInput, String deliminatorRegex) {
    List<Rucksack> rucksacks = new LinkedList<>();
    List<String> rucksackDescriptionStrings = new StringInputParser().splitInputIntoElements(problemInput, deliminatorRegex);
    for (String rawRucksack : rucksackDescriptionStrings) {
      rucksacks.add(RucksackFactory.buildRucksack(rawRucksack));
    }
    return rucksacks;
  }
}
