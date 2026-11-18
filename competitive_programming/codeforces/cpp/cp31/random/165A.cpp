#include "bits/stdc++.h"
#include <vector>

using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n; cin >> n;
  vector<vector<int>> coord;

  for(int i = 0; i < n; i++){
    int x,y; cin >> x >> y;

    coord.push_back({x,y});
  }

  int ans = 0;

  for(int i = 0; i < n; i++){
    int l = 0, r = 0, u = 0, d = 0;

    for(int j = 0; j < n; j++){
      if(i == j) continue;

      int x1 = coord[i][0], y1 = coord[i][1], x2 = coord[j][0], y2 =  coord[j][1];
      if(x1 < x2 && y1 == y2) r++;
      else if(x1 > x2 && y1 == y2) l++;
      else if(x1 == x2 && y1 > y2) d++;
      else if (x1 == x2 && y1 < y2) u++;
    }

    if(l > 0 && r > 0 && d > 0 && u > 0) ans++;
  }

  cout << ans << '\n';
  return 0;
}
