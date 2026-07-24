package com.strivers.graphs.dfs_bfs;

/* import java.io.BufferedReader;
import java.io.InputStreamReader;
 */

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class KeysAndRooms {

  public boolean canVisitAllRooms(int[][] rooms) {

    int n = rooms.length;

    boolean[] visited = new boolean[n];
    Arrays.fill(visited, false);

    Deque<Integer> q = new ArrayDeque<>();
    q.offer(0);

    while (!q.isEmpty()) {

      int curr = q.poll();

      visited[curr] = true;

      if (rooms[curr].length == 0) continue;

      for (int vertex : rooms[curr]) {
        if (!visited[vertex]) {
          q.offer(vertex);
        }
      }
    }

    for (boolean val : visited) {
      if (val == false) return false;
    }

    return true;
  }
}
