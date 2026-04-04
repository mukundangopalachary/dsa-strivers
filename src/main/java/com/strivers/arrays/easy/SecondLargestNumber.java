package com.strivers.arrays.easy;

public class SecondLargestNumber {

  public static void findSecondLargestNumber(int[] arr) {

    int max = arr[0];
    int secondMax = arr[0];

    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > max) {
        secondMax = max;
        max = arr[i];
      }
    }

    System.out.println(secondMax);
  }
}
