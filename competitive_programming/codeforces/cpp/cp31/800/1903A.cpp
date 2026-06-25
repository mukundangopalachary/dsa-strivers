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
    int n, k;
    cin >> n >> k;

    vector<long long> arr;
    for (int i = 0; i < n; i++) {
      int temp;
      cin >> temp;
      arr.push_back(temp);
    }

    vector<long long> cpy_arr = arr;
    sort(cpy_arr.begin(), cpy_arr.end());

    if (arr == cpy_arr || k > 1) {
      cout << "YES\n";
    } else {
      cout << "NO\n";
    }
  }
  return 0;
}
