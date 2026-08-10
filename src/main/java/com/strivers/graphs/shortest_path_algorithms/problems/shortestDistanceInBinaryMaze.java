package com.strivers.graphs.shortest_path_algorithms.problems;

import java.util.LinkedList;
import java.util.Queue;

public class shortestDistanceInBinaryMaze {

  int[][] directions;

  public int shortestPathBinaryMatrix(int[][] grid) {
    int n = grid.length;

    if (grid[0][0] != 0 || grid[n - 1][n - 1] != 0) return -1;

    if (n == 1) return 1;

    directions = new int[][] {{-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1}};

    return bfs(0, 0, grid);
  }

  public int bfs(int i, int j, int[][] grid) {
    int n = grid.length;

    Queue<int[]> q = new LinkedList<>();
    q.offer(new int[] {i, j});

    grid[i][j] = 1;

    while (!q.isEmpty()) {
      int[] node = q.poll();

      if (node[0] == n - 1 && node[1] == n - 1) return grid[node[0]][node[1]];

      for (int[] dir : directions) {
        int u = node[0] + dir[0];
        int v = node[1] + dir[1];

        if (u < 0 || v < 0 || u >= n || v >= n) continue;

        if (grid[u][v] != 0) continue;

        grid[u][v] = grid[node[0]][node[1]] + 1;

        q.offer(new int[] {u, v});
      }
    }

    return -1;
  }
}
