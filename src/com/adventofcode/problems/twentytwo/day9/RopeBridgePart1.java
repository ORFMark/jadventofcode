package com.adventofcode.problems.twentytwo.day9;

import com.adventofcode.utilities.general.datastructures.CartesianCoordinate;
import com.adventofcode.utilities.general.datastructures.ComputeableSet;
import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

import java.util.List;

public class RopeBridgePart1 extends InsturmentedProblem {
  private static final String PROBLEM_NAME = "RopeBridge";
  private static final int YEAR = 2022;
  private static final int DAY = 9;
  private static final int PART = 1;

  ComputeableSet<CartesianCoordinate> tailVistedPoints = new ComputeableSet();
  CartesianCoordinate headPos = new CartesianCoordinate(0,0);
  CartesianCoordinate tailPos = headPos.clone();

  @Override
  public String run(String input) {
    List<RopeMotion> motionInstructions = new RopeMotionParser().splitInputIntoElements(input);
    tailVistedPoints.add(tailPos.clone());
    for(RopeMotion motion : motionInstructions) {
      for (int moves = 0; moves < motion.getDistance(); moves++) {
        CartesianCoordinate oldHeadPos = headPos.clone();
        RopeUtilities.makeMove(motion.getDirection(), headPos, 1);
        if(!RopeUtilities.isTouching(headPos, tailPos)) {
          tailPos = oldHeadPos;
        }
        tailVistedPoints.add(tailPos.clone());
      }
    }
    return Integer.toString(tailVistedPoints.size());
  }
  @Override
  public String getIdentifer() {
    return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
  }
}
