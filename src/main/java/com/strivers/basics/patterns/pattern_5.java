package com.strivers.basics.patterns;

public class pattern_5 {

  public static void pattern5(int num) {
    int flag = 1;

    for (int i = 0; i < num + 1; i++) {

      for (int j = 0; j < i; j++) {
        System.out.print(flag + " ");
        flag = flag == 1 ? 0 : 1;
      }

      System.out.print("\n");
    }
  }
}
