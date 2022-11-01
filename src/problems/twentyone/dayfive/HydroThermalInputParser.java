package problems.twentyone.dayfive;

import utilities.InputParser;

import java.util.LinkedList;
import java.util.List;

public class HydroThermalInputParser {
    public static VentMap parseInput(String rawInput) {
        List<String> lines = InputParser.splitInputLinesIntoList(rawInput);
        List<LineSegment> lineSegments= new LinkedList<>();
        int maxX = 0;
        int maxY = 0;
        for(String line : lines) {
            String[] lineSegmentPoints = line.split(" -> ");
            String[] start = lineSegmentPoints[0].split(",");
            String[] end = lineSegmentPoints[1].split(",");
            LineSegment theLine = new LineSegment(Integer.parseInt(start[0].strip()), Integer.parseInt(start[1].strip()), Integer.parseInt(end[0].strip()), Integer.parseInt(end[1].strip()));
            if(theLine.getEndX() > maxX) {
                maxX = theLine.getEndX();
            }
            if(theLine.getEndY() > maxY) {
                maxY = theLine.getEndY();
            }
            if(theLine.getStartX() == theLine.getEndX() || theLine.getStartY() == theLine.getEndY()) {
                lineSegments.add(theLine);
            }
        }
        VentMap theMap = new VentMap(maxX, maxY);
        for (LineSegment line : lineSegments) {
            theMap.addLineSegment(line);
        }
        return theMap;


    }
}
