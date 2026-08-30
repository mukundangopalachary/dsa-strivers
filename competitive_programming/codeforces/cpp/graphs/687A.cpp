#include <iostream>
#include <vector>
#include <queue>

using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n,m; // vertices, edges
  cin >> n >> m;

  vector<vector<int>> adj(n + 1);

  for(int i = 0; i < m; i++){
    int u, v;
    cin >> u >> v;

    adj[u].push_back(v);
    adj[v].push_back(u);
  }

  vector<int> color(n + 1, -1); // 0 -> PARI, 1 -> ARYA, -1 -> MINE

  queue<int> q;

  for(int i = 1; i <= n; i++){
    if(color[i] == -1){

      color[i] = 0;
      q.push(i);

      while(!q.empty()){
        auto node = q.front(); q.pop();

        for(const auto& neigh: adj[node]){
          if(color[neigh] == -1){
            color[neigh] = 1 - color[node];
            q.push(neigh);
          }else if(color[neigh] == color[node]){
            cout << -1 << "\n";
            return 0;
          }
        }
      }
    }
  }

  vector<int> pari, arya;

  for(int clr = 1; clr <= n; clr++){

    if (adj[clr].empty())
                continue;

    if(color[clr] == 0) pari.push_back(clr);
    else if(color[clr] == 1) arya.push_back(clr);
  }

  cout << arya.size() << '\n';
  for(int num : arya) cout << num << " ";
  cout << '\n';

  cout << pari.size() << '\n';
  for(int num : pari) cout << num << " ";
  cout << "\n";


  return 0;
}
