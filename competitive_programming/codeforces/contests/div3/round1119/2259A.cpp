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
    string farm;
    cin >> farm;

    int i = 0, cnt = 0, ans = 0;

    while (i < n) {
      bool flag = false;
      while (cnt < k) {
        if (farm[i++] == '0')
          flag = true;
        cnt++;
      }

      if (!flag)
        ans++;
      cnt = 0;
    }

    cout << ans << '\n';
  }

  return 0;
}
