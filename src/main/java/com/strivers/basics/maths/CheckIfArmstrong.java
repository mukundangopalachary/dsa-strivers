package com.strivers.basics.maths;

public class CheckIfArmstrong {

  public static void checkIfArmstrong() {

    int n = 1534;
    int temp = n;
    int k = String.valueOf(n).length();
    int Armstrong = 0;
    while (temp>0){
      Armstrong += Math.pow(temp%10, k);
      System.out.println(Armstrong);
      temp /= 10;
    }

    if(Armstrong == n){
      System.out.println("Is Armstrong");
    }else{
      System.out.println("Not Armstrong");
    }
  }
}
