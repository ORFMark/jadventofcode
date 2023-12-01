package com.adventofcode.problems.twentythree.dayone;

import java.util.List;

import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;
import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

public class TrebuchetPart1 extends InsturmentedProblem {

    private static final String PROBLEM_NAME = "Trebuchet";
    private static final int YEAR = 2023;
    private static final int DAY = 1;
    private static final int PART = 1;
    @Override
    public String run(String input) {
        InputParser<String> parser = new StringInputParser();
        List<String> lines = parser.splitInputIntoElements(input);
        int calibrationSum = 0;
        for (String line : lines) {
            calibrationSum += processLine(line);
        }
        return Integer.toString(calibrationSum);
    }

    public int processLine(String line ) {
        char firstInt = 0;
        char lastInt = 0;
        for(char c : line.toCharArray()) {
            if(Character.isDigit(c)) {
                if(firstInt == 0) {
                    firstInt = c;
                }
                lastInt = c;
            }
        }
        String result = String.valueOf(firstInt) + lastInt;
        return Integer.parseInt(result);
    }
    @Override
    public String getIdentifer() {
        return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
    }
}
