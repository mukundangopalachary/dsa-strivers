package com.strivers.dp.knapsack;

import java.util.Arrays;

public class ZeroOneKnapsack {

  public int maxInDaBag(int W, int[] val, int[] wt) {
    int n = wt.length;
    int[] dp = new int[W + 1];
    Arrays.fill(dp, 0);

    for (int i = 1; i <= n; i++) {
      for (int j = W; j >= wt[i - 1]; j--) {
        dp[j] = Math.max(dp[j], dp[j - wt[i - 1]] + val[i - 1]);
      }
    }

    return dp[W];
  }
}
