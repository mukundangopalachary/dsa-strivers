package com.strivers.recursion.subsequence;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SubsetII {

  public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    Arrays.sort(nums);
    dfs(list, subset, 0, nums);
    return list;
  }

  public void dfs(List<List<Integer>> list, List<Integer> subset, int start, int[] nums) {

    list.add(new ArrayList<>(subset));

    for (int i = start; i < nums.length; i++) {
      if (i > start && nums[i] == nums[i - 1]) {
        continue;
      }

      subset.add(nums[i]);
      dfs(list, subset, i + 1, nums);

      subset.remove(subset.size() - 1);
    }

  }
}
