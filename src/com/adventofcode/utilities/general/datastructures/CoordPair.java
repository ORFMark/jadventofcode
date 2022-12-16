package com.adventofcode.utilities.general.datastructures;

import java.util.Objects;

public class CoordPair implements Cloneable {


  public CoordPair(int x, int y) {
    this.x = x;
    this.y = y;
  }

  private int x;
  private int y;

  @Override
  public boolean equals(Object o) {
    if(o instanceof CoordPair coordPair) {
      return coordPair.getX() == this.getX() && coordPair.getY() == this.getY();
    } else {
      return false;
    }
  }


  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public CoordPair clone() {
    try {
      CoordPair clone = (CoordPair) super.clone();
      clone.setX(x);
      clone.setY(y);
      return clone;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  @Override
  public String toString() {
    return String.format("{%d,%d}", x, y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x,y);
  }
}
