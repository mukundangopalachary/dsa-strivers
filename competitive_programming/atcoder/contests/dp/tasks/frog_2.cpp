#include <iostream>
#include <vector>

using namespace std;

vector<int> arr, dp;
int n, k;
const int INF = 1e9;

int solve_min(int idx) {

  if (idx == n)
    return 0;
  if (dp[idx] != -1)
    return dp[idx];

  int cost = INF;
  for (int j = 1; j <= k && idx + j <= n; j++) {
    cost = min(cost, abs(arr[idx] - arr[idx + j]) + solve_min(idx + j));
  }

  return dp[idx] = cost;
}

int main() {

  cin >> n >> k;

  arr.resize(n + 1, 0);
  dp.resize(n + 2, -1);

  for (int i = 1; i <= n; i++)
    cin >> arr[i];

  cout << solve_min(1);

  return 0;
}
