package com.strivers.basics.recursion;

public class SumOfFirstNNumbers {

  public static void sumOfFirstNNumbers(int n){
    int sum = recursion(n);

    System.out.println(sum);

  }

  public static int recursion(int n){
    if(n == 1) return 1;

    return n + recursion(n-1);
  }
}
