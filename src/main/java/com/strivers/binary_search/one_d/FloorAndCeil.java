package com.strivers.binary_search.one_d;

public class FloorAndCeil {

  public static void findFloorAndCeil(int[] nums, int x) {
    int left = 0, right = nums.length - 1;
    int floor = -1;
    int ceil = -1;

    // Finding Ceil (Smallest number >= x)
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] >= x) {
        ceil = nums[mid]; // Store the value, not the index
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    left = 0;
    right = nums.length - 1;

    // Finding Floor (Largest number <= x)
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (nums[mid] <= x) {
        floor = nums[mid]; // Store the value, not the index
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    System.out.println("Floor: " + floor + ", Ceil: " + ceil);
  }
}
