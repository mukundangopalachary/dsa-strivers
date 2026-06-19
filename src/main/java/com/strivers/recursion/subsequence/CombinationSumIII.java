package com.strivers.recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

  public List<List<Integer>> combinationSum3(int k, int n) {
    if (k > n)
      return new ArrayList<>();

    List<List<Integer>> list = new ArrayList<>();
    dfs(list, new ArrayList<>(), k, n, 1);
    return list;
  }

  public void dfs(List<List<Integer>> list, List<Integer> curr, int k, int n, int i) {
    if (k == 0 && n == 0) {
      list.add(new ArrayList<>(curr));
      return;
    }

    if (i == 10 || k < 0 || n < 0)
      return;

    // choose
    curr.add(i);
    dfs(list, curr, k - 1, n - i, i + 1); // backtracking 1

    // unchoose
    curr.remove(curr.size() - 1); // backtracking after unchoosing the current opt
    dfs(list, curr, k, n, i + 1);
    return;
  }
}
