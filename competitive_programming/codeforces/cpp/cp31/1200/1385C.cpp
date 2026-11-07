#include "bits/stdc++.h"
#include <vector>
using namespace std;

void solve(){

  int n;
  cin >> n;

  vector<int> a(n);

  for(auto &x : a){
    cin >> x;
  }

  int i = n - 1;

  while(i > 0 && a[i - 1] >= a[i]){
    i--;
  }

  while(i > 0 && a[i - 1] <= a[i]) {
    i--;
  }

  cout << i << '\n';
}

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while(t--){
    solve();
  }
}
