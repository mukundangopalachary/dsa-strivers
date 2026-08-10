package com.strivers.graphs.shortest_path_algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {

  public int[] directedDijkstra(int n, int m, int[][] edges, int src) {
    boolean[] visited = new boolean[n];
    List<List<int[]>> G = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      G.add(new ArrayList<>());
    }

    for (int[] e : edges) {
      G.get(e[0]).add(new int[] {e[1], e[2]}); // e[2] -> weight
    }

    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
    int[] dist = new int[n];
    Arrays.fill(dist, (int) 1e9);

    pq.offer(new int[] {src, 0});

    visited[src] = true;
    dist[src] = 0;

    while (!pq.isEmpty()) {
      int[] node = pq.poll();

      if (visited[node[0]]) continue;

      if (node[1] < dist[node[0]]) continue;

      visited[node[0]] = true;

      for (int[] neigh : G.get(node[0])) {
        int u = neigh[0];
        int wt = neigh[1];

        if (!visited[u] && dist[node[0]] + wt < dist[u]) {
          dist[u] = dist[node[0]] + wt;
          pq.offer(new int[] {u, dist[u]});
        }
      }
    }

    for (int i = 0; i < n; i++) {
      if (dist[i] == (int) 1e9) dist[i] = -1;
    }

    return dist;
  }
}
