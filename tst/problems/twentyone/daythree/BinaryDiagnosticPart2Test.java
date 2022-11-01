package problems.twentyone.daythree;

import org.junit.jupiter.api.Test;
import problems.twentyone.daythree.BinaryDiagnosticPart2;

import static org.junit.jupiter.api.Assertions.*;

class BinaryDiagnosticPart2Test {
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
        BinaryDiagnosticPart2 tester = new BinaryDiagnosticPart2();
        assertEquals("230", tester.run(webExample));
    }

}