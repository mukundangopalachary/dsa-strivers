package com.strivers.graphs.Mst_Disjoint_set;

import java.util.Arrays;

public class PrimsAdjacencyMatrix {

  int INF = Integer.MAX_VALUE;

  public void primMST(int[][] graph){

    int V = graph.length;

    int[] parent = new int[V];
    int[] key = new int[V];
    boolean[] inMst = new boolean[V];

    Arrays.fill(key, INF);
    Arrays.fill(inMst, false);

    key[0] = 0;
    parent[0] = -1;

    for(int i = 0; i < V; i++){
      int u = minKey(key, inMst);
      inMst[u] = true;

      for(int v = 0; v < V; v++){

        if(graph[u][v] != 0 && inMst[v] == false && graph[u][v] < key[v]){
          parent[v] = u;
          key[v] = graph[u][v];
        }
      }
    }
  }

  private int minKey(int[] key, boolean[] inMst){

    int min = INF;
    int min_index = -1;

    for(int i = 0; i < inMst.length; i++){
      if(inMst[i] == false && key[i] < min){
        min = key[i];
        min_index = i;
      }
    }
    
    return min_index;
  }
}
