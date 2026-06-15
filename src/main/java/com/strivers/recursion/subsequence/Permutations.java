package com.strivers.recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    List<Integer> curr = new ArrayList<>();
    dfs(list, curr, nums);
    return list;

  }

  public void dfs(List<List<Integer>> list, List<Integer> curr, int[] nums) {
    if (curr.size() == nums.length) {
      list.add(new ArrayList<>(curr));
      return;
    }

    for (int i = 0; i < nums.length; i++) {
      if (curr.contains(nums[i]))
        continue;
      curr.add(nums[i]);
      dfs(list, curr, nums);
      curr.remove(curr.size() - 1);
    }
  }
}
