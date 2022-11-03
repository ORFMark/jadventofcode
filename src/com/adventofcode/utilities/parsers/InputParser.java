package com.adventofcode.utilities.parsers;

import java.util.List;

public interface InputParser<INPUT_TYPE> {

  List<INPUT_TYPE> splitInputIntoElements(String problemInput);
}
