package com.adventofcode.utilities.parsers;

import java.util.List;

public interface InputParser<INPUT_TYPE> {


  default List<INPUT_TYPE> splitInputIntoElements(String problemInput) {
    return splitInputIntoElements(problemInput, "\n");
  }


  List<INPUT_TYPE> splitInputIntoElements(String problemInput, String deliminatorRegex);



}
