package com.strivers.graphs.bipartite;

import java.util.Arrays;
import java.util.List;

public class IdentifyBipartiteDFS {

  public boolean dfs(int node, int clrNum, int[] color, List<List<Integer>> adj) {

    color[node] = clrNum;

    for (int neigh : adj.get(node)) {
      if (color[neigh] == -1) {
        if (!dfs(neigh, 1 - clrNum, color, adj)) return false;
        else if (color[neigh] == clrNum) return false;
      }
    }

    return true;
  }

  public boolean isBipartite(List<List<Integer>> adj, int V) {

    int[] color = new int[V];
    Arrays.fill(color, -1);

    for (int i = 0; i < V; i++) {

      if (color[i] == -1) {
        if (!dfs(i, 0, color, adj)) return false;
      }
    }

    return true;
  }
}
