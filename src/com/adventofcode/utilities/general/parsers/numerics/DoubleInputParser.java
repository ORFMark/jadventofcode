package com.adventofcode.utilities.general.parsers.numerics;

import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.LinkedList;
import java.util.List;

public class DoubleInputParser implements InputParser<Double> {



    @Override
    public List<Double> splitInputIntoElements(String problemInput, String deliminatorRegex) {
        List<Double> cleanLines = new LinkedList<>();
        List<String> lines = new StringInputParser().splitInputIntoElements(problemInput, deliminatorRegex);
        for(String line : lines) {
            cleanLines.add(Double.parseDouble(line));
        }
        return cleanLines;
    }
}
