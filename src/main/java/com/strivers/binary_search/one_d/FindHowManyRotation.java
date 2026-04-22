package com.strivers.binary_search.one_d;

public class FindHowManyRotation {

  public int findNumRotations(int[] nums) {

    int left = 0, right = nums.length - 1;

    while (left < right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] <= nums[right]) {
        right = mid;
      } else {
        left = mid + 1;
      }
    }

    return left;
  }
}
