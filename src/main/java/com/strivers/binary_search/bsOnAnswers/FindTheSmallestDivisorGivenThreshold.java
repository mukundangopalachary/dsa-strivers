package com.strivers.binary_search.bsOnAnswers;

public class FindTheSmallestDivisorGivenThreshold {

  public int smallestDivisor(int[] nums, int threshold) {
    int max = Integer.MIN_VALUE;
    int sum = 0;
      for(int num:nums) {
        max = Math.max(max, num);
        sum+=num;
      }
    if(nums.length == threshold) return max;
    if(sum == threshold) return 1;

    int left = 1; int right = max, ans = 0;
    while(left <=right){
      int mid = left + (right - left) / 2;
      if(isValid(nums, mid, threshold)){
        ans = mid;
        right = mid - 1;
      }else{
        left = mid + 1;
      }
    }

    return ans;
  }

  public boolean isValid(int[] nums, int divisor, int threshold){
    int sum = 0;
    for(int num:nums){
      sum += (num + divisor - 1) / divisor;
    }
    return sum <=threshold;
  }
}
