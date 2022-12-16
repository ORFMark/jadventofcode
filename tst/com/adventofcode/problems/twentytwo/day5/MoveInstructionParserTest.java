package com.adventofcode.problems.twentytwo.day5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoveInstructionParserTest {

  private static final String EXAMPLE_INSTRUCTION_LIST = "move 1 from 2 to 1\n" +
          "move 3 from 1 to 3\n" +
          "move 2 from 2 to 1\n" +
          "move 1 from 1 to 2";

  @Test
  void testParse() {
    MoveInstructionParser instructionParser = new MoveInstructionParser();
    List<MoveInstruction> result= instructionParser.splitInputIntoElements(EXAMPLE_INSTRUCTION_LIST);
    assertEquals(4, result.size());
    assertEquals(1, result.get(0).getNumberOfBoxesToMove());
    assertEquals(2, result.get(0).getSourceStackId());
    assertEquals(1, result.get(0).getDestinationStackId());

  }

}