package com.adventofcode.utilities.general.diagnostics;

public class DiagnosticStringGenerator {
  public static String generateIDString(String author, String problemName, int year, int day, int part) {
    return String.format("%s's Advent of code %d, Day %d, %s part %d", author, year, day, problemName, part);
  }

  public static String generateHardwareStamp() {
    return "UNDER_CONSTRUCTION";
  }
}
