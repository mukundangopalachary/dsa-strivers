package com.strivers.basics;

import java.util.Scanner;

public class InputOutput {
  public int tryInput(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Number");
    int num = sc.nextInt();
    
    sc.close();
    return num;
  }
}
