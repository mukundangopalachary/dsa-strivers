package com.strivers.graphs.shortest_path_algorithms.problems;

import java.util.*;

public class MinimumEffortPath {

  public int minimumEffortPath(int[][] heights) {
    PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

    int m = heights.length;
    int n = heights[0].length;

    int[][] directions = {
      {-1, 0},
      {1, 0},
      {0, -1},
      {0, 1}
    };

    int[][] dist = new int[m][n];

    for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);

    pq.offer(new int[] {0, 0, 0}); // effort, row, col
    dist[0][0] = 0;

    while (!pq.isEmpty()) {
      int[] node = pq.poll();

      int d = node[0];
      int r = node[1];
      int c = node[2];

      if (dist[r][c] < d) continue;

      if (r == m - 1 && c == n - 1) return d;

      for (int[] dir : directions) {
        int nr = r + dir[0];
        int nc = c + dir[1];

        if (nr < 0 || nc < 0 || nr >= m || nc >= n) continue;

        int new_dist = Math.max(d, Math.abs(heights[r][c] - heights[nr][nc]));

        if (dist[nr][nc] > new_dist) {
          dist[nr][nc] = new_dist;
          pq.offer(new int[] {new_dist, nr, nc});
        }
      }
    }

    return 0;
  }
}
