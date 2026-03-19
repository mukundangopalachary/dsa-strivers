package com.strivers.basics.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetBasics {

  public static void TreeSetMain() {

    Set<Integer> treeSet = new TreeSet<>();
    // maintains the right order(ascending, lexologically) or custom logic using
    // Comprator
    treeSet.add(1);
    treeSet.add(30);
    treeSet.add(0);

    System.out.println(treeSet);
  }
}
