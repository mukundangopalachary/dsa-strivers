package com.strivers.basics.patterns;

public class pattern_2 {

  public static void pattern2() {

    int n = 5;
    String str = "*";
    for (int i = 1; i < n + 1; i++) {
      System.out.println(str.repeat(i));
    }

    pattern2_num();
    pattern2_sameNum();
  }

  public static void pattern2_num() {
    int n = 5;

    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < i + 1; j++) {
        System.out.print(j);
      }
      System.out.println("\n");
    }
  }

  public static void pattern2_sameNum() {
    int n = 5;
    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < i + 1; j++) {
        System.out.print(i);
      }
      System.out.println("\n");
    }
  }
}
