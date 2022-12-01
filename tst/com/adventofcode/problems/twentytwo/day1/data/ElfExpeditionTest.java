package com.adventofcode.problems.twentytwo.day1.data;

import com.adventofcode.problems.twentytwo.day1.parser.ElfBackpackParser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ElfExpeditionTest {

  public static final String TEST_INPUT = "1000\n" +
          "2000\n" +
          "3000\n" +
          "\n" +
          "4000\n" +
          "\n" +
          "5000\n" +
          "6000\n" +
          "\n" +
          "7000\n" +
          "8000\n" +
          "9000\n" +
          "\n" +
          "10000";
  ElfExpedition testExpedition;

  @BeforeEach
  public void setup() {
    testExpedition = new ElfExpedition();
    List<ElfBackpack> elves = new ElfBackpackParser().splitInputIntoElements(TEST_INPUT, "\n");
    for(ElfBackpack elf : elves) {
      testExpedition.addElf(elf);
    }
  }
  @Test
  void findElfWithTheMostFood() {
    int mostFood = 24000;
    assertEquals(mostFood, testExpedition.findElfWithTheMostFood().sumBackback());
  }

  @Test
  void computeHoardedCalories() {
    int hoard = 45000;
    assertEquals(hoard, testExpedition.computeHoardedCalories());
  }
}