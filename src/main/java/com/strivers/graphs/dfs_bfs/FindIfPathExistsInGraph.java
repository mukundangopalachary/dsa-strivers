package com.strivers.graphs.dfs_bfs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class FindIfPathExistsInGraph {
  public boolean exists(int n, int[][] edges, int source, int destination) {
    if (source == 0 && destination == 0) return true;

    List<List<Integer>> adj = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      adj.add(new ArrayList<>());
    }

    for (int[] edge : edges) {
      int u = edge[0];
      int v = edge[1];

      adj.get(u).add(v);
      adj.get(v).add(u);
    }

    boolean[] visited = new boolean[n];
    Arrays.fill(visited, false);

    Deque<Integer> q = new ArrayDeque<>();
    q.offer(source);

    visited[source] = true;

    while (!q.isEmpty()) {
      int current = q.poll();

      if (destination == current) return true;

      for (int num : adj.get(current)) {
        if (!visited[num]) {
          visited[num] = true;
          q.offer(num);
        }
      }
    }

    return false;
  }
}
