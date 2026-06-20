#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int n, k;
  cin >> n >> k;

  int nums[n];
  int i = 0;
  while (i < n) {
    cin >> nums[i];
    i++;
  }
  int cnt = 0;
  for (int j = 0; j < n; j++) {
    if (nums[j] >= nums[k - 1] && nums[j])
      cnt++;
  }

  cout << cnt;
}
