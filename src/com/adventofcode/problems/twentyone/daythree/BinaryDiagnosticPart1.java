package com.adventofcode.problems.twentyone.daythree;

import com.adventofcode.problems.Problem;

import java.util.List;

public class BinaryDiagnosticPart1 implements Problem {
    public String run(String input) {
        List<BinaryPositions> parsedInput = new BinaryDiagnosticUtilities().parseInput(input);
        int epsilon = BinaryDiagnosticUtilities.calculateEpsilon(parsedInput);
        int gamma = BinaryDiagnosticUtilities.calculateGamma(parsedInput);
        return Integer.toString(gamma * epsilon);

    }
}
