package com.strivers.basics.patterns;

public class pattern_3 {

  public static void pattern3() {
    int n = 5;

    for(int i = n;i!=0; i--){
      System.out.println("*".repeat(i));
    }

    pattern3_num();
  }

  public static void pattern3_num(){
    int n = 5;

    for(int i = n; i!=0; i--){
      for(int j = 1;j<i+1; j++){
        System.out.print(j);
      }
      System.out.print("\n");
    }
  }
}
