package com.adventofcode.problems.twentytwo.day2;

import com.adventofcode.utilities.general.diagnostics.DiagnosticStringGenerator;
import com.adventofcode.utilities.general.diagnostics.DiagnosticsConstants;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

import java.util.List;

public class RockPaperScissorsPart2 extends InsturmentedProblem {

    private static final String PROBLEM_NAME = "";
    private static final int YEAR = 2022;
    private static final int DAY = 2;
    private static final int PART = 2;
    @Override
    public String run(String input) {
        List<RockPaperScissorsRound> strategyGuide= new RockPaperScissiorsPart2RoundParser().splitInputIntoElements(input, "\n");
        int totalScore = 0;
        for(RockPaperScissorsRound round : strategyGuide) {
            totalScore += round.getPlayerScore();
        }
        return Integer.toString(totalScore);
    }

    @Override
    public String getIdentifer() {
        return DiagnosticStringGenerator.generateIDString(DiagnosticsConstants.AUTHOR, PROBLEM_NAME, YEAR, DAY, PART);
    }
}
