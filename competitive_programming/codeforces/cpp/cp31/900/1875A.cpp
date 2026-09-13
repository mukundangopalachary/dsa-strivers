#include <iostream>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);
  int t;
  cin >> t;

  while (t--) {
    int a, b, n;
    long long ans;

    cin >> a >> b >> n;
    ans = b;

    for (int i = 0; i < n; i++) {
      int x;
      cin >> x;

      ans += min(a - 1, x);
    }

    cout << ans << '\n';
  }

  return 0;
}
