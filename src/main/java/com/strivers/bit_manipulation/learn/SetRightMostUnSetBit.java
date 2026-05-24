package com.strivers.bit_manipulation.learn;

public class SetRightMostUnSetBit {

  public int setRightMostUnSetBit(int n) {
    if ((n & (n + 1)) == 0) {
      return n;
    }
    return n | (n + 1);
  }
}
