package com.strivers.graphs.learning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ConnectedComponents {

  public static void connected(int V, int[][] edges) {

    /* //edges
    List<List<Integer>> edges = new ArrayList<>();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    try {
      int V = Integer.parseInt(br.readLine());
      for (int i = 0; i < V; i++) {
        List<Integer> row = new ArrayList<>();
        String input = br.readLine();
        String[] inp = input.split("\\s+");
        for (String num : inp) {
          row.add(Integer.parseInt(num));
        }

        edges.add(row);
      }

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        br.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    } */

    List<List<Integer>> adj_list = new ArrayList<>();

    for (int i = 0; i < V; i++) {
      adj_list.add(new ArrayList<>());
    }

    for (int[] e : edges) {
      adj_list.get(e[0]).add(e[1]);
      adj_list.get(e[1]).add(e[0]);
    }

    boolean[] visited = new boolean[V];

    int components = 0;

    for (int i = 0; i < V; i++) {

      if (!visited[i]) {
        components++;

        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        visited[i] = true;

        while (!q.isEmpty()) {
          int node = q.poll();

          for (int num : adj_list.get(node)) {
            if (!visited[num]) {
              visited[num] = true;
              q.offer(num);
            }
          }
        }
      }
    }

    System.out.println(components);
  }
}
