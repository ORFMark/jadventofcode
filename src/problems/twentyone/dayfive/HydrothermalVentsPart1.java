package problems.twentyone.dayfive;

import problems.Problem;

public class HydrothermalVentsPart1 implements Problem {

    public String run(String input) {
        VentMap ventMap = HydroThermalInputParser.parseInput(input);
        return Integer.toString(ventMap.numberOfPointsWithMultipleLines());

    }
}
