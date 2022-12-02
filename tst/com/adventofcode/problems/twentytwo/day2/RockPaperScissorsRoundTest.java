package com.adventofcode.problems.twentytwo.day2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsRoundTest {

    RockPaperScissorsRound testRound;
    @BeforeEach
    void setUp() {
        testRound = new RockPaperScissorsRound("A Y", 1);
    }

    @Test
    void getPlayerScore() {
        assertEquals(8, testRound.getPlayerScore());
    }

    @Test
    void getOpponentScore() {
        assertEquals(1, testRound.getOpponentScore());
    }

    @Test
    void testDraw() {
        testRound = new RockPaperScissorsRound("A X", 1);
        assertEquals(testRound.getPlayerScore(), testRound.getOpponentScore());
    }

    @Test
    void testRound2() {
        testRound = new RockPaperScissorsRound("A Y", 2);
        assertEquals(4, testRound.getPlayerScore());
    }
}