package com.adventofcode.utilities.general.parsers.numerics;

import com.adventofcode.utilities.general.parsers.InputParser;
import com.adventofcode.utilities.general.parsers.text.StringInputParser;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * Creates a parser that strips ints out of delimated lines of text
 */
public class IntStripperParser implements InputParser<Optional<List<Integer>>> {

  /**
   *
   * @param problemInput to raw string to parse
   * @param deliminatorRegex a regular expression that represents the divider between TEXT elements
   * @return a list of integer lists stripped out from the parsed test, or Optional.empty if the line had no ints
   */
  @Override
  public List<Optional<List<Integer>>> splitInputIntoElements(String problemInput, String deliminatorRegex) {
    List<Optional<List<Integer>>> result = new LinkedList<>();
    List<String> rawText = new StringInputParser().splitInputIntoElements(problemInput, deliminatorRegex);
    for(String line : rawText) {
      List<Integer> possibleContents = new LinkedList<>();
      try (Scanner intScanner = new Scanner(line).useDelimiter("[^\\d]+")) {
        while (intScanner.hasNextInt()) {
          possibleContents.add(intScanner.nextInt());
        }
      } catch (Exception e) {
        System.out.println("Problem! Scanner failed to grab an int, except: " + e);
      }
      if(possibleContents.isEmpty()){
        result.add(Optional.empty());
      } else {
        result.add(Optional.of(possibleContents));
      }
    }
    return result;
  }
}
