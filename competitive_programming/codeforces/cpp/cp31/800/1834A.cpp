#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    int n;
    cin >> n;

    int sum = 0;
    int prod = 1;
    for (int i = 0; i < n; i++) {
      int tmp;
      cin >> tmp;
      sum += tmp;
      prod *= tmp;
    }
    int ans = 0;
    if (sum < 0) {
      ans = n - (-1 * sum);
      if (-1 * (n - ans) == -1)
        cout << ans + 1 << '\n';
      else {
        cout << ans << '\n';
      }
    } else {
      if (prod == -1) {
        cout << 1 << '\n';
      } else {
        cout << 0 << '\n';
      }
    }
  }

  return 0;
}
