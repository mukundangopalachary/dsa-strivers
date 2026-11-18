#include <algorithm>
#include <iostream>
#include <queue>
#include <set>
#include <vector>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n, m, k;
  cin >> n >> m >> k;

  vector<vector<int>> adj(n + 1);

  for (int i = 0; i < m; i++) {
    int u, v;
    cin >> u >> v;
    adj[u].push_back(v);
    adj[v].push_back(u);
  }

  set<tuple<int, int, int>> forbidden;

  for (int i = 0; i < k; i++) {
    int u, v, x;
    cin >> u >> v >> x;
    forbidden.insert(make_tuple(u, v, x));
  }

  queue<pair<int, int>> q;

  vector<vector<bool>> visited(n + 1, vector<bool>(n + 1, false));
  vector<vector<pair<int, int>>> parent(n + 1,
                                        vector<pair<int, int>>(n + 1, {0, 0}));

  q.push({0, 1});

  bool flag = false;
  int fv = 0, fn = 0;
  while (!q.empty()) {
    auto node = q.front();
    q.pop();

    int u = node.first;
    int v = node.second;

    if (v == n) {
      flag = true;
      fv = u, fn = v;
      break;
    }

    for (const auto &neigh : adj[v]) {
      if (forbidden.count({u, v, neigh}))
        continue;

      if (visited[v][neigh] == true)
        continue;

      q.push({v, neigh});
      visited[v][neigh] = true;
      pair<int, int> p = {u, v};
      parent[v][neigh] = p;
    }
  }

  if (flag) {
    vector<int> path;

    while (fn != 1) {
      path.push_back(fn);

      auto p = parent[fv][fn];
      fv = p.first;
      fn = p.second;
    }

    path.push_back(1);
    reverse(path.begin(), path.end());

    cout << path.size() - 1 << '\n';

    for (int x : path)
      cout << x << ' ';
  } else {
    cout << -1;
  }
  return 0;
}
