#include <iostream>
#include <vector>

using namespace std;

vector<int> dp, coins;
const int MOD = 1e9 + 7;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n, x;
  cin >> n >> x;

  coins.resize(n);
  for (int i = 0; i < n; i++)
    cin >> coins[i];

  dp.resize(x + 1, 0);

  dp[0] = 1;

  for (auto coin : coins) {
    for (int i = coin; i <= x; i++)
      dp[i] = (dp[i] + dp[i - coin]) % MOD;
  }

  cout << dp[x] << '\n';

  return 0;
}
