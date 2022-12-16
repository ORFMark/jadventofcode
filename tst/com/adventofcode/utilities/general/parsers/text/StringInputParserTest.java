package com.adventofcode.utilities.general.parsers.text;

import org.junit.jupiter.api.Test;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringInputParserTest {
    
    @Test
    void testNullString() {
        StringInputParser testParser = new StringInputParser();
        assertThrows(NullPointerException.class, () -> testParser.splitInputIntoElements(null));
    }
    
    @Test
    void testEmptyString() {
        StringInputParser testParser = new StringInputParser();
        List<String> testList = testParser.splitInputIntoElements("");
        assertTrue(testList.isEmpty());
    }

    @Test
    void testOneElementString() {
        String expectedInput = "hello!";
        StringInputParser testParser = new StringInputParser();
        List<String> testList = testParser.splitInputIntoElements(expectedInput);
        assertFalse(testList.isEmpty());
        assertEquals(1, testList.size());
        assertEquals(expectedInput, testList.get(0));
    }

    @Test
    void testOneElementStringWithNewLine() {
        String expectedInput = "hello!\n";
        StringInputParser testParser = new StringInputParser();
        List<String> testList = testParser.splitInputIntoElements(expectedInput);
        assertFalse(testList.isEmpty());
        assertEquals(1, testList.size());
        assertEquals("hello!", testList.get(0));
    }

    @Test
    void testMultiElementString() {
        String expectedInput = "hello!\nGoodBye!";
        StringInputParser testParser = new StringInputParser();
        List<String> testList = testParser.splitInputIntoElements(expectedInput);
        assertFalse(testList.isEmpty());
        assertEquals(2, testList.size());
        assertEquals("hello!", testList.get(0));
        assertEquals("GoodBye!", testList.get(1));
    }

    @Test
    void testMultiElementStringWithCommaDeliminator() {
        String expectedInput = "hello!,GoodBye!";
        StringInputParser testParser = new StringInputParser();
        List<String> testList = testParser.splitInputIntoElements(expectedInput, ",");
        assertFalse(testList.isEmpty());
        assertEquals(2, testList.size());
        assertEquals("hello!", testList.get(0));
        assertEquals("GoodBye!", testList.get(1));
    }
}