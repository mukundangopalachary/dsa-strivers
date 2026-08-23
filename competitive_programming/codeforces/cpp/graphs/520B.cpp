#include <iostream>
#include <queue>
#include <vector>

using namespace std;

int main() {

  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  long long n, m;

  cin >> n >> m;

  if (n >= m) {
    cout << n - m << '\n';
    return 0;
  }

  queue<long long> q;

  // We never need to explore beyond 2 * m.
  vector<bool> visited(2 * m + 1, false);

  q.push(n);
  visited[n] = true;

  int depth = 0;

  while (!q.empty()) {

    int size = q.size();

    while (size--) {

      long long num = q.front();
      q.pop();

      if (num == m) {
        cout << depth << '\n';
        return 0;
      }

      long long a = num - 1;
      long long b = num * 2;

      if (a >= 0 && !visited[a]) {
        visited[a] = true;
        q.push(a);
      }

      if (b <= 2 * m && !visited[b]) {
        visited[b] = true;
        q.push(b);
      }
    }

    depth++;
  }

  return 0;
}
