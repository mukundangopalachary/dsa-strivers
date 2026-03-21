package com.strivers.basics.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

  public static void countFrequency(){

    int[] arr = {10,5,10,15,10,5};

    Map<Integer, Integer> hashmap = new HashMap<>();

    for(int n: arr){
      hashmap.put(n,hashmap.getOrDefault(n, 0)+1);
    }

    System.out.println(hashmap);

  }
}
