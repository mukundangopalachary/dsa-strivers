package com.strivers.recursion.subsequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CombinationSumII {

  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(candidates);
    dfs(list, new ArrayList<>(), candidates, target, 0);
    return list;
  }

  public void dfs(List<List<Integer>> list, List<Integer> curr, int[] candidates, int remaining, int idx) {
    if (remaining == 0) {
      list.add(new ArrayList<>(curr));
      return;
    }

    if (idx == candidates.length || remaining < 0)
      return;

    curr.add(candidates[idx]);
    dfs(list, curr, candidates, remaining - candidates[idx], idx + 1);
    curr.remove(curr.size() - 1);
    int next = idx + 1;

    while (next < candidates.length &&
        candidates[next] == candidates[idx]) {
      next++;
    }

    dfs(list, curr, candidates, remaining, next);
  }
}
