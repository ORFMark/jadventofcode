package com.adventofcode.utilities.datastructures;

import com.adventofcode.utilities.general.datastructures.CartesianCoordinate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartesianCoordinateTest {

  @Test
  void dataTest() {
    CartesianCoordinate coordPair = new CartesianCoordinate(0, 1);
    assertEquals(1, coordPair.getY());
    assertEquals(0, coordPair.getX());
    coordPair.setX(4);
    coordPair.setY(6);
    assertEquals(4, coordPair.getX());
    assertEquals(6, coordPair.getY());
    CartesianCoordinate compPair = new CartesianCoordinate(4, 6);
    assertEquals(coordPair, compPair);
    assertNotSame(compPair, coordPair);
  }

  @Test
  void cloneTest() {
    CartesianCoordinate coordPair = new CartesianCoordinate(0, 1);
    CartesianCoordinate clone = coordPair.clone();
    assertNotSame(coordPair, clone);
    assertEquals(coordPair, clone);
  }

  @Test
  void diagnoalAdjacenyAdjacentTest() {
    CartesianCoordinate coordinate = new CartesianCoordinate(0, 1);
    for (int x = 0; x <= 1; x++) {
      for (int y = 0; y <= 1; y++) {
        CartesianCoordinate coordinateToCompare = new CartesianCoordinate(x, y);
        assertTrue(coordinate.isAdjacentTo(coordinateToCompare, true));
      }
    }
  }

  @Test
  void diagnoalAdjacenyNotAdjacentTest() {
    CartesianCoordinate coordinate = new CartesianCoordinate(0, 1);
    for (int x = 2; x <= 10; x++) {
      for (int y = 2; y <= 10; y++) {
        CartesianCoordinate coordinateToCompare = new CartesianCoordinate(x, y);
        assertFalse(coordinate.isAdjacentTo(coordinateToCompare, true));
      }
    }
  }

  @Test
  void linearAdjacenyAdjacentTest() {
    CartesianCoordinate testCoordinate = new CartesianCoordinate(2, 3);
    for (int x = 1; x <= 3; x++) {
      CartesianCoordinate newCoordinate = new CartesianCoordinate(x, 3);
      assertTrue(testCoordinate.isAdjacentTo(newCoordinate, false));
    }
    for (int y = 2; y <= 4; y++) {
      CartesianCoordinate newCoordinate = new CartesianCoordinate(2, 4);
      assertTrue(testCoordinate.isAdjacentTo(newCoordinate, false));
    }
  }

  @Test
  void linearAdjacenyNotAdjacentTest() {
    CartesianCoordinate cartesianCoordinate = new CartesianCoordinate(1, 1);
    assertFalse(cartesianCoordinate.isAdjacentTo(new CartesianCoordinate(2, 2), false));
  }

  @Test
  void manhattanDistanceTest() {
    CartesianCoordinate testCoordiate = new CartesianCoordinate(0, 0);
    assertEquals(4, testCoordiate.manhattanDistanceFrom(new CartesianCoordinate(2, 2)));
  }

  @Test
  void linearDistanceTest() {
    CartesianCoordinate testCoordiate = new CartesianCoordinate(0, 0);
    CartesianCoordinate distantCoordiante = new CartesianCoordinate(2, 2);
    Double distance = testCoordiate.linearDistanceFrom(distantCoordiante);
    assertTrue(distance >= Math.sqrt(8) - 0.001 && distance <= Math.sqrt(8) + 0.001);
  }

  @Test
  void copyConstructorTest() {
    CartesianCoordinate baseCoordinate = new CartesianCoordinate(1,1);
    CartesianCoordinate copyCoordinate = new CartesianCoordinate(baseCoordinate);
    assertNotSame(baseCoordinate,copyCoordinate);
    assertEquals(baseCoordinate,copyCoordinate);
  }
}

