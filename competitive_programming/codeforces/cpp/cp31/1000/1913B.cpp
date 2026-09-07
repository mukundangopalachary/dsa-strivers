#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    string s;
    cin >> s;

    int zeros = 0, ones = 0;

    for (auto &c : s) {
      if (c == '0')
        zeros++;
      else
        ones++;
    }

    if (ones == zeros) {
      cout << 0 << '\n';
      continue;
    }

    int n = s.size();

    int i = 0;

    for (; i < n; i++) {
      char c = s[i];
      if (c == '0') {
        if (ones == 0) {
          cout << n - i << '\n';
          break;
        }
        ones--;
      } else {
        if (zeros == 0) {
          cout << n - i << '\n';
          break;
        }
        zeros--;
      }
    }
  }

  return 0;
}
