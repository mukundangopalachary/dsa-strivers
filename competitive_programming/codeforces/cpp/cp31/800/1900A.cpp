#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int in;
  cin >> in;

  while (in--) {
    int n; // no of cells
    cin >> n;

    string cells;
    cin >> cells;

    int min_moves = 0;
    bool flag = false;

    for (int i = 0; i < n - 2; i++) {
      if (cells[i] == '#') {
        continue;
      }

      if (cells[i + 1] == '.' && cells[i + 2] == '.') {
        flag = true;
        break;
      }

      min_moves++;
    }

    if (flag) {
      cout << 2 << "\n";
    } else {
      if (cells[n - 2] == '.')
        ++min_moves;
      if (cells[n - 1] == '.')
        ++min_moves;
      cout << min_moves << "\n";
    }
  }

  return 0;
}
