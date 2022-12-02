package com.adventofcode.problems.twentytwo.day2;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RockPaperScissiorsPart2RoundParserTest {

    String TEST_INPUT = """
            A Y
            B X
            C Z""";

    @Test
    void splitInputIntoElements() {
        List<RockPaperScissorsRound> roundList = new RockPaperScissiorsPart2RoundParser().splitInputIntoElements(TEST_INPUT, "\n");
        assertEquals(4, roundList.get(0).getPlayerScore());
        assertEquals(1, roundList.get(1).getPlayerScore());
        assertEquals(7, roundList.get(2).getPlayerScore());
    }
}