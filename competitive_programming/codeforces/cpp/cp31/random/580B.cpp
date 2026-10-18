#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  long long n, max_diff;
  cin >> n >> max_diff;

  //{{money1, friendship_factor1}.....n}
  vector<pair<long long, long long>> friends(n);

  for (int i = 0; i < n; i++)
    cin >> friends[i].first >> friends[i].second;

  sort(friends.begin(), friends.end());

  long long res = 0, sum = 0, l = 0;

  for (int r = 0; r < n; r++) {
    sum += friends[r].second;

    while (friends[r].first - friends[l].first >= max_diff) {
      sum -= friends[l].second;
      l++;
    }

    res = max(res, sum);
  }

  cout << res << '\n';
  return 0;
}
