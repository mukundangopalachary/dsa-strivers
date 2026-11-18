#include <algorithm>
#include <iostream>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    int n, k;
    cin >> n >> k;

    int min_ops = k;
    int even_count = 0;

    for (int i = 0; i < n; i++) {
      int x;
      cin >> x;

      if (x % 2 == 0) {
        even_count++;
      }

      int rem = x % k;
      int ops = (rem == 0) ? 0 : (k - rem);
      min_ops = min(min_ops, ops);
    }

    if (k == 4) {
      int ops_using_evens = max(0, 2 - even_count);
      min_ops = min(min_ops, ops_using_evens);
    }

    cout << min_ops << '\n';
  }

  return 0;
}
