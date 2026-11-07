#include <bits/stdc++.h>

using namespace std;

int main(){
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  if(!(cin >> n)) return 0;

  double sum =0;
  for(int i = 0; i < n; i++){
    double x; cin >> x;
    sum += x / 100;
  }

  cout << (sum / n) * 100 << '\n';
  return 0;
}
