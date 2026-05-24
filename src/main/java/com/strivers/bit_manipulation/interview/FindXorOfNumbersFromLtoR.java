package com.strivers.bit_manipulation.interview;

public class FindXorOfNumbersFromLtoR {

  public int forRange(int low, int high) {

    int ans = 0;
    for (int i = low; i < high + 1; i++) {
      ans ^= i;
    }

    return ans;
  }
}
