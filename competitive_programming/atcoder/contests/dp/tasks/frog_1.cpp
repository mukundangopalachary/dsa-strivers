#include <algorithm>
#include <cmath>
#include <iostream>
#include <vector>

using namespace std;

const int INF = 1e9;
int n;
vector<int> dp;

int solve(const vector<int> &h, int i) {
  if (i == n)
    return 0;
  if (dp[i] != -1)
    return dp[i];

  int cost1 = abs(h[i] - h[i + 1]) + solve(h, i + 1);
  int cost2 = (i + 2 <= n) ? abs(h[i] - h[i + 2]) + solve(h, i + 2) : INF;

  return dp[i] = min(cost1, cost2);
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> n;
  vector<int> h(n + 1);
  for (int i = 1; i <= n; i++)
    cin >> h[i];

  dp.assign(n + 1, -1);
  cout << solve(h, 1) << '\n';

  return 0;
}
