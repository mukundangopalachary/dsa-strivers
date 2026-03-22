package com.strivers.basics.recursion;

public class Fibonacci {

  public static void fibonacci(int n){
    
    for(int i = 0; i<n+1; i++){ 
      System.out.print(recursion(i) + " ");
    }
    System.out.println();
  
  }

  private static int recursion(int n){
    
    if(n == 0) return 0;
    if(n == 1) return 1;

    return recursion(n -1) + recursion(n-2);
  }
}
