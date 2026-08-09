package com.strivers.graphs.shortest_path_algorithms;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class NoWeightUndirectedShortestPath {

  public int[] shortestPathFrom(int src, int[][] edges, int V, int M) {

    List<List<Integer>> graph = new ArrayList<>();

    for (int i = 0; i < V; i++) {
      graph.add(new ArrayList<>());
    }

    for (int[] edge : edges) {
      graph.get(edge[0]).add(edge[1]);
      graph.get(edge[1]).add(edge[0]);
    }

    int[] dist = new int[V];
    Arrays.fill(dist, (int) 1e9);

    Deque<Integer> q = new ArrayDeque<>();
    q.offer(src);
    dist[src] = 0;

    while (!q.isEmpty()) {
      int node = q.poll();

      for (int neigh : graph.get(node)) {
        if (dist[node] + 1 < dist[neigh]) {
          dist[neigh] = dist[node] + 1;
          q.offer(neigh);
        }
      }
    }

    for (int i = 0; i < V; i++) {
      if (dist[i] == (int) 1e9) dist[i] = -1;
    }

    return dist;
  }
}
