package com.adventofcode.problems.twentytwo.day9;

import com.adventofcode.utilities.general.datastructures.ComputeableSet;
import com.adventofcode.utilities.general.datastructures.CoordPair;
import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

import java.util.List;

public class RopeBridgePart2 extends InsturmentedProblem {
  private static final String PROBLEM_NAME = "RopeBridge";
  private static final int YEAR = 2022;
  private static final int DAY = 9;
  private static final int PART = 2;

  private static final int NUMBER_OF_KNOTS = 10;
  ComputeableSet<CoordPair> tailVistedPoints = new ComputeableSet();
  CoordPair[] knots = new CoordPair[NUMBER_OF_KNOTS];

  @Override
  public String run(String input) {
    CoordPair prev = new CoordPair(0,0);
    for(int knot = 0; knot < NUMBER_OF_KNOTS; knot++){
      knots[knot] = new CoordPair(0,0);
    }
    List<RopeMotion> motionInstructions = new RopeMotionParser().splitInputIntoElements(input);
    tailVistedPoints.add(knots[NUMBER_OF_KNOTS-1].clone());
    for(RopeMotion motion : motionInstructions) {
      for (int moves = 0; moves < motion.getDistance(); moves++) {
        for(int knot = 0; knot < NUMBER_OF_KNOTS; knot++) {
          CoordPair temp = knots[knot];
          if(knot == 0) {
            makeMove(motion.getDirection(), knots[knot]);
            System.out.println(String.format("Knot %d is moving! new pos %s", knot, knots[knot].toString()));
          } else {
            if(!isTouching(knots[knot-1], knots[knot])) {
              knots[knot] = prev;
              System.out.println(String.format("Knot %d is moving! new pos %s", knot, knots[knot].toString()));
            } else {
              System.out.println(String.format("Knot %d is not moving, staying at %s", knot, knots[knot]));
              break;
            }
          }

        }
        System.out.println("__________");
        tailVistedPoints.add(knots[NUMBER_OF_KNOTS-1]);
      }
    }
    return Integer.toString(tailVistedPoints.size());
  }

  private boolean isTouching(CoordPair o1, CoordPair o2) {
    return (Math.abs(o1.getX() - o2.getX()) <= 1 && Math.abs(o1.getY() - o2.getY()) <= 1);
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
