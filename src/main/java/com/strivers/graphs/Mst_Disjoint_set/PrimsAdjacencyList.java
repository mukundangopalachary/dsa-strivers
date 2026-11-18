package com.strivers.graphs.Mst_Disjoint_set;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PrimsAdjacencyList{
  public int primLMST(int V, List<List<int[]>> adj){
    
    //key, node
    PriorityQueue<int[]> pq = new PriorityQueue<>((a , b) -> a[0] - b[0]);
    
    boolean[] visited = new boolean[V];

    Arrays.fill(visited, false);

    int res = 0;

    pq.offer(new int[]{0,0});

    while(!pq.isEmpty()){
      int[] node = pq.poll();      
      int u = node[1];
      int wt = node[0];

      if(visited[u]) continue;
      visited[u] = true;

      res += wt;

      for(int[] neigh : adj.get(u)){
        if(!visited[neigh[0]]){
          pq.offer(new int[]{neigh[1], neigh[0]});
        }
      }
    }
    
    return res;
  }
}
