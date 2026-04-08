package com.strivers.arrays.medium;

public class SortZerosOnesAndTwos {

  public static void sortZerosOnesAndTwos(int[] nums) {
        int low = 0 , mid  = 0, high = nums.length - 1;

        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            }else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }else{
                mid++;
            }
        }

      for(int num : nums) System.out.print(num + " ");
      System.out.println();
    }
}
