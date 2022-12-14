package com.adventofcode.problems.twentytwo.day8;

import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

import java.util.List;

public class TreeTopHousePart1 extends InsturmentedProblem {

    private static final String PROBLEM_NAME = "Tree Top House";
    private static final int YEAR = 2022;
    private static final int DAY = 8;
    private static final int PART = 1;
    @Override
    public String run(String input) {
        List<Grove> groves = new GroveParser().splitInputIntoElements(input, "\n\n");
        return Integer.toString(groves.get(0).computeNumberOfVisualTrees());
    }

    @Override
    public String getIdentifer() {
        return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
    }
}
