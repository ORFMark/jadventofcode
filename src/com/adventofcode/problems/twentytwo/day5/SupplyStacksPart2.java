package com.adventofcode.problems.twentytwo.day5;

import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

import java.util.List;

public class SupplyStacksPart2 extends InsturmentedProblem {

    private static final String PROBLEM_NAME = "SupplyStacks";
    private static final int YEAR = 2022;
    private static final int DAY = 5;
    private static final int PART = 2;
    @Override
    public String run(String input) {
        List<SupplyData> data = new SupplyDataParser().splitInputIntoElements(input, "\n\n\n");
        for(SupplyData supplyData : data) {
            supplyData.executeInstructions(true);
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
