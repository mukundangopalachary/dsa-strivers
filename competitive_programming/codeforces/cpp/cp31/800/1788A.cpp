#include <iostream>
#include <vector>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    int n;
    cin >> n;

    vector<int> arr(n);
    int total = 0;
    for (int i = 0; i < n; i++) {
      cin >> arr[i];
      if (arr[i] == 2)
        total++;
    }

    if (total % 2 != 0) {
      cout << -1 << '\n';
    } else {
      int left = 0;
      bool flag = false;
      int i;
      for (i = 0; i < n; i++) {
        if (arr[i] == 2) {
          left++;
          total--;
        }
        if (left - total == 0) {
          flag = true;
          break;
        }
      }

      if (flag) {
        cout << i + 1 << '\n';
      } else {
        cout << -1 << '\n';
      }
    }
  }
  return 0;
}
