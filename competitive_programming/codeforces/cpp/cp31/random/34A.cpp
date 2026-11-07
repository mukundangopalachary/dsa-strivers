#include "bits/stdc++.h"
#include <cstdlib>
using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;

  vector<int> h(n);

  for(auto &x : h) cin >> x;

  int l = 0, r = n - 1, mini = abs(h[l] - h[r]);

  for(int i = 1; i < n; i++){
    if(mini > abs(h[i] - h[i - 1])){
      l = i - 1;
      r = i;
      mini = abs(h[i] - h[i - 1]);
    }
  }

  cout << l + 1 << ' ' << r + 1 << '\n';
  return 0;
}
