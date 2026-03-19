package com.strivers.basics.collections;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapBasics {

  public static void LinkedHashMapMain() {

    // maintains the insertion order

    Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put(1, 30);
    linkedHashMap.put(3, 50);
    linkedHashMap.put(2, 40);

    System.out.println(linkedHashMap);
  }
}
