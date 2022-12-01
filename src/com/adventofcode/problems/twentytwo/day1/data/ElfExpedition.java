package com.adventofcode.problems.twentytwo.day1.data;

import java.util.LinkedList;
import java.util.List;

public class ElfExpedition {
  private List<ElfBackpack> elves;

  public ElfExpedition() {
    elves = new LinkedList<ElfBackpack>();
  }

  public void addElf(ElfBackpack elfBackpack) {
    elves.add(elfBackpack);
    elves.sort((o1, o2) -> o2.sumBackback() - o1.sumBackback());
  }

  public ElfBackpack findElfWithTheMostFood() {
    return elves.get(0);
  }

  public int computeHoardedCalories() {
    return elves.get(0).sumBackback() + elves.get(1).sumBackback() + elves.get(2).sumBackback();
  }
}
