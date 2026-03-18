package com.strivers.basics.patterns;

public class pattern_4 {

  public static void pattern4() {

    System.out.println("\n");

    int n = 9;
    int k = (n / 2);
    String s = "*";

    for (int i = 1; i < n + 1; i = i + 2) {
      System.out.println(" ".repeat(k) + s.repeat(i));
      k -= 1;
    }

    pattern4_invert(n, s);

  }

  public static void pattern4_invert(int n, String s) {
    int k = 0;

    for (int i = n; i > 0; i = i - 2) {
      System.out.println(" ".repeat(k) + s.repeat(i));
      k++;
    }
  }
}
