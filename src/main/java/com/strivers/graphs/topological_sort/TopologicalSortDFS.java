package com.strivers.graphs.topological_sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TopologicalSortDFS {

  public List<Integer> topologicalSort(List<List<Integer>> adj) {

    int n = adj.size();
    boolean[] visited = new boolean[n];
    Stack<Integer> st = new Stack<>();

    for (int i = 0; i < n; i++) {
      if (!visited[i]) {
        dfs(i, visited, adj, st);
      }
    }

    List<Integer> sortedNodes = new ArrayList<>();

    while (!st.isEmpty()) {
      sortedNodes.add(st.pop());
    }

    return sortedNodes;
  }

  private void dfs(int node, boolean[] visited, List<List<Integer>> adj, Stack<Integer> st) {

    visited[node] = true;

    for (int neigh : adj.get(node)) {
      if (!visited[neigh]) {
        dfs(neigh, visited, adj, st);
      }
    }

    st.push(node);
  }
}
