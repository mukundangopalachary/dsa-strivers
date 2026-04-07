package com.strivers.arrays.easy;

import java.util.Map;
import java.util.HashMap;

public class SubarraySumEqualsK {

  public static void subarraySum(int[] nums, int k) {
    Map<Integer, Integer> prefixCount = new HashMap<>();
    prefixCount.put(0, 1);
    int sum = 0;
    int count = 0;
    for (int num : nums) {
        sum += num;
        count += prefixCount.getOrDefault(sum - k, 0);
        prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
    }
    System.out.println(count);
  }
}
