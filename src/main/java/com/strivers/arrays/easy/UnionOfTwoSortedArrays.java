package com.strivers.arrays.easy;

public class UnionOfTwoSortedArrays {

  public static void unionOfTwoSortedArrays(int[] a, int[] b) {

    int i = 0, j = 0, k = 0;
    int[] union = new int[a.length + b.length];

    while (i < a.length && j < b.length) {

      if (a[i] < b[j]) {
        if (k == 0 || union[k - 1] != a[i]) {
          union[k++] = a[i];
        }
        i++;
      } else if (a[i] > b[j]) {
        if (k == 0 || union[k - 1] != b[j]) {
          union[k++] = b[j];
        }
        j++;
      } else {
        if (k == 0 || union[k - 1] != a[i]) {
          union[k++] = a[i];
        }
        i++;
        j++;
      }
    }

    while (i < a.length) {
      if (k == 0 || union[k - 1] != a[i]) {
        union[k++] = a[i];
      }
      i++;
    }

    while (j < b.length) {
      if (k == 0 || union[k - 1] != b[j]) {
        union[k++] = b[j];
      }
      j++;
    }

    for (int x = 0; x < k; x++) {
      System.out.print(union[x] + " ");
    }
    System.out.println();
  }

}
