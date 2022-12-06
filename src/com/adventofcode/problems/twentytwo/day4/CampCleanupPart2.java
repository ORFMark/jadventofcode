package com.adventofcode.problems.twentytwo.day4;

import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

import java.util.List;

public class CampCleanupPart2 extends InsturmentedProblem {

    private static final String PROBLEM_NAME = "CampCleanup";
    private static final int YEAR = 2022;
    private static final int DAY = 4;
    private static final int PART = 2;
    @Override
    public String run(String input) {
        List<CleaningPair> assignments = new CleaningPairParser().splitInputIntoElements(input, "\n");
        int answer = 0;
        for(CleaningPair pair : assignments) {
            if(pair.getOverlappingSections().isPresent()) {
                answer++;
            }
        }
        return Integer.toString(answer);
    }

    @Override
    public String getIdentifer() {
        return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
    }
}
