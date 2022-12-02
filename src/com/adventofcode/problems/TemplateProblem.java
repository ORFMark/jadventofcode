package com.adventofcode.problems;

import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

public class TemplateProblem extends InsturmentedProblem {

    private static final String PROBLEM_NAME = "";
    private static final int YEAR = -1;
    private static final int DAY = -1;
    private static final int PART = -1;
    @Override
    public String run(String input) {
        return null;
    }

    @Override
    public String getIdentifer() {
        return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
    }
}
