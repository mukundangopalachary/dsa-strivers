package com.strivers.sorting;

public class Insertion {

  public static void tryInsertionSorting(int[] arr) {
    int n = arr.length;

    for(int i = 1; i<n; i++){
      int key = arr[i];
      int j = i-1;

      while(j>=0 && arr[j] > key){
        arr[j+1] = arr[j];
        j--;
      }

      arr[j+1] = key; 
    }

    for(int num:arr){
      System.out.print(num + " ");
    }

    System.out.println();
  }
}
