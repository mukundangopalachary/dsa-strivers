package com.strivers.recursion.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueen {

  public List<List<String>> solveNQueens(int n) {
    List<List<String>> list = new ArrayList<>();
    char[][] board = new char[n][n];

    for (char[] arr : board) {
      Arrays.fill(arr, '.');
    }

    backtrack(0, list, board);
    return list;
  }

  public void backtrack(int row, List<List<String>> list, char[][] board) {
    if (row == board.length) {
      list.add(convert(board));

      return;
    }

    for (int col = 0; col < board.length; col++) {
      if (isSafe(row, col, board)) {
        board[row][col] = 'Q';
        backtrack(row + 1, list, board);
        board[row][col] = '.';
      }
    }
  }

  public boolean isSafe(int row, int col, char[][] board) {
    int n = board.length;
    for (int i = 0; i < row; i++) {
      if (board[i][col] == 'Q') {
        return false;
      }
    }

    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      if (board[i][j] == 'Q')
        return false;
    }

    for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
      if (board[i][j] == 'Q')
        return false;
    }

    return true;
  }

  public List<String> convert(char[][] board) {

    List<String> curr = new ArrayList<>();
    for (char[] c : board) {
      curr.add(new String(c));
    }

    return curr;
  }

}
