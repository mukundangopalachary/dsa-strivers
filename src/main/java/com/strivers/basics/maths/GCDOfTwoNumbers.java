package com.strivers.basics.maths;

import java.lang.Math;

public class GCDOfTwoNumbers {

  public static void gCDOfTwoNumbers() {
    
    int n = 27;
    int m = 41;
    
    int a = Math.min(m,n);
    int b = Math.max(m,n);

    for(int i = a/2; i<0; i--){
      if(a%i==0 && b%i==0){
        System.out.println(i);
        return;
      }
    }

    System.out.println(1);
  }
}
