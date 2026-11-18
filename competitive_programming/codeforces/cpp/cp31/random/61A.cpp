#include "bits/stdc++.h"
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  string a, b;
  cin >> a >> b;

  int n = a.size();

  string ans = "";

  for (int i = 0; i < n; i++) {
    if (a[i] == b[i])
      ans += '0';
    else
      ans += '1';
  }

  cout << ans << '\n';
  return 0;
}
