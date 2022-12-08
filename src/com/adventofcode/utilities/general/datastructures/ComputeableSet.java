package com.adventofcode.utilities.general.datastructures;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ComputeableSet<T> extends HashSet<T> {

  public ComputeableSet<T> intersection(Set<T> setToCompare) {
    ComputeableSet<T> result = new ComputeableSet();
    for (T value : setToCompare) {
      if(this.contains(value)) {
        result.add(value);
      }
    }
    return result;
  }

  public ComputeableSet<T> union(Set<T> setToUnion) {
    ComputeableSet<T> result = new ComputeableSet<>();
    result.addAll(setToUnion);
    result.addAll(this);
    return result;
  }

  public boolean isSupersetOf(Set<T> setToCompare) {
    return this.containsAll(setToCompare);
  }

  public boolean isSubsetOf(Set<T> setToCompare) {
    return setToCompare.containsAll(this);
  }
}
