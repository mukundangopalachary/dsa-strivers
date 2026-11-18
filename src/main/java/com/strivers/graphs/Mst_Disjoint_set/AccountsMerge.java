package com.strivers.graphs.Mst_Disjoint_set;

import java.util.*;

class DSU {

  private int[] rank;
  private int[] parent;

  DSU(int n) {
    rank = new int[n];
    parent = new int[n];

    Arrays.fill(rank, 1);

    for (int i = 0; i < n; i++) {
      parent[i] = i;
    }
  }

  int find(int x) {
    if (parent[x] == x) {
      return x;
    }

    return parent[x] = find(parent[x]);
  }

  void union(int a, int b) {

    int pa = find(a);
    int pb = find(b);

    if (pa == pb) {
      return;
    }

    if (rank[pa] < rank[pb]) {
      parent[pa] = pb;
    } else if (rank[pa] > rank[pb]) {
      parent[pb] = pa;
    } else {
      parent[pb] = pa;
      rank[pa]++;
    }
  }
}

public class AccountsMerge {

  public List<List<String>> accountsMerge(List<List<String>> accounts) {

    int n = accounts.size();

    DSU dsu = new DSU(n);

    // email -> account index
    Map<String, Integer> emailMap = new HashMap<>();

    // Build connected components
    for (int i = 0; i < n; i++) {

      // index 0 is the account name
      for (int j = 1; j < accounts.get(i).size(); j++) {

        String email = accounts.get(i).get(j);

        if (!emailMap.containsKey(email)) {

          emailMap.put(email, i);

        } else {

          dsu.union(emailMap.get(email), i);
        }
      }
    }

    // root -> emails belonging to that component
    List<List<String>> merged = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      merged.add(new ArrayList<>());
    }

    for (Map.Entry<String, Integer> entry : emailMap.entrySet()) {

      String email = entry.getKey();
      int account = entry.getValue();

      int root = dsu.find(account);

      merged.get(root).add(email);
    }

    List<List<String>> answer = new ArrayList<>();

    for (int i = 0; i < n; i++) {

      if (merged.get(i).isEmpty()) {
        continue;
      }

      Collections.sort(merged.get(i));

      List<String> current = new ArrayList<>();

      // Account name
      current.add(accounts.get(i).get(0));

      // Emails
      current.addAll(merged.get(i));

      answer.add(current);
    }

    return answer;
  }
}
