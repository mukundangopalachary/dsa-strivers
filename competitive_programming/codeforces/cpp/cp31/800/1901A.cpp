#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int in;
  cin >> in;

  while (in--) {
    int n, x;
    cin >> n >> x;

    vector<int> arr;
    arr.push_back(0);
    while (n--) {
      int tmp;
      cin >> tmp;
      arr.push_back(tmp);
    }

    arr.push_back(x);
    n = arr.size();

    int maxi = 0;
    for (int i = 1; i < n; i++) {
      if (i == n - 1) {
        maxi = max(maxi, 2 * (arr[i] - arr[i - 1]));
      } else {
        maxi = max(maxi, arr[i] - arr[i - 1]);
      }
    }

    cout << maxi << "\n";
  }
  return 0;
}
