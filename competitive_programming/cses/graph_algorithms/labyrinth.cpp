#include <algorithm>
#include <iostream>
#include <queue>
#include <vector>

using namespace std;

int main() {

  int n, m;

  cin >> n >> m;

  vector<vector<char>> mat(n, vector<char>(m, '#')),
      parent(n, vector<char>(m, ' '));

  queue<pair<int, int>> q;

  for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
      cin >> mat[i][j];
      if (mat[i][j] == 'A')
        q.push({i, j});
    }
  }

  int x[] = {0, 0, 1, -1};
  int y[] = {1, -1, 0, 0};
  char dir[] = {'R', 'L', 'D', 'U'};

  int sx, sy;
  bool flag = false;

  while (!q.empty()) {
    auto node = q.front();
    q.pop();

    for (int i = 0; i < 4; i++) {
      int dx = node.first + x[i];
      int dy = node.second + y[i];

      if (dx < 0 || dy < 0 || dx >= n || dy >= m)
        continue;

      if (mat[dx][dy] == 'B') {
        sx = dx, sy = dy;
        parent[dx][dy] = dir[i];
        flag = true;
      }

      if (mat[dx][dy] == '.') {
        mat[dx][dy] = '#';
        parent[dx][dy] = dir[i];
        q.push({dx, dy});
      }
    }

    if (flag)
      break;
  }

  if (!flag) {
    cout << "NO\n";
    return 0;
  }

  string ans;

  while (mat[sx][sy] != 'A') {
    char d = parent[sx][sy];

    ans += d;

    if (d == 'R')
      sy--;
    else if (d == 'L')
      sy++;
    else if (d == 'D')
      sx--;
    else
      sx++;
  }

  reverse(ans.begin(), ans.end());
  cout << "YES\n";
  cout << ans.size() << '\n';
  cout << ans;

  return 0;
}
