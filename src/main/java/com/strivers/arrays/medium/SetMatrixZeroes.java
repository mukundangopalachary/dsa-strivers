package com.strivers.arrays.medium;

public class SetMatrixZeroes {
  
  public void setZeroes(int[][] matrix) {
      int m = matrix.length;// no of rows
      int n = matrix[0].length; //no of cols
      
      boolean firstRowZero = false;
      boolean firstColZero = false;

      for(int i = 0; i<n; i++){
        if(matrix[0][i] == 0){
          firstRowZero = true;
          break;
        }
      }

      for(int j = 0; j<m; j++){
        if(matrix[j][0] == 0){
          firstColZero = true;
          break;
        }
      }

      for(int i = 1; i< m; i++){
        for(int j = 1; j<n; j++){
          if(matrix[i][j] == 0){
            matrix[0][j] = 0;
            matrix[i][0] = 0;
          }
        }
      }
      

      for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
          if (matrix[i][0] == 0 || matrix[0][j] == 0) {
            matrix[i][j] = 0;
          }
        }
      }

      //making first row zero if needed
      if(firstRowZero){
        for (int j = 0; j < n; j++) {
          matrix[0][j] = 0;
        }
      }
      

      //making first column zero if needed
      if(firstColZero){
        for (int j = 0; j < m; j++) {
          matrix[j][0] = 0;
        }
      }
  }
}

//use first row and column of the matrix itself to store whether a row or column needs to be zeroed
//
//two flags:
//  firstRowZero: default=> false ==> iterate and find if they have any zero value, if yes change it to "true"
//  firstColZero: default=> false ==> iterate and find if they have any zero value, if yes change it to "true"
//
// 

