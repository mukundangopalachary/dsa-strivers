#include <algorithm>
#include <iostream>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;

  int dp[] = {0, 0, 0};

  for (int i = 0; i < n; i++) {

    int x;
    cin >> x;

    int next[3];

    next[0] = min({dp[0], dp[1], dp[2]}) + 1;

    if (x == 1 || x == 3) {
      next[1] = min(dp[0], dp[2]);
    } else
      next[1] = 1e9;

    if (x == 2 || x == 3) {
      next[2] = min(dp[0], dp[1]);
    } else
      next[2] = 1e9;

    dp[0] = next[0];
    dp[1] = next[1];
    dp[2] = next[2];
  }

  cout << min({dp[0], dp[1], dp[2]}) << '\n';
  return 0;
}
