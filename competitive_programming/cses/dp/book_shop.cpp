#include <iostream>
#include <vector>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n, x; // number of books, total price
  cin >> n >> x;

  vector<int> dp(x + 1, 0), price(n), pages(n);

  for (int i = 0; i < n; i++)
    cin >> price[i];
  for (int i = 0; i < n; i++)
    cin >> pages[i];

  for (int i = 1; i <= n; i++) {
    for (int j = x; j >= price[i - 1]; j--) {
      dp[j] = max(dp[j], dp[j - price[i - 1]] + pages[i - 1]);
    }
  }

  cout << dp[x];
  return 0;
}
