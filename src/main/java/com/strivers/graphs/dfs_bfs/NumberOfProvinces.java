package com.strivers.graphs.dfs_bfs;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumberOfProvinces {

  public int findCircleNum(int[][] isConnected) {
    int V = isConnected.length;

    boolean[] visited = new boolean[V];
    int res = 0;
    for (int i = 0; i < V; i++) {
      if (!visited[i]) {
        bfs(i, isConnected, visited);
        ++res;
      }
    }

    return res;
  }

  public void bfs(int start, int[][] graph, boolean[] visited) {

    Deque<Integer> q = new ArrayDeque<>();
    q.offer(start);
    visited[start] = true;

    while (!q.isEmpty()) {
      int node = q.poll();

      for (int neighbor = 0; neighbor < graph.length; neighbor++) {
        if (graph[node][neighbor] == 1 && !visited[neighbor]) {
          q.offer(neighbor);
          visited[neighbor] = true;
        }
      }
    }
  }
}
