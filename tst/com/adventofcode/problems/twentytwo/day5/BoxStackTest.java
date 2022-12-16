package com.adventofcode.problems.twentytwo.day5;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoxStackTest {

  @Test
  void addItem() {
    BoxStack testStack = new BoxStack();
    assertEquals(0, testStack.size());
    testStack.addItem('a');
    assertEquals(1, testStack.size());
    assertEquals('a', testStack.pop());
  }

  @Test
  void addItems() {
    List<Character> dataToAdd = new LinkedList<>();
    dataToAdd.add('a');
    dataToAdd.add('b');
    dataToAdd.add('c');
    BoxStack testStack = new BoxStack();
    assertEquals(0, testStack.size());
    testStack.addItems(dataToAdd);
    assertEquals(3, testStack.size());
    assertEquals('c', testStack.pop());
    assertEquals('b', testStack.pop());
    assertEquals('a', testStack.pop());
  }

  @Test
  void moveItemsTo() {
    List<Character> dataToAdd = new LinkedList<>();
    dataToAdd.add('a');
    dataToAdd.add('b');
    dataToAdd.add('c');
    BoxStack givingStack = new BoxStack();
    BoxStack destinationStack = new BoxStack();
    givingStack.addItems(dataToAdd);
    givingStack.moveItemsTo(destinationStack, 3);
    assertEquals(0, givingStack.size());
    assertEquals(3, destinationStack.size());
    assertEquals('a', destinationStack.pop());
    assertEquals('b', destinationStack.pop());
    assertEquals('c', destinationStack.pop());
  }

  @Test
  void pullItemsFrom() {
    List<Character> dataToAdd = new LinkedList<>();
    dataToAdd.add('a');
    dataToAdd.add('b');
    dataToAdd.add('c');
    BoxStack givingStack = new BoxStack();
    BoxStack destinationStack = new BoxStack();
    givingStack.addItems(dataToAdd);
    destinationStack.pullItemsFrom(givingStack, 2);
    assertEquals(1, givingStack.size());
    assertEquals(2, destinationStack.size());
    assertEquals('a', givingStack.pop());
    assertEquals('b', destinationStack.pop());
  }

  @Test
  void moveItemsInOrderTest() {
    List<Character> dataToAdd = new LinkedList<>();
    dataToAdd.add('a');
    dataToAdd.add('b');
    dataToAdd.add('c');
    BoxStack givingStack = new BoxStack();
    BoxStack destinationStack = new BoxStack();
    givingStack.addItems(dataToAdd);
    givingStack.moveItemsInOrderTo(destinationStack, 3);
    assertEquals(0, givingStack.size());
    assertEquals(3, destinationStack.size());
    assertEquals('c', destinationStack.pop());
    assertEquals('b', destinationStack.pop());
    assertEquals('a', destinationStack.pop());
  }

  @Test
  void pullItemsInOrderTest() {
    List<Character> dataToAdd = new LinkedList<>();
    dataToAdd.add('a');
    dataToAdd.add('b');
    dataToAdd.add('c');
    BoxStack givingStack = new BoxStack();
    BoxStack destinationStack = new BoxStack();
    givingStack.addItems(dataToAdd);
    destinationStack.pullItemsInOrderFrom(givingStack, 3);
    assertEquals(0, givingStack.size());
    assertEquals(3, destinationStack.size());
    assertEquals('c', destinationStack.pop());
    assertEquals('b', destinationStack.pop());
    assertEquals('a', destinationStack.pop());
  }

}