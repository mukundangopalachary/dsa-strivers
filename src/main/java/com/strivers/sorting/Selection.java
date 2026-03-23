package com.strivers.sorting;

import java.util.Arrays;

public class Selection {
  
  //Notes
  //Comparison-based Algo
  // 1. 

  public static void trySeclectionSorting(int[] arr){
    
    int n = arr.length;

    for(int i = 0; i<n;i++){
      int minIndex = i;
      for(int j = i ; j<n; j++){
        if(arr[j] < arr[minIndex]){
          minIndex = j;
        }
      }

      int temp = arr[i];
      arr[i] = arr[minIndex];
      arr[minIndex] = temp;
    }
    
    System.out.println(Arrays.toString(arr));
  } 
}
