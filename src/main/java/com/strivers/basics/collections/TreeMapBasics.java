package com.strivers.basics.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapBasics {

  public static void TreeMapMain() {

    // Maintains the natural order(ascending, lexologically, etc) or custom.
    Map<Integer, Integer> treeMap = new TreeMap<>();

    treeMap.put(1, 30);
    treeMap.put(3, 50);
    treeMap.put(2, 40);

    System.out.println(treeMap);
  }
}
