package com.strivers.basics;

public class Forloop {

  public static void loopFor() {
    for (int i = 1; i <= 5; i++) {
      System.out.println("Hey, Striver, this is the " + i + "'th iteration");
    }

    // Nested

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("i = " + i + ", j = " + j);
      }
    }

    for (int i = 1; i <= 25; i += 5) {
      System.out.println("i = " + i);
    }

  }
}
