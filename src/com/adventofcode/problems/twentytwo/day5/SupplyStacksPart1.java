package com.adventofcode.problems.twentytwo.day5;

import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.List;
import java.util.Stack;

public class SupplyStacksPart1 extends InsturmentedProblem {

    private static final String PROBLEM_NAME = "SupplyStacks";
    private static final int YEAR = 2022;
    private static final int DAY = 5;
    private static final int PART = 1;
    @Override
    public String run(String input) {
        List<SupplyData> data = new SupplyDataParser().splitInputIntoElements(input, "\n\n\n");
        for(SupplyData supplyData : data) {
            supplyData.executeInstructions(false);
            StringBuilder result = new StringBuilder();
            for(BoxStack stack : supplyData.getBoxStacks()) {
                result.append(stack.pop());
            }
            if(result.toString().length() == supplyData.getBoxStacks().size()) {
                return result.toString();
            }
        }
        return "";
    }

    @Override
    public String getIdentifer() {
        return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
    }
}
