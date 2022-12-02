package com.adventofcode.problems.twentytwo.day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RockPaperScissorsPart2Test {

    String TEST_INPUT = """
            A Y
            B X
            C Z""";


    @Test
    void run() {
        assertEquals("12", new RockPaperScissorsPart2().run(TEST_INPUT));
    }
}