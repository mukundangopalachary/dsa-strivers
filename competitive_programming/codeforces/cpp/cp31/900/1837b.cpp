#include <bits/stdc++.h>

using namespace std;

void solve() {
  int n;
  string s;

  cin >> n >> s;

  int max_len = 1;
  int len = 1;
  for (int i = 1; i < n; i++) {
    if (s[i] == s[i - 1])
      len++;
    else
      len = 1;

    max_len = max(max_len, len);
  }

  cout << max_len + 1 << '\n';
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t; cin >> t;
  while(t--) solve();

  return 0;
}
