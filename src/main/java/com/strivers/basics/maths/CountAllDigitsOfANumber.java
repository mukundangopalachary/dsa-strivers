package com.strivers.basics.maths;

public class CountAllDigitsOfANumber {

  public static void countAllDigitsOfANumber() {
    int n = 1234;
    int ans = (int)(Math.log10(n) + 1);

    System.out.println(ans);
  }
}
