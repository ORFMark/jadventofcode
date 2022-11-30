package com.adventofcode.problems.twentyone.dayfive;


import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;

public class HydrothermalVentsPart1 extends InsturmentedProblem {

    public String run(String input) {
        VentMap ventMap = HydroThermalInputParser.parseInput(input);
        return Integer.toString(ventMap.numberOfPointsWithMultipleLines());

    }
}
