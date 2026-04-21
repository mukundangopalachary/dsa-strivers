package com.strivers.binary_search.one_d;

/**
 * SearchInRotatedArrayII
 */
public class SearchInRotatedArrayII {

  public boolean search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (nums[mid] == target)
        return true;

      if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
        left++;
        right--;
        continue; // Re-evaluate mid with new boundaries
      }

      if (nums[mid] > nums[right]) {
        if (target < nums[mid] && target >= nums[left]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if (target > nums[mid] && target <= nums[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }

    return false;
  }
}
