package com.strivers.sorting;

public class Bubble {

  public static void tryBubbleSorting(int[] arr) {

    // swap when arr[j] > arr[j+1];

    int n = arr.length;

    for (int i = n - 1; i >= 0; i--) {
      boolean didSwap = false;
      for (int j = 0; j < i; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          didSwap = true;
        }
      }
      if (!didSwap) {
        break;
      }
    }
    

    for(int num: arr){
      System.out.print(num + " ");
    }

    System.out.println();

  }
}
