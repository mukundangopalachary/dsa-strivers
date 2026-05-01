package com.strivers.binary_search.bsOnAnswers;

public class SplitArrayLargestSum {

  public int splitArray(int[] nums, int k) {

    if(nums.length < k) return 0;

    int left = Integer.MIN_VALUE;
    int right = 0;

    for(int num: nums){
      left = Math.max(left,num);
      right +=num;
    }

    int ans = 0;

    while(left<=right){
      int mid = left + (right - left) / 2;

      if(canFit(nums, mid, k)){
        ans = mid;
        right = mid - 1;
      }else{
        left = mid + 1;
      }
    }

    return ans;
  }

  public boolean canFit(int nums[] , int minVal, int k){

    int count = 1;
    int sum = 0;
    for(int num : nums){
      if(num + sum > minVal){
        count++;
        sum = num;
      }else{
        sum+=num;
      }
    }

    return count <= k;

  }
}
