#include <iostream>
using namespace std;

int main() {

  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  string stones;
  cin >> stones;

  int cnt = 0;
  for (int i = 0; i < stones.length() - 1; i++) {
    if (stones[i] == stones[i + 1])
      cnt++;
  }

  cout << cnt;
  return 0;
}
