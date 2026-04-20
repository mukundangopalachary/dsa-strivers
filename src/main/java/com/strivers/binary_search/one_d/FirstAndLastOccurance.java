package com.strivers.binary_search.one_d;

public class FirstAndLastOccurance {

  public int[] searchRange(int[] nums, int target) {
    return new int[] { getStarting(nums, target), getEnding(nums, target) };
  }

  public static int getStarting(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int k = -1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] == target) {
        k = mid;
        right = mid - 1;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return k;
  }

  public static int getEnding(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;
    int k = -1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] == target) {
        k = mid;
        left = mid + 1;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
    return k;
  }
}
