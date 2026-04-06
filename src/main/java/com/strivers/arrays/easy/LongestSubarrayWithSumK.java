package com.strivers.arrays.easy;

public class LongestSubarrayWithSumK {

  public static void longestSubarrayWithSumK(int[] arr, int target){
    int i = 0;
    int sum = 0;
    int maxLength = 0;

    for (int j = 0; j < arr.length; j++) {
      sum += arr[j];

      while (i <= j && sum > target) {
        sum -= arr[i];
        i++;
      }

      if (sum == target) {
        maxLength = Math.max(maxLength, j - i + 1);
      }
    }

    System.out.println(maxLength);
  }
}
