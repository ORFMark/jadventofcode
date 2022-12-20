package com.adventofcode.problems.twentytwo.day9;

import com.adventofcode.utilities.general.datastructures.CartesianCoordinate;

public class RopeUtilities {

  public static void moveLeft(CartesianCoordinate coordPair, int distance) {
    coordPair.setX(coordPair.getX()-distance);
  }
  public static void moveRight(CartesianCoordinate coordPair, int distance) {
    coordPair.setX(coordPair.getX()+distance);
  }
  public static void moveUp(CartesianCoordinate coordPair, int distance) {
    coordPair.setY(coordPair.getY()+distance);
  }
  public static void moveDown(CartesianCoordinate coordPair, int distance) {
    coordPair.setY(coordPair.getY()-distance);
  }

  public static boolean isTouching(CartesianCoordinate o1, CartesianCoordinate o2) {
    return o1.isAdjacentTo(o2, true);
  }

  public static void makeMove(char direc, CartesianCoordinate coordPairToMove, int distance) {
    switch (direc) {
      case 'R' -> moveRight(coordPairToMove, distance);
      case 'L' -> moveLeft(coordPairToMove, distance);
      case 'U' -> moveUp(coordPairToMove, distance);
      case 'D' -> moveDown(coordPairToMove, distance);
      default -> throw new IllegalArgumentException();
    }
  }
}
