package com.adventofcode.problems.twentyone.daythree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryDiagnosticUtilitiesTest {

    @Test
    void testBasic() {
        String example = """
                00100
                """;
        List<BinaryPositions> parseInput = new BinaryDiagnosticUtilities().parseInput(example);
        assertEquals(new BinaryPositions("00100"), parseInput.get(0));
    }

    final String webExample = """
            00100
            11110
            10110
            10111
            10101
            01111
            00111
            11100
            10000
            11001
            00010
            01010""";
    @Test
    void testPart1WebExample() {
        List<BinaryPositions> parsedInput = new BinaryDiagnosticUtilities().parseInput(webExample);
        assertEquals(9, BinaryDiagnosticUtilities.calculateEpsilon(parsedInput));
        assertEquals(22, BinaryDiagnosticUtilities.calculateGamma(parsedInput));
    }

    @Test
    void testO2RatingWithEqualBits() {
        String input = """
                10111
                10110
                """;
        List<BinaryPositions> parsedInput = new BinaryDiagnosticUtilities().parseInput(input);
        assertEquals(23, BinaryDiagnosticUtilities.calculateO2Rating(parsedInput));
    }

    @Test
    void testO2RatingWithLast2Different() {
        String input = """
                10111
                10101
                10110
                """;
        List<BinaryPositions> parsedInput = new BinaryDiagnosticUtilities().parseInput(input);
        assertEquals(23, BinaryDiagnosticUtilities.calculateO2Rating(parsedInput));
    }

    @Test
    void testO2RatingWithLast3Different() {
        String input = """
                10000
                10111
                10101
                10110
                """;
        List<BinaryPositions> parsedInput = new BinaryDiagnosticUtilities().parseInput(input);
        assertEquals(23, BinaryDiagnosticUtilities.calculateO2Rating(parsedInput));
    }

    @Test
    void testO2RatingWithLast4Different() {
        String input = """
                11110
                10000
                10111
                11100
                10101
                10110
                11001
                """;
        List<BinaryPositions> parsedInput = new BinaryDiagnosticUtilities().parseInput(input);
        assertEquals(23, BinaryDiagnosticUtilities.calculateO2Rating(parsedInput));
    }

    @Test
    void testPart2WebExample() {
        List<BinaryPositions> parsedInput = new BinaryDiagnosticUtilities().parseInput(webExample);
        assertEquals(23, BinaryDiagnosticUtilities.calculateO2Rating(parsedInput));
        assertEquals(10, BinaryDiagnosticUtilities.calculateCO2Rating(parsedInput));
    }

}