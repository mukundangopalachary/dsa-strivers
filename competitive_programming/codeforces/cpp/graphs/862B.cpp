#include <iostream>
#include <queue>
#include <vector>

using namespace std;

int main(){

  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;

  vector<vector<int>> adj(n + 1);

  for(int i = 0; i < n - 1; i++){
    int u, v;
    cin >> u >> v;

    adj[u].push_back(v);
    adj[v].push_back(u);
  }

  queue<int> q;
  vector<int> color(n + 1, -1);

  for(int i = 1; i <= n; i++){
    if(color[i] == -1){
      q.push(i);
      color[i] = 0;

      while(!q.empty()){
        int node = q.front(); q.pop();

        for(const auto& child : adj[node]){
          if(color[child] == -1){
            color[child] = 1 - color[node];
            q.push(child);
          }
        }
      }
    }
  }

  long long zeros = 0, ones = 0;
  for(int i = 1; i <=n; i++){
    if(color[i]) ones++;
    else zeros++;
  }

  // cout << zeros << " " << ones << " " << '\n';
  cout << (ones * zeros) - (n - 1) << '\n';
  return 0;
}
