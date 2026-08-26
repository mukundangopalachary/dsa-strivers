package com.strivers.graphs.bipartite;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class IdentifyBipartiteBFS {

  public List<List<Integer>> constructAdj(int V, List<List<Integer>> edges) {

    List<List<Integer>> adj = new ArrayList<>();

    for (int i = 0; i < V; i++)
      adj.add(new ArrayList<>());

    for (List<Integer> e : edges) {
      int u = e.get(0);
      int v = e.get(1);

      adj.get(u).add(v);
      adj.get(v).add(u);
    }

    return adj;
  }

  public boolean isBiPartite(int V, List<List<Integer>> edges) {

    if (V % 2 != 0)
      return false;

    List<List<Integer>> adj = constructAdj(V, edges);

    Deque<Integer> q = new ArrayDeque<>();
    int[] color = new int[V];
    Arrays.fill(color, -1);

    for (int i = 0; i < V; i++) {
      if (color[i] == -1) {
        color[i] = 0;
        q.offer(i);

        while (!q.isEmpty()) {
          int u = q.poll();

          for (int v : adj.get(u)) {
            if (color[v] == -1) {
              color[v] = 1 - color[u];
              q.offer(v);
            } else if (color[v] == color[u])
              return false;
          }
        }
      }
    }

    return true;
  }
}
