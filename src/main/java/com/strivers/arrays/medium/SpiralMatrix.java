package com.strivers.arrays.medium;

import java.util.List;
import java.util.ArrayList;

public class SpiralMatrix {

  public List<Integer> sprialOrder(int[][] matrix){
    List<Integer> list = new ArrayList<>();
    int top = 0, bottom = matrix.length - 1;
    int left = 0, right = matrix[0].length - 1;

    while(top<=bottom && left<=right){
      
      //"top"most row values added from "left" to "right"
      for(int i = left; i<=right; i++){
        list.add(matrix[top][i]);
      }
      top++;

      //"right"most col values added from "top" to "bottom"
      for(int i = top; i<=bottom; i++){
        list.add(matrix[i][right]);
      }
      right--;

      //"bottom"most row values added from "right"  to "left"
      if(top<=bottom){
        for(int i = right; i>= left; i--){
          list.add(matrix[bottom][i]);
        }
        bottom--;
      }
      
      //"left"most col values added from "bottom" to "top"
      if(left<=right){
        for(int i = bottom; i>=top; i--){
          list.add(matrix[i][left]);
        }
        left++;
      }
    }

    return list;
  }
}
