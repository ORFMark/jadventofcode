package utilities;

import java.util.LinkedList;
import java.util.List;

public class InputParser {
    public static List<String> splitInputLinesIntoList(String input) {
        List<String> cleanLines = new LinkedList<>();
        String[] dirtyLines = input.split("\n");
        for(String line : dirtyLines) {
            cleanLines.add(line.trim());
        }
        return cleanLines;
    }
}
