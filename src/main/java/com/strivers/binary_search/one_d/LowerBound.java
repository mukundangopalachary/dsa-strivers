package com.strivers.binary_search.one_d;

public class LowerBound {

  public static void lowerBound(int[] nums, int x){

    int left = 0, right = nums.length -1;
    int ans = nums.length;
    while(left<=right){
      int mid = left + (right - left) / 2;

      if(nums[mid] >= x){
        ans = mid;
        right = mid - 1;
      }else{
        left = mid + 1;
      }
    }

    System.out.println(ans);
  }
}
