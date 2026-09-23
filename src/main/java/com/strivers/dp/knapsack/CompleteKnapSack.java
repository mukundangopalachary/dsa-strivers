package com.strivers.dp.knapsack;

import java.util.Arrays;

public class CompleteKnapSack {

  public int knapsackComplete(int[] wt, int[] v, int W) {

    int n = wt.length;
    int[] dp = new int[W + 1];
    Arrays.fill(dp, 0);

    for (int i = 1; i <= n; i++) {
      for (int j = wt[i - 1]; j <= W; j++) { // takes the same obj multiple times
        dp[j] = Math.max(dp[j], dp[j - wt[i - 1]] + v[i]);
      }
    }

    return dp[W];
  }
}
