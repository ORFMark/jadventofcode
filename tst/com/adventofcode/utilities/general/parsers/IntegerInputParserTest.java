package com.adventofcode.utilities.general.parsers;

import com.adventofcode.utilities.general.parsers.numerics.IntegerInputParser;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IntegerInputParserTest {
    
    @Test
    void testNullString() {
        IntegerInputParser testParser = new IntegerInputParser();
        assertThrows(NullPointerException.class, () -> testParser.splitInputIntoElements(null));
    }
    
    @Test
    void testEmptyString() {
        IntegerInputParser testParser = new IntegerInputParser();
        List<Integer> testList = testParser.splitInputIntoElements("");
        assertTrue(testList.isEmpty());
    }

    @Test
    void testInvalidString() {
        IntegerInputParser testParser = new IntegerInputParser();
        assertThrows(IllegalArgumentException.class, () -> testParser.splitInputIntoElements("hello"));
    }

    @Test
    void testOneElementString() {
        String expectedInput = "1";
        IntegerInputParser testParser = new IntegerInputParser();
        List<Integer> testList = testParser.splitInputIntoElements(expectedInput);
        assertFalse(testList.isEmpty());
        assertEquals(1, testList.size());
        assertEquals(1, testList.get(0));
    }

    @Test
    void testOneElementStringWithNewLine() {
        String expectedInput = "1\n";
        IntegerInputParser testParser = new IntegerInputParser();
        List<Integer> testList = testParser.splitInputIntoElements(expectedInput);
        assertFalse(testList.isEmpty());
        assertEquals(1, testList.size());
        assertEquals(1, testList.get(0));
    }

    @Test
    void testMultiElementString() {
        String expectedInput = "1\n2";
        IntegerInputParser testParser = new IntegerInputParser();
        List<Integer> testList = testParser.splitInputIntoElements(expectedInput);
        assertFalse(testList.isEmpty());
        assertEquals(2, testList.size());
        assertEquals(1, testList.get(0));
        assertEquals(2, testList.get(1));
    }
}