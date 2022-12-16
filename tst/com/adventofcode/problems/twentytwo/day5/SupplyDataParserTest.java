package com.adventofcode.problems.twentytwo.day5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SupplyDataParserTest {

  private static final String EXAMPLE_INPUT = "    [D]    \n" +
          "[N] [C]    \n" +
          "[Z] [M] [P]\n" +
          " 1   2   3 \n" +
          "\n" +
          "move 1 from 2 to 1\n" +
          "move 3 from 1 to 3\n" +
          "move 2 from 2 to 1\n" +
          "move 1 from 1 to 2";

  @Test
  void splitInputIntoElements() {
    List<SupplyData> testData= new SupplyDataParser().splitInputIntoElements(EXAMPLE_INPUT, "\n\n\n");
    assertEquals(1, testData.size());
    assertEquals(3, testData.get(0).getBoxStacks().size());
    assertEquals(4, testData.get(0).getInstructions().size());
  }
}