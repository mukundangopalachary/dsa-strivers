#include <algorithm>
#include <climits>
#include <iostream>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    int n;
    cin >> n;

    long long arr[n];

    for (int i = 0; i < n; i++) {
      cin >> arr[i];
    }
    long long mini = INT_MAX;
    for (int i = 0; i < n - 1; i++) {
      mini = min(mini, arr[i + 1] - arr[i]);
    }

    if (mini < 0) {
      cout << 0 << '\n';
    } else {
      cout << (mini / 2) + 1 << '\n';
    }
  }

  return 0;
}
