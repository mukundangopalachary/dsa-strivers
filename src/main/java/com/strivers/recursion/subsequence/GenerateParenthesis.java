package com.strivers.recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

  public List<String> generateParenthesis(int n) {
    List<String> ans = new ArrayList<>();
    backtrack(ans, 0, 0, n, "");
    return ans;
  }

  private void backtrack(List<String> ans, int open, int close, int max, String curr) {
    if (curr.length() == max * 2) {
      ans.add(curr);
      return;
    }

    if (open < max) {
      backtrack(ans, open + 1, close, max, curr + "(");
    }

    if (close < open) {
      backtrack(ans, open, close + 1, max, curr + ")");
    }
  }
}
