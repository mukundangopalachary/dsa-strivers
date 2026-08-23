#include <iostream>
#include <vector>

using namespace std;

int dfs(vector<bool> &visited, vector<vector<int>> &adj, int node) {

  visited[node] = true;

  int depth = 1;

  for (int child : adj[node]) {
    depth = max(depth, 1 + dfs(visited, adj, child));
  }

  return depth;
}

int main() {

  int n;
  cin >> n;
  vector<int> arr(n + 1);

  for (int i = 1; i <= n; i++) {
    cin >> arr[i];
  }

  vector<vector<int>> adj(n + 1);

  for (int i = 1; i <= n; i++) {
    if (arr[i] != -1) {
      adj[arr[i]].push_back(i);
    }
  }

  vector<bool> visited(n + 1, false);
  int depth = 0;
  for (int i = 1; i <= n; i++) {
    if (arr[i] == -1) {
      depth = max(depth, dfs(visited, adj, i));
    }
  }

  cout << depth << '\n';
}
