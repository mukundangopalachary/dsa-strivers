#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n, k;
  cin >> n >> k;

  pair<int, int> ans = {-1, -1};

  for (int i = 0; i < n; i++) {
    int x;
    cin >> x;

    int rounds = (x + k - 1) / k;

    if (rounds >= ans.first) {
      ans.first = rounds;
      ans.second = i;
    }
  }

  cout << ans.second + 1 << '\n';
  return 0;
}
