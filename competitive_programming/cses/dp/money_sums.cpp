#include <iostream>
#include <vector>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;

  vector<int> a(n);

  long long sum = 0;
  for (int i = 0; i < n; i++) {
    cin >> a[i];
    sum += a[i];
  }

  vector<bool> dp(sum + 1, false);

  dp[0] = true;

  for (int coin : a) {
    for (int i = sum - coin; i >= 0; i--) {
      if (dp[i]) {
        dp[i + coin] = true;
      }
    }
  }

  int cnt = 0;
  for (int i = 1; i < sum + 1; i++)
    if (dp[i])
      cnt++;

  cout << cnt << '\n';
  for (int i = 1; i < sum + 1; i++) {
    if (dp[i])
      cout << i << ' ';
  }

  return 0;
}
