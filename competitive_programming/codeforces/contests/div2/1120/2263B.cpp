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

    if (k < n || k > 2 * n - 1) {
      cout << -1 << '\n';
      continue;
    }

    vector<vector<int>> a(n, vector<int>(n, 0));

    int extra = k - n;

    int q = n - extra;

    for (int i = 0; i < n; i++) {
      a[i][i % q] = i + 1;
    }

    int val = n + 1;

    for (int j = q; j < n; j++) {
      a[0][j] = val++;
    }

    vector<bool> used(n * n + 1, false);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (a[i][j] != 0)
          used[a[i][j]] = true;
      }
    }

    val = 1;

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {

        if (a[i][j] != 0)
          continue;

        while (used[val])
          val++;

        a[i][j] = val;
        used[val] = true;
      }
    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        cout << a[i][j] << " ";
      }
      cout << '\n';
    }
  }
}
