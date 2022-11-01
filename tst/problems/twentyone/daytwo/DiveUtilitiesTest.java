package problems.twentyone.daytwo;

import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.api.Test;
import problems.twentyone.daytwo.Direction;
import problems.twentyone.daytwo.DiveUtilities;

import java.util.List;

class DiveUtilitiesTest {

    @Test
    public void testParseInputWithOneInput() {
        String test = "Forward 5";
        List<Direction> directions= DiveUtilities.parseInput(test);
        assertEquals(1, directions.size());
        assertEquals("Forward",directions.get(0).getDirection());
        assertEquals(5, directions.get(0).getDistance());

    }

}