package com.strivers.arrays.medium;

public class MajorityElement {

  public static void majorityElement(int[] nums) {
    int candidate = -1, vote = 0;

    for (int i = 0; i < nums.length; i++) {
      if (vote == 0) {
        candidate = nums[i];
        vote++;
      } else {
        if (candidate == nums[i]) {
          vote++;
        } else {
          vote--;
        }
      }
    }
    // return candidate;

    vote = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == candidate) {
        vote++;
      }
    }

    System.out.println(vote >= nums.length / 2 ? candidate : -1);
  }

}
