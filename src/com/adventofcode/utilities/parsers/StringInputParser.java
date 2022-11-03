package com.adventofcode.utilities.parsers;

import java.util.LinkedList;
import java.util.List;

public class StringInputParser implements InputParser<String> {
    @Override
    public List<String> splitInputIntoElements(String problemInput) {
        List<String> cleanLines = new LinkedList<>();
        String[] dirtyLines = problemInput.split("\n");
        for(String line : dirtyLines) {
            line = line.trim().strip();
            if(!line.isEmpty()) {
                cleanLines.add(line);
            }
        }
        return cleanLines;
    }
}
