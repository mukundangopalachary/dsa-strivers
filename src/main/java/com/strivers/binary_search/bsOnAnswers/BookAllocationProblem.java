package com.strivers.binary_search.bsOnAnswers;

public class BookAllocationProblem {

  public int allocateBook(int nums[], int m) {

    if (m > nums.length)
      return -1;

    int min = nums[0];
    int max = nums[0];

    for (int i = 1; i < nums.length; i++) {
      min = Math.max(min, nums[i]);
      max += nums[i];
    }

    int left = min, right = max;
    int ans = -1;
    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (canAllocate(nums, mid, m)) {
        ans = mid;
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return ans;

  }

  public static boolean canAllocate(int nums[], int pages, int m) {
    int count = 1;
    int sum = 0;
    for (int num : nums) {
      if ((sum + num) > pages) {
        count++;
        sum = num;
      } else {
        sum += num;
      }
    }

    return count <= m;
  }
}
