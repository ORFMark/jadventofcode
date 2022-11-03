package com.adventofcode.problems.twentyone.dayfive;

import  com.adventofcode.problems.Problem;

public class HydrothermalVentsPart1 implements Problem {

    public String run(String input) {
        VentMap ventMap = HydroThermalInputParser.parseInput(input);
        return Integer.toString(ventMap.numberOfPointsWithMultipleLines());

    }
}
