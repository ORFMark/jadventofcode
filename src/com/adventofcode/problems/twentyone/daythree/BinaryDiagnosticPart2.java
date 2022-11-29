package com.adventofcode.problems.twentyone.daythree;


import com.adventofcode.problems.InsturmentedProblem;

import java.util.List;


public class BinaryDiagnosticPart2 extends InsturmentedProblem {
    public String run(String input) {
        List<BinaryPositions> parsedInput = new BinaryDiagnosticUtilities().parseInput(input);
        int o2 = BinaryDiagnosticUtilities.calculateO2Rating(parsedInput);
        int co2 = BinaryDiagnosticUtilities.calculateCO2Rating(parsedInput);
        return Integer.toString(o2 * co2);

    }
}
