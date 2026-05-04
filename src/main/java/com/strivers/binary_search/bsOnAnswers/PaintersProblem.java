package com.strivers.binary_search.bsOnAnswers;

public class PaintersProblem {

  private static final int MOD = 10000003;

  public int paint(int painters, int time, int[] boards) {

    long low = 0, high = 0;

    for (int num : boards) {
      low = Math.max(low, num); // max single board
      high += num; // total sum
    }

    long ans = high;

    while (low <= high) {
      long mid = low + (high - low) / 2;

      if (canPaint(boards, painters, mid)) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    // multiply AFTER binary search
    return (int) ((ans % MOD) * (time % MOD) % MOD);
  }

  public boolean canPaint(int[] boards, int painters, long units) {
    int count = 1;
    long sum = 0;

    for (int num : boards) {
      if (sum + num <= units) {
        sum += num;
      } else {
        count++;
        sum = num;

        if (count > painters)
          return false;
      }
    }

    return true;
  }
}
