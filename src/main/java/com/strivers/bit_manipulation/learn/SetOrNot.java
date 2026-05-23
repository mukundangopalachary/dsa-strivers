package com.strivers.bit_manipulation.learn;

public class SetOrNot {

  public boolean checkIfSet(int n, int i) {
    return (n & (1 << i)) != 0;
  }

  public void setOrNot(int n, int i) {

    System.out.println(checkIfSet(n, i));
  }
}
