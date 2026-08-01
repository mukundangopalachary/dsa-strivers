package com.strivers.graphs.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
  public int orangesRotting(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;

    boolean[][] visited = new boolean[m][n];
    int fresh = 0;

    Queue<int[]> queue = new LinkedList<>();

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (grid[i][j] == 1) {
          fresh++;
        } else if (grid[i][j] == 2) {
          queue.offer(new int[] {i, j});
          visited[i][j] = true;
        }
      }
    }

    if (fresh == 0) return 0;

    int[][] directions = {
      {1, 0},
      {-1, 0},
      {0, 1},
      {0, -1}
    };

    int minutes = -1;

    while (!queue.isEmpty()) {
      int size = queue.size();
      minutes++;

      for (int i = 0; i < size; i++) {
        int[] coord = queue.poll();

        for (int[] dir : directions) {
          int x = coord[0] + dir[0];
          int y = coord[1] + dir[1];

          if (x < 0 || y < 0 || x >= m || y >= n) continue;

          if (grid[x][y] == 0 || visited[x][y]) continue;

          visited[x][y] = true;
          fresh--;
          queue.offer(new int[] {x, y});
        }
      }
    }

    return fresh == 0 ? minutes : -1;
  }
}
