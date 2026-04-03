package com.strivers.arrays.easy;

public class LargestNumber {

  public static void findLargestNumber(int[] arr){

    int max = arr[0];

    for(int i = 0; i<arr.length; i++) max = Math.max(arr[i], max);
    
    System.out.println(max);
  }
}
