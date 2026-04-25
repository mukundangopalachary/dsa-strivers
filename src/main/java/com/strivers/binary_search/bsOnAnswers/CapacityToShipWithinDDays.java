package com.strivers.binary_search.bsOnAnswers;

public class CapacityToShipWithinDDays {

  public int shipWithinDays(int[] weights, int days) {
    int max = 0, sum = 0;
    for (int weight : weights) {
      max = Math.max(max, weight);
      sum += weight;
    }

    int left = max;
    int right = sum;
    int ans = sum;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (canShip(weights, days, mid)) {
        ans = mid;
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return ans;
  }

  public boolean canShip(int[] weights, int days, int capacity) {
    int daysUsed = 1;
    int currentLoad = 0;

    for (int weight : weights) {
      if (currentLoad + weight > capacity) {
        daysUsed++;
        currentLoad = weight;
      } else {
        currentLoad += weight;
      }
    }

    return daysUsed <= days;
  }
}
