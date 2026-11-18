package com.strivers.graphs.bipartite;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class FordFulkersonMaxFlowAlgorithm {

  /* Returns true if there is a path from source 's' to
        sink 't' in residual graph. Also fills parent[] to
        store the path */

  // basically checks if there is an Augmented Path
  public boolean bfs(int[][] residualGraph, int s, int d, int[] parent){
    boolean[] visited = new boolean[parent.length];
    Arrays.fill(visited, false);

    Deque<Integer> q = new ArrayDeque<>();
    q.offer(s);
    visited[s] = true;
    parent[s] = -1;

    while(!q.isEmpty()){
      int u = q.poll();

      for(int v = 0; v < parent.length; v++){
        if(visited[v] == false && residualGraph[u][v] > 0){
          if(v == d) return true;
        }

        q.offer(v);
        visited[v] = true;
        parent[v] = u;
      }
    }

    return false;
  }

  public int fordFaulkerson(int[][] graph, int s, int d){
    int flow = 0;
    int V = graph.length;

    int[][] residualGraph = new int[V][V];

    for(int u = 0; u < V; u++){
      for(int v = 0; v < V; v++){
        residualGraph[u][v] = graph[u][v];
      }
    }

    int[] parent = new int[V];

    while(bfs(residualGraph, s, d, parent)){

      int path_flow = Integer.MAX_VALUE;

      for(int v = d; v != s; v = parent[v]){
        int u = parent[v];
        path_flow = Math.min(path_flow, residualGraph[u][v]);
      }


    }

    return flow;
  }
}
