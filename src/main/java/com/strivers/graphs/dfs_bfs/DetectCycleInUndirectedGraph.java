package com.strivers.graphs.dfs_bfs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DetectCycleInUndirectedGraph {

  public boolean detectCycleDFS(List<List<Integer>> adj_list, int V) throws NullPointerException {

    boolean[] visited = new boolean[V];

    if (adj_list == null) throw new NullPointerException("The Adjacency List is EMPTY!!!");

    for (int i = 0; i < V; i++) {
      if (!visited[i]) if (dfs(i, visited, adj_list, -1)) return true;
    }

    return false;
  }

  public boolean dfs(int i, boolean[] visited, List<List<Integer>> adj_list, int parent) {
    visited[i] = true;

    for (int node : adj_list.get(i)) {

      if (!visited[node]) {
        if (dfs(node, visited, adj_list, i)) return true;
      } else if (node != parent) {
        return true;
      }
    }

    return true;
  }

  public boolean bfs(int i, boolean[] visited, List<List<Integer>> adj_list) {

    Queue<int[]> q = new LinkedList<>();

    q.offer(new int[] {i, -1});
    visited[i] = true;

    while (!q.isEmpty()) {
      int[] curr = q.poll();

      for (int node : adj_list.get(curr[0])) {
        if (!visited[node]) {
          visited[node] = true;
          q.offer(new int[] {node, curr[0]});
        } else if (node != curr[1]) return true;
      }
    }

    return false;
  }

  public boolean detectCycleBFS(List<List<Integer>> adj_list, int V) throws NullPointerException {
    boolean[] visited = new boolean[V];

    if (adj_list == null) throw new NullPointerException("The Adjacency List is EMPTY!!!");

    for (int i = 0; i < V; i++) {

      if (!visited[i]) {
        if (bfs(i, visited, adj_list)) return true;
      }
    }

    return false;
  }
}
