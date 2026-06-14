package com.strivers.recursion.subsequence;

import java.util.List;
import java.util.ArrayList;

public class CombinationSum {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {

    List<List<Integer>> list = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();

    dfs(candidates, target, list, subset, 0, 0);

    return list;
  }

  public void dfs(int[] c, int t, List<List<Integer>> list, List<Integer> subset, int start, int sum) {
    if (sum > t) {
      return;
    }
    if (sum == t) {
      list.add(new ArrayList<>(subset));
      return;
    }

    for (int i = start; i < c.length; i++) {
      subset.add(c[i]);

      dfs(c, t, list, subset, i, sum + c[i]);

      subset.remove(subset.size() - 1);
    }
  }
}
