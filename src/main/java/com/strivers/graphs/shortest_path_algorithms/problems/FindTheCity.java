package com.strivers.graphs.shortest_path_algorithms.problems;

import java.util.Arrays;

public class FindTheCity {
 public int findTheCity(int n, int[][] edges, int distanceThreshold) {

        int INF = (int) 1e8;
        int[][] dist = new int[n][n];

        // Initialize distances to INF
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], INF);
        }

        // Initialize edges
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            int w = e[2];

            dist[u][v] = w;
            dist[v][u] = w;
        }

        // Distance from a city to itself
        for (int i = 0; i < n; i++) {
            dist[i][i] = 0;
        }

        // Floyd-Warshall
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dist[i][j] = Math.min(
                        dist[i][j],
                        dist[i][k] + dist[k][j]
                    );
                }
            }
        }

        int res = 0;
        int smallest = n;

        // Count reachable cities
        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (dist[i][j] <= distanceThreshold) {
                    count++;
                }
            }

            // <= ensures the larger index wins the tie
            if (count <= smallest) {
                res = i;
                smallest = count;
            }
        }

        return res;
    } 
}
