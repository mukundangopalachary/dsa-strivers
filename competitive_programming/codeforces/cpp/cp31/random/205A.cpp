#include <bits/stdc++.h>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n;
  cin >> n;

  vector<int> a(n);
  int mini = INT_MAX;

  for (auto &x : a) {
    cin >> x;
    mini = min(mini, x);
  }

  int freq = count(a.begin(), a.end(), mini);

  if (freq > 1) {
    cout << "Still Rozdil\n";
  } else {
    cout << find(a.begin(), a.end(), mini) - a.begin() + 1 << '\n';
  }

  return 0;
}
