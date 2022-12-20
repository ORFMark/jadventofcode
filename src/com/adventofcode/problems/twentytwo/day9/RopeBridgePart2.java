package com.adventofcode.problems.twentytwo.day9;

import com.adventofcode.utilities.general.datastructures.CartesianCoordinate;
import com.adventofcode.utilities.general.datastructures.ComputeableSet;
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
  ComputeableSet<CartesianCoordinate> tailVistedPoints = new ComputeableSet();
  CartesianCoordinate[] knots = new CartesianCoordinate[NUMBER_OF_KNOTS];
  private static final int TAIL_INDEX = NUMBER_OF_KNOTS-1;
  @Override
  public String run(String input) {
    List<RopeMotion> motionInstructions = new RopeMotionParser().splitInputIntoElements(input);
    for(int knotNumber = 0; knotNumber < NUMBER_OF_KNOTS; knotNumber++) {
      knots[knotNumber] = new CartesianCoordinate(0,0);
    }
    tailVistedPoints.add(knots[TAIL_INDEX].clone());

    for(RopeMotion motion : motionInstructions) {
        for(int knotNumber = 0; knotNumber < NUMBER_OF_KNOTS; knotNumber++) {
         if(knotNumber == 0) {
           RopeUtilities.makeMove(motion.getDirection(), knots[knotNumber],motion.getDistance());
         } else {
           if(!RopeUtilities.isTouching(knots[knotNumber-1], knots[knotNumber])) {
             int xdiff = knots[knotNumber-1].getX() - knots[knotNumber].getX();
             int ydiff = knots[knotNumber-1].getY() - knots[knotNumber].getY();
             knots[knotNumber].setX(knots[knotNumber].getX()+xdiff);
             knots[knotNumber].setY(knots[knotNumber].getY()+ydiff);
           }
         }
        }
        tailVistedPoints.add(knots[TAIL_INDEX].clone());
      }
    System.out.println(tailVistedPoints);
   return Integer.toString(tailVistedPoints.size());
  }





  @Override
  public String getIdentifer() {
    return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
  }
}
