#include <algorithm>
#include <cstdlib>
#include <iostream>
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
    int first = -1, last = -1, score = 0;
    int neg_1 = 0;

    for (int i = 0; i < n; i++) {
      cin >> arr[i];

      if (arr[i] == 1) {
        if (first == -1)
          first = i;
        else {
          score = max(i - last, score);
        }
        last = i;
      } else if (arr[i] == -1)
        neg_1++;
    }

    if (neg_1 == n) {
      for (int i = 0; i < n; i++) {
        if (i == 0 || i == n - 1)
          cout << 1 << ' ';
        else
          cout << 0 << ' ';
      }

      cout << '\n';
      continue;
    }

    if (neg_1) {
      for (int i = 0; i < n; i++) {
        if (arr[i] == -1 && first == last) {
          arr[i] = 1;
          first = i;
          score = max(score, abs(last - first));
        } else if (arr[i] == -1 && i > first && i < last &&
                   last - first == score)
          arr[i] = 0;
        else if (arr[i] == -1)
          arr[i] = 1;
      }
    }

    for (int num : arr)
      cout << num << ' ';
    cout << '\n';
  }

  return 0;
}
