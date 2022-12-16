package com.adventofcode.problems.twentytwo.day5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoxStackParserTest {

  private static final String EXAMPLE_INPUT = "    [D]    \n" +
          "[N] [C]    \n" +
          "[Z] [M] [P]\n" +
          " 1   2   3 ";
  @Test
  void splitInputIntoElements() {
    BoxStackParser boxStackParser = new BoxStackParser();
    List<BoxStack> boxStacks = boxStackParser.splitInputIntoElements(EXAMPLE_INPUT, "\n\n");
    assertEquals(3, boxStacks.size());
  }
}