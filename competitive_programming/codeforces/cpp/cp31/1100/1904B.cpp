#include "bits/stdc++.h"
#include <vector>
using namespace std;

void solve(){
  int n;
  vector<long long> a(n);

  for(auto &x : a) cin >> x;

  sort(a.begin(), a.end());

  vector<long long> p(n); p[0] = a[0];

  for(int i = 1; i < n; i++) p[i] = p[i - 1] + a[i];

  vector<int> ans(n);

  for(int i = 0; i < n; i++){
    return ;
  }
}

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while(t--){
    solve();
  }
  return 0;
}
