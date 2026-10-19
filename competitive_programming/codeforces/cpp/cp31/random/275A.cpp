#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int arr[3][3];

  for (int i = 0; i < 3; i++)
    for (int j = 0; j < 3; j++)
      cin >> arr[i][j];

  int dx[] = {0, 0, 0, 1, -1};
  int dy[] = {0, 1, -1, 0, 0};

  for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
      int toggles = 0;

      for (int k = 0; k < 5; k++) {
        int x = i + dx[k];
        int y = j + dy[k];

        if (x >= 0 && x < 3 && y >= 0 && y < 3)
          toggles += arr[x][y];
      }

      cout << (toggles % 2 == 0 ? 1 : 0) << ' ';
    }
    cout << '\n';
  }

  return 0;
}
