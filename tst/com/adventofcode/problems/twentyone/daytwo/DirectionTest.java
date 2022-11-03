package com.adventofcode.problems.twentyone.daytwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectionTest {

    Direction dirc = new Direction("Forward", 5);

    @Test
    void assertGetDirection() {
        assertEquals("Forward", dirc.getDirection());
    }

    @Test
    void assertSetDirection() {
        dirc.setDirection("Down");
        assertEquals("Down", dirc.getDirection());
    }

    @Test
    void assertGetDistance() {
        assertEquals(5, dirc.getDistance());
    }

    @Test
    void assertSetDistamce() {
        dirc.setDistance(4);
        assertEquals(4, dirc.getDistance());
    }
}