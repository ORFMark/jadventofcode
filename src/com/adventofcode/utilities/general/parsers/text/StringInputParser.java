package com.adventofcode.utilities.general.parsers.text;

import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.InputParser;

import java.util.LinkedList;
import java.util.List;

public class StringInputParser implements InputParser<String> {


    @Override
    public List<String> splitInputIntoElements(String problemInput, String deliminatorRegex) {
        List<String> cleanLines = new LinkedList<>();
        String[] dirtyLines = problemInput.split(deliminatorRegex);
        for(String line : dirtyLines) {
            line = line.trim().strip();
            if(!line.isEmpty()) {
                cleanLines.add(line);
            }
        }
        return cleanLines;
    }
}
