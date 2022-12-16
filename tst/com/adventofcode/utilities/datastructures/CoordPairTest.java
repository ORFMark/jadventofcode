package com.adventofcode.utilities.datastructures;

import com.adventofcode.utilities.general.datastructures.CoordPair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoordPairTest {

  @Test
  void dataTest() {
    CoordPair coordPair = new CoordPair(0,1);
    assertEquals(1, coordPair.getY());
    assertEquals(0, coordPair.getX());
    coordPair.setX(4);
    coordPair.setY(6);
    assertEquals(4, coordPair.getX());
    assertEquals(6, coordPair.getY());
    CoordPair compPair = new CoordPair(4,6);
    assertEquals(coordPair, compPair);
    assertNotSame(compPair, coordPair);
  }

  @Test
  void cloneTest() {
    CoordPair coordPair = new CoordPair(0,1);
    CoordPair clone = coordPair.clone();
    assertNotSame(coordPair, clone);
    assertEquals(coordPair, clone);
  }
}