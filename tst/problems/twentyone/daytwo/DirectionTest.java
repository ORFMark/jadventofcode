package problems.twentyone.daytwo;

import org.junit.jupiter.api.Test;
import problems.twentyone.daytwo.Direction;

import static org.junit.jupiter.api.Assertions.*;

class DirectionTest {

    Direction dirc = new Direction("Forward", 5);

    @Test
    public void assertGetDirection() {
        assertEquals("Forward", dirc.getDirection());
    }

    @Test
    public void assertSetDirection() {
        dirc.setDirection("Down");
        assertEquals("Down", dirc.getDirection());
    }

    @Test
    public void assertGetDistance() {
        assertEquals(5, dirc.getDistance());
    }

    @Test
    public void assertSetDistamce() {
        dirc.setDistance(4);
        assertEquals(4, dirc.getDistance());
    }
}