package com.adventofcode.problems.twentytwo.day6;

import com.adventofcode.utilities.general.datastructures.ComputeableSet;


public class Signal {
  private final String signal;
  private final int indexOfStartOfPacket;
  private final int sizeOfStartOfPacket = 4;
  private final int indexOfStartOfMessage;
  private final int sizeOfStartOfMessage = 14;

  public Signal(String signalString) {
    this.signal = signalString;
    this.indexOfStartOfMessage = findNDistinctCharacters(sizeOfStartOfMessage);
    indexOfStartOfPacket = findNDistinctCharacters(sizeOfStartOfPacket);

  }


  public int findNDistinctCharacters(int numberOfDistictCharacters) {
      final int zeroIndexedNumberOfDistinctCharacters = numberOfDistictCharacters-1;
      for(int endIndex = zeroIndexedNumberOfDistinctCharacters; endIndex < signal.length(); endIndex++) {
        ComputeableSet<Character> uniqueCharacters = new ComputeableSet<>();
        String canidate = signal.substring(endIndex-zeroIndexedNumberOfDistinctCharacters, endIndex+1);
        for(char c : canidate.toCharArray()) {
          uniqueCharacters.add(c);
        }
        if(uniqueCharacters.size() == numberOfDistictCharacters) {
          return endIndex+1;
        }
      }
      return signal.length();
    }

  public int getIndexOfStartOfPacket() {
    return indexOfStartOfPacket;
  }

  public int getIndexOfStartOfMessage() {
    return indexOfStartOfMessage;
  }
}
