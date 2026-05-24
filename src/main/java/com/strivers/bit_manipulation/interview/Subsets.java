package com.strivers.bit_manipulation.interview;

import java.util.List;
import java.util.ArrayList;

public class Subsets {

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    int n = nums.length;
    int size = 1 << n;

    for (int num = 0; num < size; num++) {
      List<Integer> curr = new ArrayList<>();

      for (int j = 0; j < n; j++) {
        if ((num & (1 << j)) != 0) {
          curr.add(nums[j]);
        }
      }

      ans.add(curr);
    }

    return ans;
  }
}
