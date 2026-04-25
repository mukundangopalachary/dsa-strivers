package com.strivers.binary_search.bsOnAnswers;

public class KthMissingPositiveNumber {

  public int findKthPositive(int[] arr, int k) {
    int left = 0, right = arr.length - 1;

    while(left <= right){
      int mid = left + (right - left) / 2;
      if(k> arr[mid] - (mid + 1) ){
        left = mid + 1;
      }else{
        right = mid - 1;
      }
    }

    return left + k;
  }
}
