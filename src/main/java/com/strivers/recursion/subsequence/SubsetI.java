package com.strivers.recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class SubsetI {

  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();

    recursion(list, subset, nums, 0);
    return list;
  }

  public void recursion(List<List<Integer>> list, List<Integer> subset, int[] nums, int index) {
    if (index == nums.length) {
      list.add(new ArrayList<>(subset));
      return;
    }

    subset.add(nums[index]);
    recursion(list, subset, nums, index + 1);

    subset.remove(subset.size() - 1);
    recursion(list, subset, nums, index + 1);
  }
}
