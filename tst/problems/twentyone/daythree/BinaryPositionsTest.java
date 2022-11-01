package problems.twentyone.daythree;

import org.junit.jupiter.api.Test;
import problems.twentyone.daythree.BinaryPositions;

import static org.junit.jupiter.api.Assertions.*;

class BinaryPositionsTest {

    @Test()
    public void badInputShouldThrowRuntimeException() {
        try {
            new BinaryPositions("12345");
        } catch (Exception e) {
            assertEquals(RuntimeException.class, e.getClass());
        }
    }

    @Test
    public void basicGoodInputTest() {
        BinaryPositions tester = new BinaryPositions("1010");
        assertEquals(4, tester.getLength());
        assertEquals(1, tester.getValue(0));
        assertEquals(0, tester.getValue(1));
        assertEquals(1, tester.getValue(2));
        assertEquals(0, tester.getValue(3));
        assertEquals(10, tester.toInteger());


    }
}