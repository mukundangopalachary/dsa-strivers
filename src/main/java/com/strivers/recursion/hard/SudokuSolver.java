package com.strivers.recursion.hard;

public class SudokuSolver {
  public void solveSudoku(char[][] board) {
    backtrack(board);
  }

  public boolean backtrack(char[][] board) {

    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        if (board[i][j] != '.')
          continue;

        for (char k = '1'; k <= '9'; k++) {
          if (isSafe(k, i, j, board)) {
            board[i][j] = k;

            if (backtrack(board))
              return true;

            board[i][j] = '.';
          }
        }
        return false;
      }
    }

    return true;
  }

  public boolean isSafe(char num, int row, int col, char[][] board) {

    for (int i = 0; i < 9; i++) {
      if (board[i][col] == num)
        return false;
      if (board[row][i] == num)
        return false;
    }

    int startRow = (row / 3) * 3;
    int startCol = (col / 3) * 3;

    for (int i = startRow; i < startRow + 3; i++) {
      for (int j = startCol; j < startCol + 3; j++) {
        if (board[i][j] == num)
          return false;
      }
    }

    return true;
  }
}
