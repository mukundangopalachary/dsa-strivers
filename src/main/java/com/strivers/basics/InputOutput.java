package com.strivers.basics;

import java.util.Scanner;

public class InputOutput {

  public static int tryInput() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number");
    int num = sc.nextInt();

    return num;
  }
}
