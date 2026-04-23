package com.strivers.binary_search.bsOnAnswers;

public class KokoEatingBananas{
  public int minEatingSpeed(int[] piles, int h) {
    int left = 1;
    int right = 0;
    for (int pile : piles) {
      right = Math.max(right, pile);
    }

    int ans = right;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (canFinish(piles, h, mid)) {
        ans = mid;
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return ans;
  }

  public boolean canFinish(int[] piles, int h, int mid) {
    long totalHours = 0;
    for (int pile : piles) {
      totalHours += (pile + mid - 1) / mid;

      if (totalHours > h)
        return false;
    }

    return totalHours <= h;
  }
}
