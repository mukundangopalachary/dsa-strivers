package com.strivers.basics.patterns;

public class pattern_1 {

  public static void pattern1() {
    int n = 5;
    String s = "*";
    for (int i = 0; i < n; i++) {
      System.out.println(s.repeat(n));
    }
  }
}
