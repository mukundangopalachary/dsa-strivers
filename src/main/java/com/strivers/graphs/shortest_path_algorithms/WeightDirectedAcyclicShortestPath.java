package com.strivers.graphs.shortest_path_algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class WeightDirectedAcyclicShortestPath {

  public int[] shortestDistanceTopoSort(int n, int m, int[][] edges) {

    Stack<Integer> st = new Stack<>();

    List<List<int[]>> adj_wt = new ArrayList<>();
    for (int i = 0; i < n; i++) adj_wt.add(new ArrayList<>());

    for (int[] e : edges) {
      int u = e[0];
      int v = e[1];
      int wt = e[2];

      adj_wt.get(u).add(new int[] {v, wt});
    }

    boolean[] visited = new boolean[n];

    for (int i = 0; i < n; i++) {
      if (!visited[i]) {
        topoSort(i, adj_wt, visited, st);
      }
    }

    int[] dist = new int[n];
    Arrays.fill(dist, (int) 1e9);

    dist[0] = 0;

    while (!st.isEmpty()) {
      int node = st.pop();
      if (dist[0] != (int) 1e9) {
        for (int[] neigh : adj_wt.get(node)) {
          int v = neigh[0];
          int wt = neigh[1];

          if (dist[node] + wt < dist[v]) {
            dist[v] = dist[node] + wt;
          }
        }
      }
    }

    for (int i = 0; i < n; i++) {
      if (dist[i] == (int) 1e9) dist[i] = -1;
    }

    return dist;
  }

  public void topoSort(int node, List<List<int[]>> adj, boolean[] visited, Stack<Integer> st) {
    visited[node] = true;

    for (int[] neigh : adj.get(node)) {
      if (!visited[neigh[0]]) {
        topoSort(neigh[0], adj, visited, st);
      }
    }

    st.push(node);
  }
}
