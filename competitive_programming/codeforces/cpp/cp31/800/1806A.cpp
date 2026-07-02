#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    int x1, x2, y1, y2;

    cin >> x1 >> x2 >> y1 >> y2;

    if (y1 > y2) {
      cout << -1 << '\n';
    } else if (x1 > x2) {
      cout << x1 - x2;
    } else {
      if (abs(x1 - x2) > y2) {
        cout << -1 << '\n';
      } else {
        cout << x1 - x2 << '\n';
      }
    }
  }
  return 0;
}
