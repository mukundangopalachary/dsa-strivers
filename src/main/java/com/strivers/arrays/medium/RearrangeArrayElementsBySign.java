package com.strivers.arrays.medium;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {

  public static void rearrangeArrayElementsBySign(int[] nums){
    
    int[] result = new int[nums.length];
    Arrays.fill(result, Integer.MIN_VALUE);
    
    int positive = 0;
    int negative = 1;

    for(int i = 0; i<nums.length; i++){
      if(nums[i] >= 0){
        result[positive] = nums[i];
        positive += 2;
      }else{
        result[negative] = nums[i];
        negative += 2;
      }

    }

    for(int num: result){
      System.out.print(num + " ");
    }

    System.out.println();
  }
}
