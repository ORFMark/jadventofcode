package com.adventofcode.problems.twentyone.dayone;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SonarSweepPart2Test {

    SonarSweepPart2 tester = new SonarSweepPart2();

    @Test
    public void testBasicFromWebsite() {
        String websiteInput = """
                119
                200
                208
                210
                200
                207
                240
                269
                260
                263""";
        assertEquals("5", tester.run(websiteInput));
    }
}