package problems.twentyone.daythree;

import org.junit.jupiter.api.Test;
import problems.twentyone.daythree.BinaryDiagnosticPart1;

import static org.junit.jupiter.api.Assertions.*;

class BinaryDiagnosticPart1Test {

    @Test
    public void runWebExample() {
        String webExample = """
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
        BinaryDiagnosticPart1 tester = new BinaryDiagnosticPart1();
        assertEquals("198", tester.run(webExample));
    }
}