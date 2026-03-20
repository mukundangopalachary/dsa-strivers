package com.strivers.basics.maths;

public class ReverseANumber {

  public static void reverseANumber() {

    int n = 10400;
    int ans = 0;

    while (n > 0) {
      int last_dig = n % 10;

      ans = ans * 10 + last_dig;

      n /= 10;
    }

    System.out.println(ans);
  }
}
