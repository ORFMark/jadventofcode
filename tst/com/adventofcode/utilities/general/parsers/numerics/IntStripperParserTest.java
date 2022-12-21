package com.adventofcode.utilities.general.parsers.numerics;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class IntStripperParserTest {

  private static final String TEST_INPUT="arerare12*++_\naredeg9maera02\n";
  @Test
  void splitInputIntoElements() {
    List<Optional<List<Integer>>> result = new IntStripperParser().splitInputIntoElements(TEST_INPUT,"\n");
    assertEquals(2, result.size());
    assertTrue(result.get(0).isPresent());
    assertEquals(1, result.get(0).get().size());
    assertEquals(12, result.get(0).get().get(0));
    assertTrue(result.get(1).isPresent());
    assertEquals(2, result.get(1).get().size());
    assertEquals(9, result.get(1).get().get(0));
    assertEquals(2, result.get(1).get().get(1));
  }
}