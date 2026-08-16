package com.strivers.graphs.shortest_path_algorithms.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class NetworkDelayTime {

  public int networkDelayTime(int[][] times, int n, int k) {

    List<List<int[]>> g = new ArrayList<>();

    for (int i = 0; i <= n; i++) {
      g.add(new ArrayList<>());
    }

    for (int[] e : times) {
      int u = e[0];
      int v = e[1];
      int w = e[2];

      g.get(u).add(new int[] {w, v});
    }

    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

    int[] dist = new int[n + 1];
    Arrays.fill(dist, (int) 1e9);

    boolean[] visited = new boolean[n + 1];

    pq.offer(new int[] {0, k});
    dist[k] = 0;

    while (!pq.isEmpty()) {

      int[] curr = pq.poll();

      int d = curr[0];
      int node = curr[1];

      if (visited[node]) continue;

      visited[node] = true;

      for (int[] neighbor : g.get(node)) {

        int weight = neighbor[0];
        int neighborNode = neighbor[1];

        if (dist[neighborNode] > d + weight) {

          dist[neighborNode] = d + weight;

          pq.offer(new int[] {dist[neighborNode], neighborNode});
        }
      }
    }

    int ans = 0;

    for (int i = 1; i <= n; i++) {

      if (dist[i] == (int) 1e9) return -1;

      ans = Math.max(ans, dist[i]);
    }

    return ans;
  }
}
