package com.adventofcode.problems.twentyone.daytwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivePart1Test {

    final String websiteExampleString = """
forward 5
down 5
forward 8
up 3
down 8
forward 2
            """;
    DivePart1 tester = new DivePart1();
    @Test
    void runWebsiteExample() {
        assertEquals("150", tester.run(websiteExampleString));
    }

}