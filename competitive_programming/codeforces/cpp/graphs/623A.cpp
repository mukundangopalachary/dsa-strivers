#include <iostream>
#include <queue>
#include <vector>
using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int V, E; // vertices and edges
  cin >> V >> E;

  vector<vector<int>> adj(V + 1);

  for(int i = 0; i < E; i++){
    int u, v;
    cin >> u >> v;

    adj[u].push_back(v);
    adj[v].push_back(u);
  }

  queue<int> q;
  vector<char> color(V + 1, 'b');
  for(int i = 1; i <= V; i++){
    if(color[i] == 'b'){
      q.push(i);

      while(!q.empty()){
        int u = q.front(); q.pop();

        for(const auto& v : adj[u]){
          if(color[v] == 'b'){
            if(color[u] == 'c' || color[u] == 'a') color[v] = 'b';
            else color[v] = 'a';
          }
        }
      }
    }
  }
}
