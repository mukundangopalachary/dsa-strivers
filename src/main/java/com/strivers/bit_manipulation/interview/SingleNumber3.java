package com.strivers.bit_manipulation.interview;

public class SingleNumber3 {

  public int[] singleNumber(int[] nums) {
    int ans = 0;
    for (int i = 0; i < nums.length; i++) {
      ans ^= nums[i];
    }

    int n = 0;
    while (true) {
      if ((ans & (1 << n)) != 0)
        break;
      n++;
    }

    int A = 0;
    int B = 0;

    for (int num : nums) {
      if ((num & (1 << n)) != 0)
        A ^= num;
      else
        B ^= num;
    }

    return new int[] { A, B };
  }
}
