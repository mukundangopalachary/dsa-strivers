#include <iostream>
#include <vector>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int V, N;

  cin >> V >> N;

  vector<vector<int>> edges(N, vector<int>(3));
  vector<long long> list, dist(V, 0);

  vector<int> parent(V, -1);

  for (int i = 0; i < N; i++) {
    int u, v, w;

    cin >> u >> v >> w;

    edges[i][0] = u;
    edges[i][1] = v;
    edges[i][2] = w;
  }

  bool cycle = false;
  dist[0] = 0;

  int x = -1;

  for (int i = 0; i < V; i++) {

    for (const auto &e : edges) {
      int u = e[0];
      int v = e[1];
      int w = e[2];

      if (dist[u - 1] != 1e8 && dist[v - 1] > dist[u - 1] + w) {
        if (i == V - 1) {
          x = v;
        }
        dist[v - 1] = dist[u - 1] + w;
        parent[v - 1] = u - 1;
      }
    }
  }

  if (x == -1) {
    cout << "NO\n";
    return 0;
  } else {
  }
};
