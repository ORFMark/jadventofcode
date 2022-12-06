package com.adventofcode.problems.twentytwo.day4;

import java.util.Optional;

public class SectionAssignment implements Cloneable{

  private final int startSection;
  private final int endSection;

  public SectionAssignment(int startSection, int endSection) {
    this.startSection = startSection;
    this.endSection = endSection;
  }

  /**
   * Computes the overlap of two section assignments
   * @param sectionAssignmentToCompare
   * @return a sectionAssignment representing the overlap, or null if
   */
  public Optional<SectionAssignment> findOverlap(SectionAssignment sectionAssignmentToCompare) {
    if(!hasOverlap(sectionAssignmentToCompare)) {
      return Optional.empty();
    } else if (encloses(sectionAssignmentToCompare)) {
      return Optional.of(sectionAssignmentToCompare.clone());
    } else if (enclosedBy(sectionAssignmentToCompare)) {
      return Optional.of(this.clone());
    } else {
      int startOfOverlap = -1;
      int endOfOverlap = -1;
      if(startSection >= sectionAssignmentToCompare.getStartSection() && startSection <= sectionAssignmentToCompare.getEndSection()) {
        startOfOverlap = startSection;
      } else {
        startOfOverlap = sectionAssignmentToCompare.getStartSection();
      }
      if(endSection >= sectionAssignmentToCompare.getStartSection() && endSection <= sectionAssignmentToCompare.getEndSection()) {
        endOfOverlap = endSection;
      } else {
        endOfOverlap = sectionAssignmentToCompare.getEndSection();
      }
      return Optional.of(new SectionAssignment(startOfOverlap, endOfOverlap));
    }
  }

  public boolean hasOverlap(SectionAssignment sectionAssignment) {
    if(sectionAssignment.getStartSection() >= startSection && sectionAssignment.getStartSection() <= endSection) {
      return true;
    } else if (sectionAssignment.getEndSection() >= startSection && sectionAssignment.getEndSection() <= endSection) {
      return true;
    } else {
      return false;
    }
  }

  public boolean encloses(SectionAssignment sectionToCheck) {
    return (sectionToCheck.getStartSection() >= startSection && sectionToCheck.getEndSection() <= endSection);
  }

  public boolean enclosedBy(SectionAssignment sectionToCheck) {
    return (startSection >= sectionToCheck.getStartSection() && endSection <= sectionToCheck.getEndSection());
  }


  public int getEndSection() {
    return endSection;
  }

  public int getStartSection() {
    return startSection;
  }

  @Override
  public SectionAssignment clone() {
    try {
      SectionAssignment clone = (SectionAssignment) super.clone();
      return clone;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }

  @Override
  public boolean equals(Object o) {
    if(o instanceof SectionAssignment sectionAssignment) {
      return sectionAssignment.getStartSection() == this.startSection && sectionAssignment.getEndSection() == this.getEndSection();
    } else {
      return false;
    }
  }
}
