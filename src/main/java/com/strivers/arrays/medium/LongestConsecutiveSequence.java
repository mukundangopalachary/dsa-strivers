package com.strivers.arrays.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

  public static int longestConsecutive(int[] nums){

    if(nums.length == 0) return 0;
    
    Set<Integer> set = new HashSet<>();

    for(int num: nums){
      set.add(num);
    }
    
    int maxCount = 0;
    for(int num: set){
      if(!set.contains(num - 1)){
        int count =1;

        while(set.contains(num + 1)){
          count++;
          num++;
        }

        maxCount = Math.max(maxCount, count);
      }
    }

    return maxCount;
  }
}
