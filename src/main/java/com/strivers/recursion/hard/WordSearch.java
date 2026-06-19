package com.strivers.recursion.hard;

class WordSearch {
  public boolean exist(char[][] board, String word) {
    int m = board.length;
    int n = board[0].length;

    boolean[][] visited = new boolean[m][n];
    boolean result = false;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        result = backtrack(visited, board, word, i, j, 0);
        if (result)
          return true;
      }
    }

    return false;
  }

  public boolean backtrack(boolean[][] visited, char[][] board, String word, int i, int j, int index) {
    if (index == word.length()) {
      return true;
    }

    if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] == true
        || board[i][j] != word.charAt(index)) {
      return false;
    }

    visited[i][j] = true;

    if (backtrack(visited, board, word, i + 1, j, index + 1) ||
        backtrack(visited, board, word, i - 1, j, index + 1) ||
        backtrack(visited, board, word, i, j + 1, index + 1) ||
        backtrack(visited, board, word, i, j - 1, index + 1))
      return true;

    visited[i][j] = false;
    return false;
  }
}
