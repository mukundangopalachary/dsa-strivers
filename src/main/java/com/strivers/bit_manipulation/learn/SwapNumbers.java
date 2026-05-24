package com.strivers.bit_manipulation.learn;

public class SwapNumbers {

  public void swapNumbers(int a, int b) {
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
  }
}
