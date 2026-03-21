package com.strivers.basics.maths;

import java.util.Set;
import java.util.TreeSet;
public class FindAllDivisors {

  public static void findAllDivisors(){
  
    int num = 50;
    
    Set<Integer> set = new TreeSet<>();

    for(int i = 1; i<Math.sqrt(num);i++){
      if(num%i == 0){
        set.add(i);
        set.add(num/i);
      }
    }
    
    System.out.println(set);
  }
}
