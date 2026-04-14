package com.strivers.sliding_window;

import java.util.Map;
import java.util.HashMap;

public class BinarySubArraysWithSum {

  public int numSubarraysWithSum(int[] nums, int goal) {
        
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int currentSum = 0;

        for(int i = 0;i<nums.length; i++){
          currentSum+=nums[i];

          if(map.containsKey(currentSum - goal)){
            count += map.get(currentSum - goal);
          }
          map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }
}
