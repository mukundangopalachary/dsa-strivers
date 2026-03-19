package com.strivers.basics.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetBasics {

  public static void LinkedHashSetMain() {

    Set<Integer> linkedHashSet = new LinkedHashSet<>();

    // Will be in the order the elements were added
    linkedHashSet.add(1);
    linkedHashSet.add(30);
    linkedHashSet.add(0);

    System.out.println(linkedHashSet);
  }
}
