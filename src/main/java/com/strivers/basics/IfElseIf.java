package com.strivers.basics;

import java.util.Scanner;

public class IfElseIf {
  
  public static void tryIfElse(){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your age: ");
    int age = scanner.nextInt();  // Read age from user
    
    if (age >= 18) {  
        System.out.println("You are an adult.");
    } else {
        System.out.println("You are not an adult.");
    }
    scanner.close();
  }
}
