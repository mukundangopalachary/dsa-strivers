#include <iostream>
using namespace std;

int main() {

  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int t;
  cin >> t;

  int cnt = 0;

  while (t--) {
    int a, b;
    cin >> a >> b;

    if (b - a >= 2)
      cnt++;
  }

  cout << cnt;
  return 0;
}
