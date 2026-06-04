package com.strivers.basics.patterns;

public class pattern_6 {

  public static void pattern(int n) {

    for (int i = 1; i < n + 1; i++) {
      String si = "";
      int j = 1;
      while (j < i + 1) {
        si = si + j;
        j++;
      }

      System.out.println(si + " ".repeat((2 * n) - (2 * i)) + new StringBuilder(si).reverse().toString());
    }
  }
}
