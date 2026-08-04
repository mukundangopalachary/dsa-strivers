package com.strivers.graphs.dfs_bfs;

import java.util.ArrayList;
import java.util.List;

public class CourseSchedule {

  public boolean canFinish(int numCourses, int[][] prereq) {

    List<List<Integer>> adj = new ArrayList<>();
    for (int i = 0; i < numCourses; i++) adj.add(new ArrayList<>());

    for (int[] rel : prereq) {
      adj.get(rel[1]).add(rel[0]);
    }

    boolean[] visited = new boolean[adj.size()];
    boolean[] path = new boolean[adj.size()];

    for (int i = 0; i < adj.size(); i++) {
      if (!visited[i]) {
        if (dfs(i, adj, visited, path)) return true;
      }
    }

    return false;
  }

  public boolean dfs(int i, List<List<Integer>> adj, boolean[] visited, boolean[] path) {

    if (path[i]) return true;
    if (visited[i]) return false;

    visited[i] = true;
    path[i] = true;

    for (int neigh : adj.get(i)) {
      if (dfs(neigh, adj, visited, path)) return true;
    }

    path[i] = false;
    return false;
  }
}
