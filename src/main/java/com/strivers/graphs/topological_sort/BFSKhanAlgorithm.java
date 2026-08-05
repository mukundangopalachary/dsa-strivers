package com.strivers.graphs.topological_sort;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BFSKhanAlgorithm {

  public List<Integer> bfsKhanAlgorithm(List<List<Integer>> adj) {

    int n = adj.size();
    int[] in_degree = new int[n];

    for (int i = 0; i < n; i++) {
      for (int num : adj.get(i)) {
        in_degree[num]++;
      }
    }

    Deque<Integer> q = new ArrayDeque<>();

    for (int i = 0; i < n; i++) {
      if (in_degree[i] == 0) q.offer(i);
    }

    List<Integer> sortedNodes = new ArrayList<>();

    while (!q.isEmpty()) {
      int node = q.poll();
      sortedNodes.add(node);

      for (int neigh : adj.get(node)) {
        in_degree[neigh]--;
        if (in_degree[neigh] == 0) {
          q.offer(neigh);
        }
      }
    }

    return sortedNodes;
  }
}
