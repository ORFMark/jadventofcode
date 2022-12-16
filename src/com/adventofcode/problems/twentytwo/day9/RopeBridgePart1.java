package com.adventofcode.problems.twentytwo.day9;

import com.adventofcode.utilities.general.datastructures.ComputeableSet;
import com.adventofcode.utilities.general.datastructures.CoordPair;
import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

import java.util.List;

public class RopeBridgePart1 extends InsturmentedProblem {
  private static final String PROBLEM_NAME = "RopeBridge";
  private static final int YEAR = 2022;
  private static final int DAY = 9;
  private static final int PART = 1;

  ComputeableSet<CoordPair> tailVistedPoints = new ComputeableSet();
  CoordPair headPos = new CoordPair(0,0);
  CoordPair tailPos = headPos.clone();

  @Override
  public String run(String input) {
    List<RopeMotion> motionInstructions = new RopeMotionParser().splitInputIntoElements(input);
    tailVistedPoints.add(tailPos.clone());
    for(RopeMotion motion : motionInstructions) {
      for (int moves = 0; moves < motion.getDistance(); moves++) {
        CoordPair oldHeadPos = headPos.clone();
        makeMove(motion.getDirection(), headPos);
        if(!isTouching()) {
          tailPos = oldHeadPos;
        }
        tailVistedPoints.add(tailPos.clone());
      }
    }
    return Integer.toString(tailVistedPoints.size());
  }

  private boolean isTouching() {
    return (Math.abs(headPos.getX() - tailPos.getX()) <= 1 && Math.abs(headPos.getY() - tailPos.getY()) <= 1);
  }

  private void makeMove(char direc, CoordPair coordPairToMove) {
    switch (direc) {
      case 'R' -> moveRight(coordPairToMove);
      case 'L' -> moveLeft(coordPairToMove);
      case 'U' -> moveUp(coordPairToMove);
      case 'D' -> moveDown(coordPairToMove);
      default -> throw new IllegalArgumentException();
    }
  }
  private void moveLeft(CoordPair coordPair) {
    coordPair.setX(coordPair.getX()-1);
  }
  private void moveRight(CoordPair coordPair) {
    coordPair.setX(coordPair.getX()+1);
  }
  private void moveUp(CoordPair coordPair) {
    coordPair.setY(coordPair.getY()+1);
  }
  private void moveDown(CoordPair coordPair) {
    coordPair.setY(coordPair.getY()-1);
  }
  @Override
  public String getIdentifer() {
    return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
  }
}
