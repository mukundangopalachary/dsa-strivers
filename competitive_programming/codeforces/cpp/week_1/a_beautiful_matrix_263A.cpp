#include <cstdlib>
#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int row, col;

  for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
      int x;
      cin >> x;

      if (x == 1) {
        row = i;
        col = j;
      }
    }
  }

  cout << abs(row - 2) + abs(col - 2);
  return 0;
}
