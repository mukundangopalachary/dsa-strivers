#include <algorithm>
#include <iostream>
#include <map>
#include <vector>

using namespace std;

void solve() {
  int n;
  cin >> n;
  map<int, int> freq;
  for (int i = 0; i < n; i++) {
    int x;
    cin >> x;
    freq[x]++;
  }

  vector<int> result;

  vector<int> distinct;
  for (auto const &[val, count] : freq) {
    distinct.push_back(val);
  }
  sort(distinct.rbegin(), distinct.rend());

  bool added = true;
  while (added) {
    added = false;
    for (int val : distinct) {
      if (freq[val] > 0) {
        result.push_back(val);
        freq[val]--;
        added = true;
      }
    }
  }

  for (int i = 0; i < n; i++) {
    cout << result[i] << (i == n - 1 ? "" : " ");
  }
  cout << "\n";
}

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;
  while (t--) {
    solve();
  }
  return 0;
}
