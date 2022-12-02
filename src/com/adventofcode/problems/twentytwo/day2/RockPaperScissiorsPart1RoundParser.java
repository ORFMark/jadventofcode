package com.adventofcode.problems.twentytwo.day2;

import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.LinkedList;
import java.util.List;

public class RockPaperScissiorsPart1RoundParser implements InputParser<RockPaperScissorsRound> {

    @Override
    public List<RockPaperScissorsRound> splitInputIntoElements(String problemInput, String deliminatorRegex) {
        List<String> roundStringList = new StringInputParser().splitInputIntoElements(problemInput, deliminatorRegex);
        List<RockPaperScissorsRound> roundList = new LinkedList<>();
        for(String round : roundStringList) {
            roundList.add(new RockPaperScissorsRound(round, 1));
        }
        return roundList;
    }
}
