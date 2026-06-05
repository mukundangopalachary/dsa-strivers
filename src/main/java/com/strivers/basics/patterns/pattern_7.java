package com.strivers.basics.patterns;

public class pattern_7 {

  public static void pattern(int x) {
    boolean flag = false;
    int n = x;
    while (n >= 1 || flag == true) {
      if (!flag) {
        System.out.println("*".repeat(n) + " ".repeat(2 * (x - n)) + "*".repeat(n));
        if (n == 1) {
          flag = true;
          continue;
        }
        n--;

      } else {
        System.out.println("*".repeat(n) + " ".repeat(2 * (x - n)) + "*".repeat(n));
        if (n == x)
          break;
        n++;
      }
    }
  }
}
