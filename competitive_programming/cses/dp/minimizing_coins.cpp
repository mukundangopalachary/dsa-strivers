#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

const int INF = 1e9;
int n, x;
vector<int> coins, dp;

int solve(int rem) {
  if (rem == 0)
    return 0;
  if (rem < 0)
    return INF;
  if (dp[rem] != -1)
    return dp[rem];

  int min_coins = INF;
  for (int i = 0; i < n; i++) {
    if (rem - coins[i] >= 0) {
      min_coins = min(min_coins, 1 + solve(rem - coins[i]));
    }
  }

  return dp[rem] = min_coins;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> n >> x;
  coins.resize(n);
  dp.assign(x + 1, -1);

  for (int i = 0; i < n; i++)
    cin >> coins[i];

  int ans = solve(x);
  cout << (ans >= INF ? -1 : ans) << '\n';

  return 0;
}
