package com.adventofcode.problems.twentyone.daytwo;


import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

import java.util.List;

public class DivePart1 extends InsturmentedProblem {

    public String run(String input) {
        int depth = 0;
        int dist = 0;
        List<Direction> parsedInput= DiveUtilities.parseInput(input);
        for (Direction dirct : parsedInput) {
            switch (dirct.getDirection()) {
                case "forward" -> dist += dirct.getDistance();
                case "up" -> depth -= dirct.getDistance();
                case "down" -> depth += dirct.getDistance();
            }
        }
        return Integer.toString(depth*dist);
    }
}
