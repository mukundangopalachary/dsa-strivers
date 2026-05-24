package com.strivers.bit_manipulation.interview;

public class SingleNumber1 {

  public int singleNumber(int[] nums) {
    int result = 0;
    for (int num : nums) {
      result ^= num;
    }

    return result;
  }
}
