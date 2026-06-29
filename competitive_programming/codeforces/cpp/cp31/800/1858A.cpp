#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    int a, b, c;
    cin >> a >> b >> c;

    if (a == b) {
      if (c % 2 == 1) {
        cout << "First\n";
        continue;
      } else {
        cout << "Second\n";
        continue;
      }
    }

    if (a > b) {
      cout << "First\n";
    } else
      cout << "Second\n";
  }

  return 0;
}
