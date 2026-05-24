package com.strivers.bit_manipulation.interview;

public class MinBitFlipsToConvertNumber {

  public int minBitFlips(int start, int goal) {
    int a = start ^ goal;
    int count = 0;
    while (a != 0) {
      count += a & 1;
      a = a >> 1;
    }

    return count;
  }
}
