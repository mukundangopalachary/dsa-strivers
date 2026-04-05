package com.strivers.arrays.easy;

public class MaxConsecutiveOnes {

  public static void maxConsecutiveOnes(int[] arr){

    int count = 0;
    int maxCount = 0;

    for(int num: arr){
      
      if(num == 1){
        count += 1;
        maxCount = Math.max(count, maxCount);
      }else{ 
        count = 0;
      }
    }

    System.out.println(maxCount);
  }
}
