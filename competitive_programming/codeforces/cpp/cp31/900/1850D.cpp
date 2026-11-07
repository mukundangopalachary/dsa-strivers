#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    int n, k;
    cin >> n >> k;

    vector<int> a(n);
    for (int &x : a)
      cin >> x;

    sort(a.begin(), a.end());

    int cnt = 1, longest = 1;

    for (int i = 1; i < n; i++) {
      if (a[i] - a[i - 1] <= k) {
        cnt++;
      } else {
        cnt = 1;
      }

      longest = max(longest, cnt);
    }

    cout << n - longest << '\n';
  }

  return 0;
}
