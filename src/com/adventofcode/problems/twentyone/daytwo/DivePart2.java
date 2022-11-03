package com.adventofcode.problems.twentyone.daytwo;

import com.adventofcode.problems.Problem;

import java.util.List;

public class DivePart2 implements Problem {

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
