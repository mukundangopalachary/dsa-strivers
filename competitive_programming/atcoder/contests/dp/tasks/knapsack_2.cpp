#include <iostream>
#include <vector>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int N, W;
  cin >> N >> W;

  vector<long long> wt(N + 1, W + 1), v(N + 1);

  for (int i = 1; i <= N; i++) {
    cin >> wt[i] >> v[i];
  }

  long long V = 0;

  for (const auto &a : v)
    V += a;

  vector<long long> dp(V + 1);

  for (int i = 1; i <= V; i++) {
    for (int j = V; j >= v[i]; j--) {
      dp[j] = min(dp[j], dp[j - v[i]] + wt[i]);
    }
  }

  return 0;
}
