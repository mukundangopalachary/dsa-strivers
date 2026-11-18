#include "bits/stdc++.h"
using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n; cin >> n;
  int best,worst;

  cin >> best;
  worst = best;
  int ans = 0;

  for(int i = 0; i < n - 1; i++){
    int x; cin >> x;
    if(x > best){
      best = x;
      ans++;
    }else if(x < worst){
      worst = x;
      ans++;
    }
  }

  cout << ans << '\n';
  return 0;
}
