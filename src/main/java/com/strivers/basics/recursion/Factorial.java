package com.strivers.basics.recursion;

public class Factorial {

  public static void factorial(int n) {
    int factorial_ans = recursion(n);

    System.out.println(factorial_ans);
  }

  private static int recursion(int n) {
    if (n == 1)
      return 1;

    return n * recursion(n - 1);
  }
}
