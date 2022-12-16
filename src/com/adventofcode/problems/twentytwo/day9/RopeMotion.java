package com.adventofcode.problems.twentytwo.day9;

import java.util.ArrayList;
import java.util.List;

public class RopeMotion {
  private final char direction;
  private final int distance;

  private static final String VALID_DIRECTIONS = "RLUD";
  public RopeMotion(char direction, int distance) {
    if(VALID_DIRECTIONS.contains(Character.toString(direction))) {
      this.direction = direction;
    } else {
      throw new IllegalArgumentException();
    }
    this.distance = distance;
  }

  public char getDirection() {
    return direction;
  }

  public int getDistance() {
    return distance;
  }

}
