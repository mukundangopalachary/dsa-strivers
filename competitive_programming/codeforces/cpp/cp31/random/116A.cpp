#include <bits/stdc++.h>

using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;

  int capacity = 0, maxi = 0;
  for(int i = 0; i < n; i++){
    int a,b; cin >> a >> b;

    capacity -= a;
    capacity += b;
    maxi = max(maxi, capacity);
  }

  cout << maxi << '\n';
  return 0;
}
