package com.strivers.graphs.learning;

import java.util.ArrayList;
import java.util.List;

public class TraverseDfs {

  static boolean[] visited;

  public static List<Integer> Traverse(int V, List<List<Integer>> adj_list) {
    List<Integer> traverse = new ArrayList<>();

    visited = new boolean[V];

    dfs(0, adj_list, traverse);

    return traverse;
  }

  public static void dfs(int v, List<List<Integer>> adj_list, List<Integer> traverse) {
    visited[v] = true;

    traverse.add(v);

    for (int num : adj_list.get(v)) {
      if (!visited[num]) {
        dfs(num, adj_list, traverse);
      }
    }
  }

  void print(List<Integer> res) {
    for (int num : res) {
      System.out.print(num + " ");
    }

    System.out.println();
  }
}
