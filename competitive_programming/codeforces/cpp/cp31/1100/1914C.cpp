#include "bits/stdc++.h"
#include <algorithm>
using namespace std;

void solve(){
  int n,k;

  cin >> n >> k;

  vector<long long> a(n), b(n);
  long long sum = 0;
  long long mx = 0;
  long long res = 0;

  for(auto &x: a) cin >> x;
  for(auto &x: b) cin >> x;



  for(int i = 0; i < min(n,k); i++){
    sum += a[i];
    mx = max(mx, b[i]);
    res = max(res, sum + mx * (k - 1 - i));
  }

  cout << res << '\n';
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
