#include <iostream>
using namespace std;

int main() {

  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int in;
  cin >> in;

  while (in--) {
    int x, y;
    cin >> x >> y;

    if (x % 2 == 0 && y % 2 == 0) {
      cout << "YES\n";
      continue;
    }

    if (x % 2 == 0 || y % 2 == 0) {
      cout << "YES\n";
      continue;
    }

    cout << "NO\n";
  }
  return 0;
}
