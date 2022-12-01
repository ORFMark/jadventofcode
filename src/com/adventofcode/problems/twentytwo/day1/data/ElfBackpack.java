package com.adventofcode.problems.twentytwo.day1.data;

import java.util.LinkedList;
import java.util.List;

public class ElfBackpack {

  private List<Integer> foodItems;

  public ElfBackpack() {
    foodItems = new LinkedList<Integer>();
  }

  public void addItem(int foodItemCalorie) {
    foodItems.add(foodItemCalorie);
  }

  public int sumBackback() {
    int calorieTotal = 0;
    for(int food : foodItems) {
      calorieTotal += food;
    }
    return calorieTotal;
  }

  public int maxBackback() {
    int calorieMax = 0;
    for(int food : foodItems) {
      if(calorieMax == 0 || food > calorieMax) {
        calorieMax = food;
      }
    }
    return calorieMax;
  }


}
