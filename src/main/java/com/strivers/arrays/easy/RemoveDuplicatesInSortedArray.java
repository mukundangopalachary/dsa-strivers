package com.strivers.arrays.easy;

public class RemoveDuplicatesInSortedArray {

  public static void removeDuplicatesInSortedArray(int[] arr) {

    int n = arr.length;
    int[] ans = new int[arr[n - 1]];
    ans[0] = arr[0];
    int temp = ans[0];
    int j = 1;

    for (int i = 1; i < n; i++) {
      if (arr[i] == temp)
        continue;
      else {
        ans[j++] = arr[i];
        temp = arr[i];
      }
    }

    for (int num : ans) {
      System.out.print(num + " ");
    }
    System.out.println();
  }
}
