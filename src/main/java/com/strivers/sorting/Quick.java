package com.strivers.sorting;

public class Quick {

  // uses a pivot and make sures that all the element towards it's left is smaller
  // and bigger if it is right.
  public static void tryQuickSorting(int[] arr, int low, int high) {

    if (low < high) {

      int pivotIndex = partition(arr, low, high);

      tryQuickSorting(arr, low, pivotIndex - 1);

      tryQuickSorting(arr, pivotIndex + 1, high);
    }
  }

  private static int partition(int[] arr, int low, int high) {

    int pivot = arr[high];

    int i = low;

    for(int j = low; j < high; j++){
      if(arr[j] < pivot){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        ++i;
      }
    }

    int temp = arr[high];
    arr[high] = arr[i];
    arr[i] = temp;
    return i;
  }

}
