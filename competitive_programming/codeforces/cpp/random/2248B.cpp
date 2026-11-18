#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    int n, m;
    cin >> n >> m;

    if (n < m) {
      cout << "NO\n";
      continue;
    }

    vector<int> a(n), b(m);
    for (int i = 0; i < n; i++)
      cin >> a[i];
    for (int i = 0; i < m; i++)
      cin >> b[i];

    sort(a.begin(), a.end());
    sort(b.begin(), b.end());

    if (a == b) {
      cout << "YES\n";
      continue;
    }

    if (a[n - 1] < b[m - 1] || a[0] > b[0]) {
      cout << "NO\n";
      continue;
    }

    int j = m - 1;
    bool no = false;
    for (int i = n - 1; i >= 0 && j >= 0; i = i - 2) {
      if (!(a[i] >= b[j] && b[j] >= a[i - 1])) {
        cout << "NO\n";
        no = true;
        break;
      }
      j--;
    }

    if (no)
      continue;
    else
      cout << "YES\n";
  }
  return 0;
}
