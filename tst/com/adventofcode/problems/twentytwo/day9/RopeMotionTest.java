package com.adventofcode.problems.twentytwo.day9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RopeMotionTest {

  @Test
  void ropeMotionTest() {
    RopeMotion testMotion = new RopeMotion('R', 4);
    assertEquals('R', testMotion.getDirection());
    assertEquals(4, testMotion.getDistance());
  }

}