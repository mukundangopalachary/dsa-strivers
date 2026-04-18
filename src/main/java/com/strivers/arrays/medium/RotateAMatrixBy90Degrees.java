package com.strivers.arrays.medium;

public class RotateAMatrixBy90Degrees {

  public void rotate(int[][] matrix) {
    if (matrix.length <= 1)
      return;
    int m = matrix.length;

    for (int i = 0; i < m; i++) {
      for (int j = i + 1; j < m; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }

    for (int i = 0; i < m; i++) {
      reverse(matrix[i]);
    }

  }

  public void reverse(int[] row) {
    int left = 0, right = row.length - 1;
    while (left < right) {
      int temp = row[left];
      row[left] = row[right];
      row[right] = temp;
      left++;
      right--;
    }
  }
}
