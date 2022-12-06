package com.adventofcode.problems.twentytwo.day4;

import java.util.Optional;

public class CleaningPair {

  private final SectionAssignment firstElfSection;
  private final SectionAssignment secondElfSection;


  public CleaningPair(SectionAssignment firstElfSection, SectionAssignment secondElfSection) {
    this.firstElfSection = firstElfSection;
    this.secondElfSection = secondElfSection;
  }

  public Optional<SectionAssignment> getOverlappingSections() {
    return firstElfSection.findOverlap(secondElfSection);
  }

  public boolean needReevaluation() {
    return firstElfSection.encloses(secondElfSection) || firstElfSection.enclosedBy(secondElfSection);
  }
}
