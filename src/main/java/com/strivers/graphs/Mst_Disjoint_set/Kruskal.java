package com.strivers.graphs.Mst_Disjoint_set;

import java.util.Arrays;

public class Kruskal {

  public int kruskalMst(int V, int[][] edges){
    int cost = 0;
    int count = 0;

    DSU dsu = new DSU(V);

    Arrays.sort(edges, (a, b) -> Integer.compare(a[0], b[0]));

    for(int[] e : edges){
      int u = e[0];
      int v = e[1];
      int wt = e[2];

      if(dsu.find(u) != dsu.find(v)){
        dsu.union(u, v);
        cost += wt;
        if(++count == V - 1) break;
      }
    }

    return cost;
  }
}

class DSU{
  int[] parent;
  int[] size;
  public DSU(int n){
    parent = new int[n];
    size = new int[n];

    for(int i = 0; i < n; i++){
      parent[i] = i;
      size[i] = 1;
    }
  }

  public int find(int x){
    if(parent[x] == x) return x;

    return parent[x] = find(x);
  }

  public boolean union(int a, int b){
    int s1 = find(a);
    int s2 = find(b);

    if(size[s1] >= size[s2]){
      parent[s2] = s1;
      size[s1] += size[s2];
    }else{
      parent[s1] = s2;
      size[s2] += size[s1];
    }

    return true;
  }

}
