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
    
    maxFrequency(arr);
  }

  public static void maxFrequency(int[] arr){
    
    Map<Integer, Integer> hashmap = new HashMap<>();

    for(int n: arr){
      hashmap.put(n, hashmap.getOrDefault(n, 0)+1);
    }
    
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    int max_ele = 0, min_ele = 0;
    for(Map.Entry<Integer, Integer> entry: hashmap.entrySet()){
      int key = entry.getKey();
      int value = entry.getValue();

      if(value > max){
        max = value;
        max_ele = key;
      }

      if(value < min){
        min = value;
        min_ele = key;
      }
    }

    System.out.println("Element with highest frequency: " + max_ele);
    System.out.println("Element with lowest frequency: " + min_ele);
  }
}
