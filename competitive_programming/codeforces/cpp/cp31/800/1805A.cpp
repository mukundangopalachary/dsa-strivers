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

    long long xor_total = 0;

    for (int i = 0; i < n; i++) {
      long long tmp;
      cin >> tmp;
      xor_total ^= tmp;
    }

    if (xor_total == 0) {
      cout << xor_total << '\n';
    } else {
      if (n % 2 == 1) {
        cout << xor_total << '\n';
      } else {
        cout << -1 << '\n';
      }
    }
  }

  return 0;
}
