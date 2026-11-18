#include "bits/stdc++.h"
#include <algorithm>

using namespace std;

int main(){
  int t; cin >> t;

  while(t--){
    int n; cin >> n;
    vector<int> a(n),b,c;
    for(auto &x : a) cin >> x;

    int mx = *max_element(a.begin(), a.end());

    for(int i = 0; i < n; i++){
      if(a[i] == mx) c.push_back(mx);
      else b.push_back(a[i]);
    }

    int k = b.size();
    int l = c.size();

    if(k == 0){
      cout << -1 << '\n';
    }else {
      cout << k << ' ' << l << '\n';

      for(auto &x : b) cout << x << ' ';
      cout << '\n';
      for(auto &x : c) cout << x << ' ';
      cout << '\n';
    }
  }

  return 0;
}
