package com.adventofcode.problems.twentytwo.day4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SectionAssignmentTest {

  private final SectionAssignment baseSectionAssignment = new SectionAssignment(1,10);

  @Test
  void findOverlap() {
    SectionAssignment sectionAssignmentWithOverlap = new SectionAssignment(8, 12);
    SectionAssignment result = baseSectionAssignment.findOverlap(sectionAssignmentWithOverlap).get();
    SectionAssignment expectedResult = new SectionAssignment(8, 10);
    assertEquals(expectedResult, result);
    result = sectionAssignmentWithOverlap.findOverlap(baseSectionAssignment).get();
    assertEquals(expectedResult, result);
  }

  @Test
  void hasOverlap() {
    SectionAssignment sectionAssignmentWithOverlap = new SectionAssignment(8, 12);
    assertTrue(baseSectionAssignment.hasOverlap(sectionAssignmentWithOverlap));
  }

  @Test
  void encloses() {
    SectionAssignment enclosedSectionAssignment = new SectionAssignment(4,6);
    assertTrue(baseSectionAssignment.encloses(enclosedSectionAssignment));
    assertFalse(enclosedSectionAssignment.encloses(baseSectionAssignment));
  }

  @Test
  void enclosedBy() {
    SectionAssignment enclosedSectionAssignment = new SectionAssignment(4,6);
    assertFalse(baseSectionAssignment.enclosedBy(enclosedSectionAssignment));
    assertTrue(enclosedSectionAssignment.enclosedBy(baseSectionAssignment));
  }

  @Test
  void getEndSection() {
    assertEquals(10, baseSectionAssignment.getEndSection());
  }

  @Test
  void getStartSection() {
    assertEquals(1, baseSectionAssignment.getStartSection());
  }

  @Test
  void testClone() {
    SectionAssignment clone = baseSectionAssignment.clone();
    assertNotSame(clone, baseSectionAssignment);
    assertEquals(clone, baseSectionAssignment);
  }

  @Test
  void testEquals() {
  }
}