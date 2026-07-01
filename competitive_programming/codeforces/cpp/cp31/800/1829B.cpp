#include <algorithm>
#include <climits>
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

    int count = 0;
    int mx = INT_MIN;

    for (int i = 0; i < n; i++) {
      int tmp;
      cin >> tmp;
      if (tmp == 1) {
        mx = max(mx, count);
        count = 0;
      } else
        count++;
    }

    mx = max(mx, count);
    cout << mx << '\n';
  }
  return 0;
}
