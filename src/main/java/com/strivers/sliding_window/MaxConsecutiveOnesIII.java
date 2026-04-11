package com.strivers.sliding_window;

public class MaxConsecutiveOnesIII {

  public static void maxConsecutiveOnesIII(int[] nums, int k) {

    int left = 0;
    int count = 0;
    int zeros = 0;

    for (int right = 0; right < nums.length; right++) {

      if (nums[right] == 0)
        ++zeros;

      while (zeros > k) {
        if (nums[left] == 0) {
          zeros--;
        }
        left++;
      }

      count = Math.max(count, right - left + 1);
    }

    System.out.println(count);
  }
}
