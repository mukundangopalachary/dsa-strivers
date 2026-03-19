package com.strivers.basics.collections;

import java.util.Map;
import java.util.HashMap;

public class HashMapBasics { 
  
  public static void HashMapMain(){
    Map<Character, Integer> hashmap = new HashMap<>();
    String S = "I love chocolate";
    S = S.toLowerCase();
    for(char c: S.toCharArray()){
      hashmap.put(c, hashmap.getOrDefault(c, 0) + 1);
    }

    System.out.println(hashmap);
  }

}
