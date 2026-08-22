#include <iostream>
#include <vector>

bool dfs(int node, std::vector<bool> &visited,
         std::vector<std::vector<int>> &adj) {

  visited[node] = true;

  bool isCycle = (adj[node].size() == 2);

  for (int neigh : adj[node]) {

    if (!visited[neigh]) {

      if (!dfs(neigh, visited, adj))
        isCycle = false;
    }
  }

  return isCycle;
}

int main() {

  std::ios::sync_with_stdio(false);
  std::cin.tie(nullptr);

  int V, E;
  std::cin >> V >> E;

  std::vector<std::vector<int>> edges(E), adj(V + 1);

  for (int i = 0; i < E; i++) {
    int u, v;
    std::cin >> u >> v;

    edges[i] = {u, v};
  }

  for (const auto &e : edges) {

    adj[e[0]].push_back(e[1]);
    adj[e[1]].push_back(e[0]);
  }

  int cnt = 0;
  std::vector<bool> visited(V + 1, false);

  for (int i = 1; i < V + 1; i++) {
    if (!visited[i]) {
      if (dfs(i, visited, adj))
        cnt++;
    }
  }

  std::cout << cnt << "\n";

  return 0;
}
