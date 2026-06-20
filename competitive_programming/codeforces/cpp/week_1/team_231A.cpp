#include <iostream>
using namespace std;

int main() {

  ios::sync_with_stdio(true);
  cin.tie(nullptr);

  int t;
  cin >> t;

  int ans = 0;

  while (t--) {
    int cnt = 0;
    for (int i = 0; i < 3; i++) {
      int num;
      cin >> num;
      if (num)
        cnt++;
    }
    if (cnt > 1) {
      ans++;
    }
  }

  cout << ans;
  return 0;
}
