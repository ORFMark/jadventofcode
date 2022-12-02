package com.adventofcode.problems.twentytwo.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RockPaperScissorsPart1Test {

    String TEST_INPUT = """
            A Y
            B X
            C Z""";


    @Test
    void run() {
        assertEquals("15", new RockPaperScissorsPart1().run(TEST_INPUT));
    }
}