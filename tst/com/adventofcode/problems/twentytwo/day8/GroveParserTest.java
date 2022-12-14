package com.adventofcode.problems.twentytwo.day8;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroveParserTest {

  private static final String EXAMPLE_INPUT = """
          30373
          25512
          65332
          33549
          35390""";

  @Test
  void testParsing() {
    List<Grove> grove = new GroveParser().splitInputIntoElements(EXAMPLE_INPUT, "\n\n");
    assertEquals(1, grove.size());
    assertEquals(25, grove.get(0).getNumberOfTrees());
    assertEquals(5, grove.get(0).getTreeHeight(3,2));
  }

}