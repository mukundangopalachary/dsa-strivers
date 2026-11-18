#include <iostream>
#include <vector>

using namespace std;

const int MOD = 1e9 + 7;

vector<int> dp;
int n;

int backtrack(int curr) {
  if (curr > n)
    return 0;

  if (curr == n)
    return 1;

  if (dp[curr] != -1)
    return dp[curr];

  long long cost = 0;

  for (int i = 1; i <= 6; i++) {
    cost = (cost + backtrack(curr + i)) % MOD;
  }

  return dp[curr] = cost;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> n;

  dp.resize(n + 1, -1);

  cout << backtrack(0) << '\n';

  return 0;
}
