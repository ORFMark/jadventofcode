package com.adventofcode.problems;

import com.adventofcode.problems.twentyone.dayone.SonarSweepPart1;
import com.adventofcode.utilities.general.diagnostics.InsturmentedProblem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsturmentedProblemTest {

  InsturmentedProblem testProblem = new SonarSweepPart1();
  String testInput = """
                199
                200
                208
                210
                200
                207
                240
                269
                260
                263""";

  @Test
  void getRunTimeInNanoSeconds() {
    testProblem.runWithInstrumentation(testInput);
    assertNotEquals(0, testProblem.getRunTimeInNanoSeconds());
  }

  @Test
  void getMemoryUsedInBytes() {
    testProblem.runWithInstrumentation(testInput);
    assertNotEquals(0, testProblem.getMemoryUsedInBytes());
  }

  @Test
  void testProblemRunning() {
    assertEquals("7", testProblem.runWithInstrumentation(testInput));
  }

  @Test
  void testProblemRunningWithPerciseInsturments() {
    assertEquals("7", testProblem.runWithPerciseInstrumentation(testInput, 2, 10));
  }
}