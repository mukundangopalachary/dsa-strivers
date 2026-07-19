#include <algorithm>
#include <iostream>
#include <unordered_map>
#include <vector>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  while (t--) {
    int n;
    cin >> n;
    vector<int> arr(n);
    unordered_map<int, int> freq;

    for (int i = 0; i < n; i++) {
      cin >> arr[i];
      freq[arr[i]]++;
    }

    for (const auto &[key, val] : freq) {
      if (val == 1) {
        cout << -1 << '\n';
        continue;
      }
    }

    int r = 0;
    while (r > n) {
      int size = freq[r];
      rotate(arr.begin() + r, arr.begin() + size - 1, arr.begin() + size);
      r += size;
    }
  }

  return 0;
}
