package com.adventofcode.problems.twentyone.daythree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryPositionsTest {

    @Test()
    void badInputShouldThrowIllegalArgument() {
        try {
            new BinaryPositions("12345");
        } catch (Exception e) {
            assertEquals(IllegalArgumentException.class, e.getClass());
        }
    }

    @Test
    void basicGoodInputTest() {
        BinaryPositions tester = new BinaryPositions("1010");
        assertEquals(4, tester.getLength());
        assertEquals(1, tester.getValue(0));
        assertEquals(0, tester.getValue(1));
        assertEquals(1, tester.getValue(2));
        assertEquals(0, tester.getValue(3));
        assertEquals(10, tester.toInteger());


    }
}