package problems.twentyone.daytwo;

import org.junit.jupiter.api.Test;
import problems.twentyone.daytwo.DivePart2;

import static org.junit.jupiter.api.Assertions.*;

class DivePart2Test {
    final String websiteExampleString = """
forward 5
down 5
forward 8
up 3
down 8
forward 2
            """;
    DivePart2 tester = new DivePart2();
    @Test
    public void runWebsiteExample() {
        assertEquals("900", tester.run(websiteExampleString));
    }

}