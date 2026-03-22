package com.strivers.basics.recursion;

public class PrintNTimes {

  private String printStr = "hello";

  private int i = 0;

  public void printNTimes(int n) {
    if (i >= n)
      return;

    System.out.println(printStr);
    ++i;
    printNTimes(n);
  }
}
