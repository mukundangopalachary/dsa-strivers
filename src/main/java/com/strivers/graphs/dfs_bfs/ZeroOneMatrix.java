package com.strivers.graphs.dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {

  public int[][] updateMatrix(int[][] mat) {
    int m = mat.length;
    int n = mat[0].length;

    Queue<int[]> queue = new LinkedList<>();

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (mat[i][j] == 0) {
          queue.offer(new int[] {i, j});
        } else {
          mat[i][j] = Integer.MAX_VALUE;
        }
      }
    }

    int[][] directions = {
      {0, 1},
      {0, -1},
      {1, 0},
      {-1, 0}
    };

    while (!queue.isEmpty()) {
      int[] cell = queue.poll();

      int i = cell[0];
      int j = cell[1];

      for (int[] dir : directions) {
        int dx = i + dir[0];
        int dy = j + dir[1];

        if (dx < 0 || dy < 0 || dx >= m || dy >= n || mat[i][j] >= mat[dx][dy]) continue;

        System.out.println(mat[i][j] + " and " + mat[dx][dy]);

        mat[dx][dy] = mat[i][j] + 1;
        queue.offer(new int[] {dx, dy});
      }
    }

    return mat;
  }
}
