package com.adventofcode.problems;

public interface Problem {
    int year = -1;
    int day = -1;
    int part = -1;
    String author = "ORFMark";
    String problemName = "";
    String run(String input);
    default String getIdentifer() {
        return String.format("%s's Advent of code %d, Day %d, %s part %d", author, year, day, problemName, part);
    }


}
