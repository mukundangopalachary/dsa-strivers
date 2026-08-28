package com.strivers.graphs.bipartite;

import java.util.List;

public class MinimumBipartiteGroup {

	public int height(int node, List<List<Integer>> adj, boolean[] visited){
	  visited[node] = true;

		int h = 0;
		for(int child : adj.get(node)){
		  if(visited[child] == false){
				h = Math.max(h, 1 + height(child, adj, visited));
			}
		}

		return h;
	}

	public int minimumBipartiteGroup(List<List<Integer>> adj, int N){

	  boolean[] visited = new boolean[N + 1];
		int groups = Integer.MIN_VALUE;

		for(int i = 1; i <= N; i++){
		  if(!visited[i]){
				groups = Math.max(groups, height(i, adj, visited));
			}
		}

		return groups;
	}
}
