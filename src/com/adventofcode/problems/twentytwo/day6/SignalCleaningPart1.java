package com.adventofcode.problems.twentytwo.day6;

import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

public class SignalCleaningPart1 extends InsturmentedProblem {

    private static final String PROBLEM_NAME = "Signal Cleaning";
    private static final int YEAR = 2022;
    private static final int DAY = 6;
    private static final int PART = 1;

    @Override
    public String run(String input) {
        Signal sig = new Signal(input);
        return Integer.toString(sig.getIndexOfStartOfPacket());
    }

    @Override
    public String getIdentifer() {
        return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
    }
}
