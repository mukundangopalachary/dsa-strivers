#include <algorithm>
#include <iostream>
#include <vector>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  vector<int> arr;
  while (t--) {
    int tmp;
    cin >> tmp;
    arr.push_back(tmp);
  }

  sort(arr.begin(), arr.end());

  for (int i = 0; i < arr.size(); i++) {
    cout << arr[i] << " ";
  }

  cout << "\n";
  return 0;
}
