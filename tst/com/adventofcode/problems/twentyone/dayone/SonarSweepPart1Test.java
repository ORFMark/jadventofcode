package com.adventofcode.problems.twentyone.dayone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SonarSweepPart1Test {

    SonarSweepPart1 tester = new SonarSweepPart1();

    @Test
    public void testBasicFromWebsite() {
        String testInput = """
                199
                200
                208
                210
                200
                207
                240
                269
                260
                263""";
        assertEquals("7", tester.run(testInput));
    }

}