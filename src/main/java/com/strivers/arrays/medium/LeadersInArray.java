package com.strivers.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArray {

  public static void leadersInArray(int[] arr){

    int n = arr.length;
    if(n==0)return;
    List<Integer> leaders = new ArrayList<>();
    
    leaders.add(arr[n-1]);
    int max = arr[n-1];

    for(int i = n - 2; i>=0; i--){
      if(arr[i] >= max){
        leaders.add(0, arr[i]);
        max = arr[i];
      }
    }
  

    for(int i = 0; i<leaders.size(); i++){
      System.out.print(leaders.get(i) + " ");
    }
    System.out.println();
  }
}
