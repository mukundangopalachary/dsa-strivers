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

    if (n == 1) {
      cout << 0 << '\n';
    } else {
      int count_3 = 0;
      int count_2 = 0;

      while (n > 0 || (n % 3) == 0) {
        count_3++;
        n /= 3;
      }

      while (n > 0 || (n % 2) == 0) {
        count_2++;
        n /= 2;
      }

      if (n > 1 || count_2 > count_3) {
        cout << -1 << '\n';
      } else {
        cout << count_3 + (count_3 - count_2) << '\n';
      }
    }
  }

  return 0;
}
