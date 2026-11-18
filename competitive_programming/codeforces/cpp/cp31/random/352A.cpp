#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;

  int cnt = 0, zero = 0;

  for (int i = 0; i < n; i++) {
    int x;
    cin >> x;

    if (x == 5)
      cnt++;
    else
      zero++;
  }

  cnt -= cnt % 9;

  if (cnt == 0 || zero == 0) {
    if (zero > 0)
      cout << 0;
    else
      cout << -1;
  } else {
    while (cnt--)
      cout << 5;
    while (zero--)
      cout << 0;
  }

  cout << '\n';
  return 0;
}
