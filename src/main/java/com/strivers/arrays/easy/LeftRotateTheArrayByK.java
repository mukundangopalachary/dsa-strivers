package com.strivers.arrays.easy;

public class LeftRotateTheArrayByK {

  public static void leftRotateTheArrayByK(int[] arr, int k) {
    int n = arr.length;
    k = k % n;

    reverse(arr, 0, n - 1);
    reverse(arr, 0, n - k - 1);
    reverse(arr, n - k, n - 1);

    for (int num : arr) {
      System.out.print(num + " ");
    }
    System.out.println();

  }

  public static void reverse(int[] arr, int start, int end) {

    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;

      start++;
      end--;
    }
  }
}
