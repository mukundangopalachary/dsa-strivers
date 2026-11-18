#include <bits/stdc++.h>
using namespace std;

const int MOD = 1e9 + 7;

int n;
vector<vector<char>> mat;
vector<vector<long long>> dp;

long long solve(int r, int c) {
  if (r >= n || c >= n)
    return 0;

  if (mat[r][c] == '*')
    return 0;

  if (r == n - 1 && c == n - 1)
    return 1;

  if (dp[r][c] != -1)
    return dp[r][c];

  long long down = solve(r + 1, c);
  long long right = solve(r, c + 1);

  return dp[r][c] = (down + right) % MOD;
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  cin >> n;

  mat.assign(n, vector<char>(n));

  for (int r = 0; r < n; r++) {
    for (int c = 0; c < n; c++) {
      cin >> mat[r][c];
    }
  }

  dp.assign(n, vector<long long>(n, -1));

  cout << solve(0, 0) << '\n';
}
