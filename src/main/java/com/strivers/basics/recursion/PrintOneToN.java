package com.strivers.basics.recursion;

public class PrintOneToN {

  private int i = 1;
  private int j = 1;

  public void printOneToNForward(int n) {
    if (i > n)
      return;

    System.out.print(i + " ");
    ++i;
    printOneToNForward(n);
    System.out.println("\n");
  }

  public void PrintOneToNBacktrack(int n) {

    if (j > n)
      return;

    ++j;
    PrintOneToNBacktrack(n);
    System.out.print(j + " ");
  }
}
