package com.adventofcode.problems.twentyone.daythree;

import com.adventofcode.problems.InsturmentedProblem;

import java.util.List;

public class BinaryDiagnosticPart1 extends InsturmentedProblem {
    public String run(String input) {
        List<BinaryPositions> parsedInput = new BinaryDiagnosticUtilities().parseInput(input);
        int epsilon = BinaryDiagnosticUtilities.calculateEpsilon(parsedInput);
        int gamma = BinaryDiagnosticUtilities.calculateGamma(parsedInput);
        return Integer.toString(gamma * epsilon);

    }
}
