#include <iostream>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    long long a, b, c;
    cin >> a >> b >> c;

    long long diff = abs(a - b);

    if (a > b) {
      cout << (a + c) - b << '\n';
      continue;
    } else if ((a + c) - b > diff) {
      cout << (a + c) - b << '\n';
    } else
      cout << diff << '\n';
  }

  return 0;
}
