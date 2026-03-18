package com.strivers.basics;

public class WhileLoop {

  public static void factorial() {
    int n = 5;
    int factorial = 1;

    while (n > 0) {
      factorial *= n; // Keep finding factorial with n and decrement n
      n--;
    }

    System.out.println("Factorial of 5 is: " + factorial); // Print the factorial
  }

  public static void doWhile() {
    int x = 0;

    do {
      System.out.println(x);
      x++;
    } while (x <= 5);
  }
}
