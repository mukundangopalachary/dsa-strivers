package com.strivers.binary_search.bsOnAnswers;

public class MinimumNoOfDaysToMakeMFlowers {

  public int minDays(int[] bloomDay, int m, int k) {
    if ((long) m * k > bloomDay.length) {
      return -1;
    }

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int bloom : bloomDay) {
      max = Math.max(bloom, max);
      min = Math.min(bloom, min);
    }

    int left = min, right = max;
    int ans = -1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (canMake(bloomDay, mid, m, k)) {
        ans = mid;
        right = mid - 1; // Try to find a smaller day
      } else {
        left = mid + 1; // Need more days
      }
    }

    return ans;
  }

  public boolean canMake(int[] bloomDay, int day, int m, int k) {
    int count = 0;
    int bouquets = 0;

    for (int bloom : bloomDay) {
      if (bloom <= day) {
        count++;
        if (count == k) {
          bouquets++;
          count = 0;
        }
      } else {
        // If a flower hasn't bloomed, the "consecutive" streak is broken
        count = 0;
      }
    }

    return bouquets >= m;
  }
}
