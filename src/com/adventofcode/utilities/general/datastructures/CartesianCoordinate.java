package com.adventofcode.utilities.general.datastructures;

import java.util.Objects;

public class CartesianCoordinate implements Cloneable {


  public CartesianCoordinate(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public CartesianCoordinate(CartesianCoordinate coordinateToCopy) {
    this.x = coordinateToCopy.getX();
    this.y = coordinateToCopy.getY();
  }

  private int x;
  private int y;

  @Override
  public boolean equals(Object o) {
    if(o instanceof CartesianCoordinate coordPair) {
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
  public CartesianCoordinate clone() {
    try {
      CartesianCoordinate clone = (CartesianCoordinate) super.clone();
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

  public double linearDistanceFrom(CartesianCoordinate coordinateToCompare) {
    double xdiff = (double) this.getX()-coordinateToCompare.getX();
    double ydiff = (double) this.getY()-coordinateToCompare.getY();
    return Math.sqrt(xdiff * xdiff + ydiff * ydiff);
  }

  public int manhattanDistanceFrom(CartesianCoordinate coordinateToCompare) {
    int xdiff = Math.abs(this.getX() - coordinateToCompare.getX());
    int ydiff = Math.abs(this.getY() - coordinateToCompare.getY());
    return xdiff+ydiff;
  }

  public boolean isAdjacentTo(CartesianCoordinate coordinateToCompare, boolean isDiagonalAdjacenyValid) {
    if(!isDiagonalAdjacenyValid) {
      return this.manhattanDistanceFrom(coordinateToCompare) <= 1.0;
    } else {
      return (Math.abs(this.getX() - coordinateToCompare.getX()) <= 1 && Math.abs(this.getY() - coordinateToCompare.getY()) <= 1);
    }
  }
}
