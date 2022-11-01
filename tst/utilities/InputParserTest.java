package utilities;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {

    @Test
    public void testDay1() {
        String webExample = """
                199
                200
                208
                210
                200
                207
                240
                269
                260
                263""";
        List<String> parseInput = InputParser.splitInputLinesIntoList(webExample);
        assertEquals("199", parseInput.get(0));
        assertEquals("200", parseInput.get(1));
    }

    @Test
    public void testDay2() {
        final String webExample = """
forward 5
down 5
forward 8
up 3
down 8
forward 2
            """;
        List<String> parseInput = InputParser.splitInputLinesIntoList(webExample);
        assertEquals("forward 5", parseInput.get(0));
        assertEquals("down 5", parseInput.get(1));
    }

    @Test
    public void testDay3() {
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
        List<String> parseInput = InputParser.splitInputLinesIntoList(webExample);
        assertEquals("00100", parseInput.get(0));
        assertEquals("11110", parseInput.get(1));
    }

    @Test
    public void testDay4() {

    }

}