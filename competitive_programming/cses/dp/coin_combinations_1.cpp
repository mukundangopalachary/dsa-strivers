#include <iostream>
#include <vector>

using namespace std;

vector<int> coins, dp;
const int MOD = 1e9 + 7;

long long recursion(int cost) {
  if (cost < 0)
    return 0;
  if (cost == 0)
    return 1;

  if (dp[cost] != -1)
    return dp[cost];

  long long ways = 0;
  for (int coin : coins) {
    ways = (ways + recursion(cost - coin)) % MOD;
  }

  return dp[cost] = ways;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n, x;
  cin >> n >> x;

  coins.resize(n);
  for (int i = 0; i < n; i++)
    cin >> coins[i];

  dp.resize(x + 1, -1);

  int ans = recursion(x) % MOD;

  cout << ans;

  return 0;
}
