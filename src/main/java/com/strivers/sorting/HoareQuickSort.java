package com.strivers.sorting;

public class HoareQuickSort {

  public static void tryHoareQuickSorting(int[] arr) {

    hoareSort(arr, 0, arr.length - 1);

    for (int num : arr)
      System.out.print(num + " ");
    System.out.println();

  }

  public static void hoareSort(int[] arr, int l, int h) {

    if (l < h) {
      int pivotIndex = partition(arr, l, h);

      hoareSort(arr, l, pivotIndex);
      hoareSort(arr, pivotIndex + 1, h);
    }
  }

  public static int partition(int[] arr, int l, int h) {

    int pivot = arr[l];
    int i = l - 1;
    int j = h + 1;

    while (true) {

      do
        i++;
      while (arr[i] < pivot);

      do
        j--;
      while (arr[j] > pivot);

      if (i >= j) {
        return j;
      }

      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
  }
}
