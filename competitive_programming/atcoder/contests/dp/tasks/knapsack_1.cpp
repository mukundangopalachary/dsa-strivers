#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int N, W;
  cin >> N >> W;

  vector<long long> wt(N + 1), v(N + 1), dp(W + 2, 0);

  for (int i = 1; i <= N; i++) {
    cin >> wt[i] >> v[i];
  }

  for (int i = 1; i <= N; i++) {
    for (int j = W; j >= wt[i]; j--) {
      dp[j] = max(dp[j], dp[j - wt[i]] + v[i]);
    }
  }

  cout << dp[W];
  return 0;
}
