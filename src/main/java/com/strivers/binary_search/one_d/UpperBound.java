package com.strivers.binary_search.one_d;

public class UpperBound {

  public static void upperBound(int[] nums, int x) {

    int left = 0, right = nums.length - 1;
    int ans = nums.length;
    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] <= x) {
        ans = mid;
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    System.out.println(ans);

  }
}
