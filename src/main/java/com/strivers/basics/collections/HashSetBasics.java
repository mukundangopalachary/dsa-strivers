package com.strivers.basics.collections;

import java.util.Set;
import java.util.HashSet;

public class HashSetBasics {

  public static void HashSetBasicsMain(){
    Set<Integer> set = new HashSet<>();

    set.add(1);
    System.out.printf("Is HashSet empty? %b\n",set.isEmpty());
    set.add(1);
    for(int i = 0; i<5; i++){
      set.add(i);
    }

    System.out.println(set);

  }
}
