package com.adventofcode.utilities.general.parsers;

import java.util.List;

public interface InputParser<INPUT_TYPE> {

  /**
   * Splits a given string into a list of elements, where the divider is a new line
   * @param problemInput
   * @return
   */
  default List<INPUT_TYPE> splitInputIntoElements(String problemInput) {
    return splitInputIntoElements(problemInput, "\n");
  }

  /**
   * splits a string into a list of elements based on an arbitrary deliminator
   * @param problemInput
   * @param deliminatorRegex a regular expression that represents the divider between elements
   * @return a list of objects
   */
  List<INPUT_TYPE> splitInputIntoElements(String problemInput, String deliminatorRegex);

}
