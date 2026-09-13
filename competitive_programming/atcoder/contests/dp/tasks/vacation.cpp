#include <iostream>
#include <vector>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;

  vector<vector<int>> dp(n + 1, vector<int>(3, 0));

  for (int i = 0; i < n; i++) {
    int a, b, c;
    cin >> a >> b >> c;

    dp[i + 1][0] = max(dp[i][1], dp[i][2]) + a;
    dp[i + 1][1] = max(dp[i][0], dp[i][2]) + b;
    dp[i + 1][2] = max(dp[i][0], dp[i][1]) + c;
  }

  cout << max(dp[n][0], max(dp[n][1], dp[n][2])) << '\n';
  return 0;
}
