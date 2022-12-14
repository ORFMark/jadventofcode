package com.adventofcode.problems.twentytwo.day8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GroveTest {



  @Test
  void setTreeHeight() {
    Grove grove = new Grove(2,2);
    grove.setTreeHeight(2, 0,0);
    grove.setTreeHeight(3,1,0);
    grove.setTreeHeight(4, 0, 1);
    grove.setTreeHeight(5,1,1);
    assertEquals(2, grove.getTreeHeight(0,0));
  }

  @Test
  void testToString() {
    Grove grove = new Grove(2,2);
    grove.setTreeHeight(2, 0,0);
    grove.setTreeHeight(3,1,0);
    grove.setTreeHeight(4, 0, 1);
    grove.setTreeHeight(5,1,1);
    String expectedOut = "24\n35\n";
    assertEquals(expectedOut, grove.toString());
  }
}