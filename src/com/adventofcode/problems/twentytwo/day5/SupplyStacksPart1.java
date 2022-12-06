package com.adventofcode.problems.twentytwo.day5;

import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.List;

public class SupplyStacksPart1 extends InsturmentedProblem {

    private static final String PROBLEM_NAME = "SupplyStacks";
    private static final int YEAR = 2022;
    private static final int DAY = 5;
    private static final int PART = 1;
    @Override
    public String run(String input) {
        StringInputParser inputSplitter = new StringInputParser();
        List<String> dividedInput = inputSplitter.splitInputIntoElements(input, "\n\n");
        for(String split : dividedInput) {
            System.out.println("\n_______\n" + split);
        }
        return null;
    }

    @Override
    public String getIdentifer() {
        return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
    }
}
