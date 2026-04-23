package com.strivers.binary_search.bsOnAnswers;

public class FindNthRootOfANumber {

  public void findNthRoot(int n, int m) {
    int start = 0, end = m;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      long square = (long) Math.pow(mid, n);
      if (square == m) {
        System.out.println(mid);
        return;
      } else if (square > m) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }

    System.out.println(-1);
  }
}
