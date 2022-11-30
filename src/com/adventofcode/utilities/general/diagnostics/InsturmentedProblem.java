package com.adventofcode.utilities.general.diagnostics;

import com.adventofcode.problems.Problem;

public abstract class InsturmentedProblem implements Problem {

  public long getRunTimeInNanoSeconds() {
    return runTimeInNanoSeconds;
  }

  public long getMemoryUsedInBytes() {
    return memoryUsedInBytes;
  }

  protected long runTimeInNanoSeconds = -1;
  protected long memoryUsedInBytes = -1;

  public String runWithInstrumentation(String input) {
    long startTime = 0;
    long endTime = 0;
    long startingMemory = 0;
    long endingMemory = 0;
    System.gc(); //used to get heap memory measurement to behave
    startingMemory =Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
    startTime = System.nanoTime();
    String result = run(input);
    endTime = System.nanoTime();
    endingMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
    runTimeInNanoSeconds = (endTime - startTime);
    if((endingMemory != startingMemory) || memoryUsedInBytes == -1) {
      memoryUsedInBytes = endingMemory - startingMemory;
    }
    return result;
  }
}
