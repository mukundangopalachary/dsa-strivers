#include <algorithm>
#include <climits>
#include <iostream>
using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  unsigned int n;
  cin >> n;

  int mini = INT_MAX;

  for (int i = 0; i < n; i++) {
    int tmp;
    cin >> tmp;
    mini = min(mini, abs(tmp));
  }

  cout << mini;
  return 0;
}
