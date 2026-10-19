#include <bits/stdc++.h>

using namespace std;

void solve(){
  int n; cin >> n;

  vector<int> a(n);
  for(auto &x: a) cin >> x;

  sort(a.rbegin(), a.rend());

  if(a[0] == a[n - 1]) {cout << "NO\n"; return ;}

  swap(a[1], a[n - 1]);

  cout << "YES\n";
  for(auto &x: a) cout << x << ' ';
  cout << '\n';
}

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t; cin >> t;
  while(t--){
    solve();
  }

  return 0;
}
