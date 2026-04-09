package com.strivers.arrays.medium;

public class BuyAndSellStock {

  public static void buyAndSellStock(int[] prices) {
    int profit = 0;
    int buy = prices[0];

    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < buy) {
        buy = prices[i];
      } else if (prices[i] - buy > profit) {
        profit = prices[i] - buy;
      }
    }
    System.out.println(profit);
  }
}
