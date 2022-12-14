package com.adventofcode.problems.twentyone.daytwo;


import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

import java.util.List;

public class DivePart2 extends InsturmentedProblem {

    public String run(String input) {
        int depth = 0;
        int dist = 0;
        int aim = 0;
        List<Direction> parsedInput= DiveUtilities.parseInput(input);
        for (Direction dirct : parsedInput) {
            switch (dirct.getDirection()) {
                case "forward" -> {
                    dist += dirct.getDistance();
                    depth += aim * dirct.getDistance();
                }
                case "up" -> aim -= dirct.getDistance();
                case "down" -> aim += dirct.getDistance();
            }
        }
        return Integer.toString(depth*dist);
    }
}
